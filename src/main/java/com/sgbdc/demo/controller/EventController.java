package com.sgbdc.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgbdc.demo.event.Event;
import com.sgbdc.demo.event.EventRepository;
import com.sgbdc.demo.event.EventRequestDTO;
import com.sgbdc.demo.event.EventResponseDTO;

@RestController
@RequestMapping("event")
public class EventController {

    @Autowired
    private EventRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveEvent(@RequestBody EventRequestDTO data){
        Event eventdata = new Event(data);
        repository.save(eventdata);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<EventResponseDTO> getAllEvents(){
        List<EventResponseDTO> eventList = repository.findAll().stream().map(EventResponseDTO::new).toList();
        
        return eventList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public ResponseEntity<EventResponseDTO> updateEvent(@PathVariable Long id, @RequestBody EventRequestDTO eventData) {
        Optional<Event> optionalEvent = repository.findById(id);
    
        if (optionalEvent.isPresent()) {
            Event event = optionalEvent.get();
            event.setTitle(eventData.title());
            event.setImage(eventData.image());
            event.setPrice(eventData.price());
            event.setLocal(eventData.local());
            event.setDate(eventData.date());
        
            repository.save(event);
            return ResponseEntity.ok(new EventResponseDTO(event));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        Optional<Event> optionalEvent = repository.findById(id);
    
        if (optionalEvent.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}

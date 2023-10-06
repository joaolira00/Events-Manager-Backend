package com.sgbdc.demo.event;

public record EventResponseDTO(Long id, String title, String image, Integer price, String date, String local) {
    public EventResponseDTO(Event event) {
        this(event.getId(), event.getTitle(), event.getImage(), event.getPrice(), event.getDate(), event.getLocal());
    }
}

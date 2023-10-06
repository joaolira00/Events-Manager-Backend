package com.sgbdc.demo.event;

import jakarta.persistence.*;

@Table(name = "events")
@Entity(name = "events")
public class Event {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
    private String local;
    private String date;

    public Event() {
        // Construtor vazio
    }

    public Event(Long id, String title, String image, Integer price, String local, String date) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
        this.local = local;
        this.date = date;
    }

    // Getters e Setters para id, title, image, price, local, date
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Equals e HashCode para comparar objetos com base no id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id.equals(event.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public Event(EventRequestDTO data) {
        this.date = data.date();
        this.image = data.image();
        this.local = data.local();
        this.title = data.title();
        this.price = data.price();
    }
}

package com.projeto.douglas.controller;

import com.projeto.douglas.model.Event;
import com.projeto.douglas.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;


@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }
    @GetMapping
    public List<Event> getEventList(){
        return eventService.findAll();
    }

    @GetMapping("/{id_Event}")
    public ResponseEntity<Event> getEventById(@PathVariable("id_Event") long id_Event) throws Exception {
        return  ResponseEntity.ok(eventService.getById(id_Event).orElseThrow(() -> new NoSuchElementException("Registro não encontrado.")));
    }

    @PutMapping
    public Event updateEvent(@RequestBody Event event) {
        return eventService.updateEvent(event);
    }

    @DeleteMapping("/{id_Event}")
    public ResponseEntity<?> deleteByID(@PathVariable("id_Event") long id_Event) {
        try {
            eventService.deleteEvent(id_Event);
            return  ResponseEntity.ok().build();
        } catch (Exception e) {
            return  ResponseEntity.notFound().build();
        }
    }
}
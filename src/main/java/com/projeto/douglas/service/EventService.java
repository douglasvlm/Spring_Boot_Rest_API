package com.projeto.douglas.service;

import com.projeto.douglas.model.Event;
import com.projeto.douglas.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event saveEvent(Event event){
        return eventRepository.save(event);
    }

    public List<Event> findAll(){
        return eventRepository.findAll();
    }

    public Optional<Event> getById(long id_Event) { return  eventRepository.findById(id_Event); }

    public Event updateEvent(Event event){
        return eventRepository.save(event);
    }

    public void deleteEvent(long id_Event) {
        eventRepository.deleteById(id_Event);
    }
}
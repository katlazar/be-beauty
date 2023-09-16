package pl.sdacademy.booking.controller;

import pl.sdacademy.booking.repository.EventRepositoryImpl;
import pl.sdacademy.booking.service.EventService;

public class EventController {

    private final EventService eventService;

    public EventController() {
        // nienajlepsze rozwiazanie - skrot by moc zaprezentowac pseudo controller
        this.eventService = new EventService(new EventRepositoryImpl());
    }

    public void presentCatalog() {
        System.out.println("\n ----- TERMINARZ SESJI ----- ");

        eventService.findEvents().forEach(System.out::println);

        System.out.println(" ----- KONIEC TERMINARZA SESJI ----- ");
    }

}

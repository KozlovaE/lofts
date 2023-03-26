package ru.kisa.lofts;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class EventServiceTest {

    private ClientService clientService = new ClientService();
    private EventService eventService = new EventService();
    private
    LoftService loftService = new LoftService();

    @Test
    public void shouldCreateEventWithCorrectPrice(){
        Client client = clientService.client1;
        LoftModel loft = loftService.getLoftWithName("Банка");

        Event party = eventService.createEvent(
                client,
                loft,
                10,
                EventType.PARTY,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(10)
        );
      assertEquals(50000, party.priceEvent);
    }

    @Test
    public void shouldCreateWeddingEvent() {
        Client client = clientService.client2;
        LoftModel loft = loftService.getLoftWithName("Мираж");

        Event wedding = eventService.createEvent(
                client,
                loft,
                30,
                EventType.WEDDING,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(9)
        );
        assertEquals(EventType.WEDDING, wedding.eventType);
    }

    @Test
    public void shouldCreateWorkshopEvent() {
        Client client = clientService.client2;
        LoftModel loft = loftService.getLoftWithName("Мираж");

        Event  jopa = eventService.createEvent(
                client,
                loft,
                30,
                EventType.WORKSHOP,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(9)
        );
        assertEquals(EventType.WORKSHOP,  jopa.eventType);
    }
}
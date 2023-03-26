package ru.kisa.lofts;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EventService {

    private final AdminService adminService = new AdminService();
//
    public Event createEvent(Client client,
                             LoftModel loft,
                             int peopleCount,
                             EventType eventType,
                             LocalDateTime startTime,
                             LocalDateTime endTime) {
        int pricePerHour = loft.price.getHourPrice(peopleCount);
        int priceEvent = calculateEventPrice(startTime, endTime, pricePerHour);
        return new Event(loft,
                        peopleCount,
                        eventType,
                        priceEvent,
                        client,
                        startTime,
                        endTime,
                        adminService.getRandomAdmin());
    }

    private int calculateEventPrice(LocalDateTime startTime, LocalDateTime endTime, int pricePerHour) {
        int hours = (int) ChronoUnit.HOURS.between(startTime, endTime);
        return hours * pricePerHour;
    }
}

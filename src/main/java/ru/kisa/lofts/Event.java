package ru.kisa.lofts;

import java.time.LocalDateTime;

public class Event {
   final LoftModel loft;
   int peopleCount;
   final EventType eventType;
   int priceEvent;
   final Client client;
   LocalDateTime startTime;
   LocalDateTime endTime;
   Admin admin;

   public Event (LoftModel loft,
                 int peopleCount,
                 EventType eventType,
                 int priceEvent,
                 Client client,
                 LocalDateTime startTime,
                 LocalDateTime endTime,
                 Admin admin){
      this.loft = loft;
      this.peopleCount = peopleCount;
      this.eventType = eventType;
      this.priceEvent = priceEvent;
      this.client = client;
      this.startTime = startTime;
      this.endTime = endTime;
      this.admin = admin;
   }
}

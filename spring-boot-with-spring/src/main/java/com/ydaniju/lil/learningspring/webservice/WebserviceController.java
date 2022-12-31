package com.ydaniju.lil.learningspring.webservice;

import com.ydaniju.lil.learningspring.business.ReservationService;
import com.ydaniju.lil.learningspring.business.RoomReservation;
import com.ydaniju.lil.learningspring.data.Guest;
import com.ydaniju.lil.learningspring.data.Room;
import com.ydaniju.lil.learningspring.util.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebserviceController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public WebserviceController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = false) String dateString) {
        Date date = this.dateUtils.createDateFromDateString(dateString);

        return this.reservationService.getRoomReservationsForDate(date);
    }

    @GetMapping("/guests")
    public List<Guest> getGuests() {
        return this.reservationService.getAllGuests();
    }


    @PostMapping("/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public Guest createGuest(@RequestBody Guest guest) {
        return this.reservationService.addGuest(guest);
    }

    @GetMapping( "/rooms")
    public List<Room> listRooms() {
        return this.reservationService.getRooms();
    }
}

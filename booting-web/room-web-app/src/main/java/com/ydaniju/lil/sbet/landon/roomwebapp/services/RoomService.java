package com.ydaniju.lil.sbet.landon.roomwebapp.services;

import com.ydaniju.lil.sbet.landon.roomwebapp.models.Room;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class RoomService {
    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(UUID.randomUUID(), "Room " + i, "R" + i, "Q"));
        }
    }
    public static List<Room> getAllRooms() {
        return rooms;
    }
}

package com.ydaniju.lil.learningspring.util;

import com.ydaniju.lil.learningspring.data.Room;
import com.ydaniju.lil.learningspring.data.RoomRepository;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartupEvent implements ApplicationListener {
    private final RoomRepository roomRepository;

    public AppStartupEvent(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        Iterable<Room> rooms = this.roomRepository.findAll();

        rooms.forEach(System.out::println);
    }
}

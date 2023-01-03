package com.ydaniju.lil.sbet.landon.roomwebapp.controllers;

import com.ydaniju.lil.sbet.landon.roomwebapp.services.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", RoomService.getAllRooms());

        return "rooms";
    }
}

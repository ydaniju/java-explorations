package com.ydaniju.lil.sbet.landon.roomwebapp.controllers;

import com.ydaniju.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {
    private static List<StaffMember> staff = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            StaffMember staffMember = new StaffMember(i, "lastName" + i, "firstName " + i, "P" + i, "No" + i);
            staff.add(staffMember);
        }
    }

    @GetMapping
    public String getAllStaff(Model model) {
        model.addAttribute("staff", staff);
        return "staff";
    }
}

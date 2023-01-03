package com.ydaniju.lil.sbet.landon.roomwebapp.services;

import com.ydaniju.lil.sbet.landon.roomwebapp.models.StaffMember;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StaffService {
    private static List<StaffMember> staff = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            StaffMember staffMember = new StaffMember(UUID.randomUUID(), "lastName" + i, "firstName " + i, "P" + i, "No" + i);
            staff.add(staffMember);
        }
    }

    public static List<StaffMember> getAllStaff() {
        return staff;
    }
}

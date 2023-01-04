package com.ydaniju.lil.sbet.landon.roomwebapp.services;

import com.ydaniju.lil.sbet.landon.roomwebapp.models.Position;
import com.ydaniju.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class StaffService {
    private static final List<StaffMember> staff = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            StaffMember staffMember = new StaffMember(
                    UUID.randomUUID(),
                    "lastName" + i,
                    "firstName " + i,
                    Position.CONCIERGE,
                    "No" + i
            );
            staff.add(staffMember);
        }
    }

    public List<StaffMember> getAllStaff() {
        return staff;
    }
}

package com.ydaniju.lil.sbet.landon.roomwebapp.models;

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;


    public String toString() {
        switch (this) {
            case HOUSEKEEPING -> { return "Housekeeping"; }
            case FRONT_DESK -> { return "Fronted Desk"; }
            case SECURITY -> { return "Security"; }
            case CONCIERGE -> { return "Concierge"; }
            default -> { return ""; }
        }
    }
}

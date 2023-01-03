package com.ydaniju.lil.sbet.landon.roomwebapp.models;

public class StaffMember {
    private long id;
    private String lastName;
    private String firstName;
    private String position;
    private String employeeNumber;

    public StaffMember(long id, String lastName, String firstName, String position, String employeeNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.employeeNumber = employeeNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}

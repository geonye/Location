package com.gmail.rjsdp00;

public class UserProfile {
    public String name;
    public String phone;
    public String address;

    public UserProfile(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public  String toString(){
        return "UseProfile name" + name + ", phone" + phone + ", address" + address;
    }
}

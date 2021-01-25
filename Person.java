package com.company;

import java.util.ArrayList;

public class Person {
    private String name;
    private String phone;
    ArrayList<String> arr = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public  ArrayList<String> getArr() {
        return arr;
    }

    public void setArr(ArrayList<String> arr) {
        this.arr = arr;
    }

    Person(String _name, String _phone, ArrayList _arr) {
        this.name = _name;
        this.arr = _arr;
        arr.add(_phone);
    }

    Person(String _name, String _phone) {
        this.name = _name;
        this.arr = new ArrayList<>();
        arr.add(_phone);
    }

    Person(String _name) {
        this.name = _name;
        this.arr = new ArrayList<>();

    }}


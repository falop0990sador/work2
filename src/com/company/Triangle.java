package com.company;

public class Triangle extends Figure{
    private int age;
    private boolean available;
    @Override
    public void print() {
        System.out.println(age +"-"+ available);
    }
}

package com.luv2code.springdemo;

public class TestCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "This is a test of interface implementation!";
    }
}

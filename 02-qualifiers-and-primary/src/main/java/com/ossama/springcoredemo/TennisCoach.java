package com.ossama.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Train hard for 20 minutes..!";
    }
}

package com.ossama.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run hard a 15k!";
    }
}

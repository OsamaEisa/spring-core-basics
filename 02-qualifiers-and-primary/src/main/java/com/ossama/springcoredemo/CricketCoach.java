package com.ossama.springcoredemo;

import org.springframework.stereotype.Component;

// to mark the class as Spring Bean
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}

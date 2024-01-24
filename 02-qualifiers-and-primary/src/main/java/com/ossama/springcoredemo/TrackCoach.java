package com.ossama.springcoredemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
// to inject it as a primary class, no qualifier needed, and if so, the qualifier has the priority
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run hard a 15k!";
    }
}

package com.ossama.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // a private property for the dependency
    private Coach myCoach;
//    @Autowired
//    public DemoController(@Qualifier("tennisCoach") Coach theCoach) {
//        // @Qualifier: to specify which class to use
//        myCoach = theCoach;
//    }

    @Autowired
    public DemoController(Coach theCoach) {
        // @Qualifier: to specify which class to use
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

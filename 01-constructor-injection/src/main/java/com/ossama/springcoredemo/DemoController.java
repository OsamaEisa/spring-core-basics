package com.ossama.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // a private property for the dependency
    private Coach myCoach;
    @Autowired
    // tells Spring to inject the dependency, no need to write it if you have only 1 constructor
    public DemoController(Coach theCoach) {
        // a constructor for dep injection
        myCoach = theCoach;
    }

    /* ****************************** Setter Injection
    * @Autowired
    * public void setCoach(Coach theCoach) {
    *   myCoach = theCoach;
    * }
    *
    * NOTE: the method setCoach can be named as you want.
    * */

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

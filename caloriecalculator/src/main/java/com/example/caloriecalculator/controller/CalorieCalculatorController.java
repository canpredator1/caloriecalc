package com.example.caloriecalculator.controller;

import com.example.caloriecalculator.model.Activity;
import com.example.caloriecalculator.service.CalorieCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calories")
public class CalorieCalculatorController {

    @Autowired
    private CalorieCalculatorService calorieCalculatorService;

    @PostMapping("/calculate")
    public double calculateCalories(@RequestBody Activity activity) {
        return calorieCalculatorService.calculateCalories(
                activity.getActivityType(),
                activity.getWeight(),
                activity.getDuration()
        );
    }
}

package com.example.caloriecalculator.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CalorieCalculatorService {

    // MET values for different activities
    private static final Map<String, Double> MET_VALUES = Map.of(
            "Running", 9.8,
            "Cycling", 7.5,
            "Walking", 3.8
    );

    public double calculateCalories(String activityType, double weight, double duration) {
        double met = MET_VALUES.getOrDefault(activityType, 1.0); // Default MET for unknown activities
        return met * weight * duration;
    }
}


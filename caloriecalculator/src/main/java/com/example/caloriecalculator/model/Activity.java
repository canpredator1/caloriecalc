package com.example.caloriecalculator.model;

public class Activity {
    private String activityType; // e.g., "Running", "Cycling"
    private double weight;       // Weight in kilograms
    private double duration;     // Duration in hours

    // Getters and Setters
    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}

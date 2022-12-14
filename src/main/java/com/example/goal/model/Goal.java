package com.example.goal.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Goal {
    private int id;
    private String title;
    private String description;
    private double amount;
    private String goalDate;

    public Goal(){}

    public Goal(@JsonProperty("id") int id,
                @JsonProperty("title") String title,
                @JsonProperty("description") String description,
                @JsonProperty("amount") double amount,
                @JsonProperty("goalDate") String goalDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.amount = amount;
        this.goalDate = goalDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getGoalDate() {
        return goalDate;
    }

    public void setGoalDate(String goalDate) {
        this.goalDate = goalDate;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", goalDate='" + goalDate + '\'' +
                '}';
    }
}

package com.example.mjai37.database;

/**
 * Created by mjai37 on 1/21/2016.
 */
public class WaitingCustomer {
    private String name;
    private String cellNumber;
    private String totalPeople;
    private String waitingTime;
    private String estimatedWaitingTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(String totalPeople) {
        this.totalPeople = totalPeople;
    }

    public String getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(String waitingTime) {
        this.waitingTime = waitingTime;
    }

    public String getEstimatedWaitingTime() {
        return estimatedWaitingTime;
    }

    public void setEstimatedWaitingTime(String estimatedWaitingTime) {
        this.estimatedWaitingTime = estimatedWaitingTime;
    }
}

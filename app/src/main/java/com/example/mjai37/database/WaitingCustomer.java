package com.example.mjai37.database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by mjai37 on 1/21/2016.
 */

@DatabaseTable(tableName = "WAITING_CUSTOMER")
public class WaitingCustomer {

    @DatabaseField
    private String name;

    @DatabaseField
    private String cellNumber;

    @DatabaseField
    private String totalPeople;

    @DatabaseField
    private String waitingTime;

    @DatabaseField
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

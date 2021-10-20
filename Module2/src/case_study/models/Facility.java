package case_study.models;

import java.util.Date;

public abstract class Facility {
    private String serviceName;
    private int areaUsed;
    private int rentalCost;
    private int maxPeople;
    private Date typeOfRent;

    public Facility() {
    }

    public Facility(String serviceName, int areaUsed, int rentalCost, int maxPeople, Date typeOfRent) {
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.typeOfRent = typeOfRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(int areaUsed) {
        this.areaUsed = areaUsed;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public Date getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(Date typeOfRent) {
        this.typeOfRent = typeOfRent;
    }
}

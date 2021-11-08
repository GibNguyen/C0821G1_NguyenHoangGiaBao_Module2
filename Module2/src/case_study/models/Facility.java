package case_study.models;

public abstract class Facility {
    private String serviceName;
    private double areaUsed;
    private double rentalCost;
    private int maxPeople;
    private String typeOfRent;

    public Facility() {
    }

    public Facility(String serviceName, double areaUsed, double rentalCost, int maxPeople, String typeOfRent) {
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

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return this.serviceName+","+this.areaUsed+","+this.rentalCost+","+this.maxPeople+","+this.typeOfRent;
    }
}

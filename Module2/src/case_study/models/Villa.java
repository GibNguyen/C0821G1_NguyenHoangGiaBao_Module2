package case_study.models;

import java.util.Date;

public class Villa extends Facility{
    private String typeOfRoom;
    private int areaOfPool;
    private int numberOfFloor;

    public Villa(String serviceName, int areaUsed, int rentalCost, int maxPeople, Date typeOfRent, String typeOfRoom, int areaOfPool, int numberOfFloor) {
        super(serviceName, areaUsed, rentalCost, maxPeople, typeOfRent);
        this.typeOfRoom = typeOfRoom;
        this.areaOfPool = areaOfPool;
        this.numberOfFloor = numberOfFloor;
    }
    public Villa(){}

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(int areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}

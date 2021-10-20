package case_study.models;

import java.util.Date;

public class House extends Facility {
    private String typeOfRoom;
    private int numberOfFloor;

    public House(){

    }

    public House(String serviceName, int areaUsed, int rentalCost, int maxPeople, Date typeOfRent, String typeOfRoom, int numberOfFloor) {
        super(serviceName, areaUsed, rentalCost, maxPeople, typeOfRent);
        this.typeOfRoom = typeOfRoom;
        this.numberOfFloor = numberOfFloor;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}

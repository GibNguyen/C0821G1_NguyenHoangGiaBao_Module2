package case_study.models;

public class House extends Facility {
    private String typeOfRoom;
    private int numberOfFloor;

    public House(){

    }

    public House(String serviceName, double areaUsed, double rentalCost, int maxPeople, String typeOfRent, String typeOfRoom, int numberOfFloor) {
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

    @Override
    public String toString() {
        return super.toString()+","+this.typeOfRoom+","+this.numberOfFloor;
    }
}

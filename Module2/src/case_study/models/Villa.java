package case_study.models;

public class Villa extends Facility{
    private String typeOfRoom;
    private double areaOfPool;
    private int numberOfFloor;

    public Villa(String serviceName, double areaUsed, double rentalCost, int maxPeople, String typeOfRent, String typeOfRoom, double areaOfPool, int numberOfFloor) {
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

    public double getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(double areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return super.toString()+","+this.typeOfRoom+","+this.areaOfPool+","+this.numberOfFloor;
    }
}

package case_study.models;

public class Room extends Facility {
    private String freeService;

    public Room(){
    }

    public Room(String serviceName, double areaUsed, double rentalCost, int maxPeople, String typeOfRent, String freeService) {
        super(serviceName, areaUsed, rentalCost, maxPeople, typeOfRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}

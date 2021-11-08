package case_study.services;

import case_study.models.*;
import case_study.untils.ReadWriteFile;

import java.util.*;
import java.util.regex.Pattern;

public class FacilityService implements IFacilityService {
    Map<Facility, Integer> facilityList;
    public FacilityService() {
        facilityList = new LinkedHashMap<>();
    }
    public FacilityService(Map<Facility, Integer> facilityList) {
        this.facilityList = facilityList;
    }
    ReadWriteFile readWriteFile=new ReadWriteFile();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNewVilla() {
        System.out.println("Enter the name of Villa : ");
        String villaName = scanner.nextLine();
        while (!Pattern.matches("^[A-Z][a-z]+$", villaName)) {
            System.err.println("The name must contain the first capital letter.Please enter again ");
            villaName = scanner.nextLine();
        }
        double villaArea;
        do {
            System.out.println("Enter the area of villa : ");
            villaArea = Double.parseDouble(scanner.nextLine());
            if (villaArea < 30) {
                System.err.println("The area must over 30");
            }
        }
        while (villaArea < 30);
        double villaCost;
        do {
            System.out.println("Enter the cost of villa : ");
            villaCost = Double.parseDouble(scanner.nextLine());
            if (villaCost <= 0) {
                System.err.println("The cost must over 0");
            }
        }
        while (villaCost <= 0);
        int villaMaxPeople;
        do {
            System.out.println("Enter the max people of villa : ");
            villaMaxPeople = Integer.parseInt(scanner.nextLine());
            if (villaMaxPeople < 0 || villaMaxPeople > 20) {
                System.err.println("The max people must betwenn 0 and 20 ");
            }
        }
        while (villaMaxPeople < 0 || villaMaxPeople > 20);
        String rentType;
        do {
            System.out.println("What type do you want to rent (Year,Month,Day,Hour) : ");
            rentType = scanner.nextLine();
            if (!(rentType.toLowerCase().equals("year") || rentType.toLowerCase().equals("month") || rentType.toLowerCase().equals("day") || rentType.toLowerCase().equals("hour"))) {
                System.err.println("Please enter again");
            }
        }
        while (!(rentType.toLowerCase().equals("year") || rentType.toLowerCase().equals("month") || rentType.toLowerCase().equals("day") || rentType.toLowerCase().equals("hour")));
        String villaType;
        do {
            System.out.println("Enter the type of villa(France,Italy,China) : ");
             villaType = scanner.nextLine();
             if(!(villaType.toLowerCase().equals("france")||villaType.toLowerCase().equals("italy")||villaType.toLowerCase().equals("china"))){
                 System.out.println("Enter again");
            }
        }
        while (!(villaType.toLowerCase().equals("france")||villaType.toLowerCase().equals("italy")||villaType.toLowerCase().equals("china")));
        double poolArea;
        do {
            System.out.println("Enter the pool area of villa : ");
            poolArea = Double.parseDouble(scanner.nextLine());
            if (poolArea < 30) {
                System.err.println("The pool area must over 30");
            }
        }
        while (poolArea < 30);
        int villaFloor;
        do {
            System.out.println("Enter the floor of villa : ");
            villaFloor = Integer.parseInt(scanner.nextLine());
            if (villaFloor <= 0) {
                System.err.println("The floor must over 0 ");
            }
        }
        while (villaFloor <= 0);
        Villa villa = new Villa(villaName, villaArea, villaCost, villaMaxPeople, rentType, villaType, poolArea, villaFloor);
        facilityList.put(villa, 0);
        readWriteFile.writeMap("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\case_study\\data\\Facility",facilityList);
        System.out.println("Add Successful");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter the name of House: ");
        String houseName = scanner.nextLine();
        while (!Pattern.matches("^[A-Z][a-z]+$", houseName)) {
            System.out.println("The name must contain the first capital letter.Please enter again ");
            houseName = scanner.nextLine();
        }
        double houseArea;
        do {
            System.out.println("Enter the area of House : ");
            houseArea = Double.parseDouble(scanner.nextLine());
            if (houseArea < 30) {
                System.err.println("The area must over 30");
            }
        }
        while (houseArea < 30);
        double houseCost;
        do {
            System.out.println("Enter the cost of house : ");
            houseCost = Double.parseDouble(scanner.nextLine());
            if (houseCost <= 0) {
                System.err.println("The cost must over 0");
            }
        }
        while (houseCost <= 0);
        int houseMaxPeople;
        do {
            System.out.println("Enter the max people of house : ");
            houseMaxPeople = Integer.parseInt(scanner.nextLine());
            if (houseMaxPeople < 0 || houseMaxPeople > 20) {
                System.err.println("The max people must betwenn 0 and 20 ");
            }
        }
        while (houseMaxPeople < 0 || houseMaxPeople > 20);
        String rentType;
        do {
            System.out.println("What type do you want to rent (Year,Month,Day,Hour) : ");
            rentType = scanner.nextLine();
            if (!(rentType.toLowerCase().equals("year") || rentType.toLowerCase().equals("month") || rentType.toLowerCase().equals("day") || rentType.toLowerCase().equals("hour"))) {
                System.err.println("Please enter again");
            }
        }
        while (!(rentType.toLowerCase().equals("year") || rentType.toLowerCase().equals("month") || rentType.toLowerCase().equals("day") || rentType.toLowerCase().equals("hour")));
        String houseType;
        do {
            System.out.println("Enter the type of house(France,Italy,China) : ");
            houseType = scanner.nextLine();
            if(!(houseType.toLowerCase().equals("france")||houseType.toLowerCase().equals("italy")||houseType.toLowerCase().equals("china"))){
                System.out.println("Enter again");
            }
        }
        while (!(houseType.toLowerCase().equals("france")||houseType.toLowerCase().equals("italy")||houseType.toLowerCase().equals("china")));
        int houseFloor;
        do {
            System.out.println("Enter the floor of house : ");
            houseFloor = Integer.parseInt(scanner.nextLine());
            if (houseFloor <= 0) {
                System.err.println("The floor must over 0 ");
            }
        }
        while (houseFloor <= 0);
        House house = new House(houseName, houseArea, houseCost, houseMaxPeople, rentType, houseType, houseFloor);
        facilityList.put(house, 0);
        readWriteFile.writeMap("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\case_study\\data\\Facility",facilityList);
        System.out.println("Add Successful");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter the name of Room : ");
        String roomName = scanner.nextLine();
        while (!Pattern.matches("^[A-Z][a-z]+$", roomName)) {
            System.out.println("The name must contain the first capital letter.Please enter again ");
            roomName = scanner.nextLine();
        }
        double roomArea;
        do {
            System.out.println("Enter the area of room : ");
            roomArea = Double.parseDouble(scanner.nextLine());
            if (roomArea < 30) {
                System.err.println("The area must over 30");
            }
        }
        while (roomArea < 30);
        double roomCost;
        do {
            System.out.println("Enter the cost of room : ");
            roomCost = Double.parseDouble(scanner.nextLine());
            if (roomCost <= 0) {
                System.err.println("The cost must over 0");
            }
        }
        while (roomCost <= 0);
        int roomMaxPeople;
        do {
            System.out.println("Enter the max people of room : ");
            roomMaxPeople = Integer.parseInt(scanner.nextLine());
            if (roomMaxPeople < 0 || roomMaxPeople > 20) {
                System.err.println("The max people must betwenn 0 and 20 ");
            }
        }
        while (roomMaxPeople < 0 || roomMaxPeople > 20);
        String rentType;
        do {
            System.out.println("What type do you want to rent (Year,Month,Day,Hour) : ");
            rentType = scanner.nextLine();
            if (!(rentType.toLowerCase().equals("year") || rentType.toLowerCase().equals("month") || rentType.toLowerCase().equals("day") || rentType.toLowerCase().equals("hour"))) {
                System.err.println("Please enter again");
            }
        }
        while (!(rentType.toLowerCase().equals("year") || rentType.toLowerCase().equals("month") || rentType.toLowerCase().equals("day") || rentType.toLowerCase().equals("hour")));
        System.out.println("Enter the free service of Room : ");
        String roomFreeService = scanner.nextLine();
        Room room = new Room(roomName, roomArea, roomCost, roomMaxPeople, rentType, roomFreeService);
        facilityList.put(room, 0);
        readWriteFile.writeMap("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\case_study\\data\\Facility",facilityList);
        System.out.println("Add Successful");
    }

    @Override
    public void displayListFacility() {
        facilityList = new HashMap<>();
        readWriteFile.readMap("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\case_study\\data\\Facility",facilityList);
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            System.out.println(facility.getKey().toString());
        }
    }

    @Override
    public void displayMaintenanceFacility() {

    }
}

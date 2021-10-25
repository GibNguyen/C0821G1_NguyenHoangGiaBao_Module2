package review.candidates_manager.controller;

import review.candidates_manager.models.Candidates;

import review.candidates_manager.models.ExperienceCandicate;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Candidates> candidateList= new ArrayList<>();
        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM" + "\n" +
                    "1.Experience" + "\n" +
                    "2.Fresher" + "\n" +
                    "3.Internship" + "\n" +
                    "4.Searching" + "\n" +
                    "5.Exit" + "\n"+
                    "(Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program).");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Enter the ID ");
                    int experienceId= Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the first name ");
                    String experienceFirstName = scanner.nextLine();
                    System.out.println("Enter the last name ");
                    String experienceLastName = scanner.nextLine();
                    System.out.println("Enter the date of birth ");
                    int experienceDateOfBirth = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the address ");
                    String experienceAddress = scanner.nextLine();
                    System.out.println("Enter the phone ");
                    int experiencePhone = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the email ");
                    String experienceEmail = scanner.nextLine();
                    ExperienceCandicate experienceCandicate = new ExperienceCandicate(experienceId,experienceFirstName,experienceLastName,experienceDateOfBirth,experienceAddress,experiencePhone,experienceEmail);
                    candidateList.add(experienceCandicate);
                    for(int i=0;i<candidateList.size();i++){
                        System.out.println(candidateList.get(i).getiD()+candidateList.get(i).getFirstName());
                    }
                    break;
                case 2:
                    System.out.println("Enter the ID ");
                    int fresherId= Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the first name ");
                    String fresherFirstName = scanner.nextLine();
                    System.out.println("Enter the last name ");
                    String fresherLastName = scanner.nextLine();
                    System.out.println("Enter the date of birth ");
                    int fresherDateOfBirth = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the address ");
                    String fresherAddress = scanner.nextLine();
                    System.out.println("Enter the phone ");
                    int fresherPhone = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the email ");
                    String fresherEmail = scanner.nextLine();
                    ExperienceCandicate fresherCandicate = new ExperienceCandicate(fresherId,fresherFirstName,fresherLastName,fresherDateOfBirth,fresherAddress,fresherPhone,fresherEmail);
//                    candidateList.addCandicate(fresherCandicate);
                    System.out.println(candidateList);
                    break;
                case 3:
                    System.out.println("Enter the ID ");
                    int internshipId= Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the first name ");
                    String internshipFirstName = scanner.nextLine();
                    System.out.println("Enter the last name ");
                    String internshipLastName = scanner.nextLine();
                    System.out.println("Enter the date of birth ");
                    int internshipDateOfBirth = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the address ");
                    String internshipAddress = scanner.nextLine();
                    System.out.println("Enter the phone ");
                    int internshipPhone = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the email ");
                    String internshipEmail = scanner.nextLine();
                    ExperienceCandicate internshipCandicate = new ExperienceCandicate(internshipId,internshipFirstName,internshipLastName,internshipDateOfBirth,internshipAddress,internshipPhone,internshipEmail);
//                    candidateList.addCandicate(internshipCandicate);
                    System.out.println(candidateList);
                    break;
            }
        }
    }
}

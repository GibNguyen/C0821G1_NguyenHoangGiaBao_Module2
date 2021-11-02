package review.candidates_manager.controller;

import review.candidates_manager.models.Candidates;

import review.candidates_manager.models.ExperienceCandicate;
import review.candidates_manager.services.CandidateService;


import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandidateService candidateService = new CandidateService();
        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM" + "\n" +
                    "1.Experience" + "\n" +
                    "2.Fresher" + "\n" +
                    "3.Internship" + "\n" +
                    "4.Searching" + "\n" +
                    "5.Exit" + "\n" +
                    "(Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program).");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    candidateService.creatExperienceCandidate();
                    candidateService.showAll();
                    break;
                case 2:
                    candidateService.creatFresherCandidate();
                    candidateService.showAll();
                    break;
                case 3:
                    candidateService.creatInternCandidate();
                    candidateService.showAll();
                    break;
                case 4:
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}

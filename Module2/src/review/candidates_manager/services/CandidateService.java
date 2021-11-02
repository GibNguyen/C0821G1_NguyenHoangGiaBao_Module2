package review.candidates_manager.services;

import review.candidates_manager.models.Candidates;
import review.candidates_manager.models.ExperienceCandicate;
import review.candidates_manager.models.FresherCandidate;
import review.candidates_manager.models.InternCandidate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CandidateService implements ICandidateService {

    Scanner scanner = new Scanner(System.in);
    List candidatesList = new ArrayList<>();
    ReadAndWrite readAndWrite = new ReadAndWrite();


    @Override
    public void creatExperienceCandidate() {
        System.out.println("Nhập id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập first name  :");
        String firstName = scanner.nextLine();
        System.out.println("Nhập last name  :");
        String lastName = scanner.nextLine();
        System.out.println("Nhập địa chỉ :");
        String address = scanner.nextLine();
        System.out.println("Nhập năm sinh ");
        int birthDay = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại : ");
        String phone = scanner.nextLine();
        while (!Pattern.matches("^[0-9]{10}$", phone)) {
            System.out.println("Bạn đã nhập sai. Xin mời nhập lại số điện thoại");
            phone = scanner.nextLine();
        }
        System.out.println("Nhập email  : ");
        String email = scanner.nextLine();
        System.out.println("Nhập số năm kinh nghiệm");
        int experienceYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kĩ năng của ứng viên :");
        String proSkill = scanner.nextLine();
        System.out.println("Bạn có muốn tiếp tục (Y/N) ");
        String choice = scanner.nextLine();
        if (choice.equals("Y")) {
            Candidates experienceCandicate = new ExperienceCandicate(id, firstName, lastName, birthDay, address, phone, email, experienceYear, proSkill);
            readAndWrite.writeFile(experienceCandicate);
            System.out.println("Hoàn thành !");
        }
    }

    @Override
    public void creatFresherCandidate() {
        System.out.println("Nhập id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập first name  :");
        String firstName = scanner.nextLine();
        System.out.println("Nhập last name  :");
        String lastName = scanner.nextLine();
        System.out.println("Nhập địa chỉ :");
        String address = scanner.nextLine();
        System.out.println("Nhập năm sinh ");
        int birthDay = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại : ");
        String phone = scanner.nextLine();
        while (!Pattern.matches("^[0-9]{10}$", phone)) {
            System.out.println("Bạn đã nhập sai. Xin mời nhập lại số điện thoại");
            phone = scanner.nextLine();
        }
        System.out.println("Nhập email  : ");
        String email = scanner.nextLine();
        System.out.println("Nhập năm tốt nghiệp");
        int graduationTime = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập loại tốt nghiệp :");
        String graduationRank = scanner.nextLine();
        System.out.println("Bạn tốt nghiệp ở trường nào :");
        String education = scanner.nextLine();
        System.out.println("Bạn có muốn tiếp tục (Y/N) ");
        String choice = scanner.nextLine();
        if (choice.equals("Y")) {
            FresherCandidate fresherCandidate = new FresherCandidate(id, firstName, lastName, birthDay, address, phone, email, graduationTime, graduationRank, education);
            readAndWrite.writeFile(fresherCandidate);

            System.out.println("Hoàn thành !");
        }

    }

    @Override
    public void creatInternCandidate() {
        System.out.println("Nhập id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập first name  :");
        String firstName = scanner.nextLine();
        System.out.println("Nhập last name  :");
        String lastName = scanner.nextLine();
        System.out.println("Nhập địa chỉ :");
        String address = scanner.nextLine();
        System.out.println("Nhập năm sinh ");
        int birthDay = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại : ");
        String phone = scanner.nextLine();
        while (!Pattern.matches("^[0-9]{10}$", phone)) {
            System.out.println("Bạn đã nhập sai. Xin mời nhập lại số điện thoại");
            phone = scanner.nextLine();
        }
        System.out.println("Nhập email  : ");
        String email = scanner.nextLine();
        System.out.println("Bạn học ngành nào ");
        String major = scanner.nextLine();
        System.out.println("Bạn ở khóa năm nào :");
        int semester = Integer.parseInt(scanner.nextLine());
        System.out.println("Bạn đang học ở trường nào ");
        String universityName = scanner.nextLine();
        System.out.println("Bạn có muốn tiếp tục (Y/N) ");
        String choice = scanner.nextLine();
        if (choice.equals("Y")) {
            InternCandidate internCandidate = new InternCandidate(id, firstName, lastName, birthDay, address, phone, email, major, semester, universityName);
            readAndWrite.writeFile(internCandidate);
            System.out.println("Hoàn thành !");
        }
    }

    @Override
    public void searchCandidates() {

    }

    @Override
    public void showAll() {
        candidatesList = readAndWrite.readFile();
        for (int i = 0; i < candidatesList.size(); i++) {
            System.out.println(candidatesList.get(i));
        }
    }
}

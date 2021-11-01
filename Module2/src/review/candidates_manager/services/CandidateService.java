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

    Scanner scanner=new Scanner(System.in);
    List<Candidates> candidatesList=new ArrayList<>();
    FileWriter fileWriter= null;

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
        while (true) {
            try {

                if (birthDay< 1900 || birthDay > 2021) {
                    System.out.println("Năm sinh không hợp lệ. Xin nhập lại ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Dữ liệu nhập vào không phải là số. Vui lòng nhập lại : ");
            }
        }
        System.out.println("Nhập số điện thoại : ");
        String phone = scanner.nextLine();
        while(!Pattern.matches("^[0-9]{10}$",phone)){
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
            try {
                fileWriter = new FileWriter("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\review\\candidates_manager\\data\\Candidates",true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            try {
                bufferedWriter.write(experienceCandicate.toString());
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
        while (true) {
            try {

                if (birthDay< 1900 || birthDay > 2021) {
                    System.out.println("Năm sinh không hợp lệ. Xin nhập lại ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Dữ liệu nhập vào không phải là số. Vui lòng nhập lại : ");
            }
        }
        System.out.println("Nhập số điện thoại : ");
        String phone = scanner.nextLine();
        while(!Pattern.matches("^[0-9]{10}$",phone)){
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
            FresherCandidate fresherCandidate=new FresherCandidate(id, firstName, lastName, birthDay, address, phone, email, graduationTime, graduationRank,education);
            try {
                fileWriter = new FileWriter("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\review\\candidates_manager\\data\\Candidates",true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            try {
                bufferedWriter.write(fresherCandidate.toString());
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
        while (true) {
            try {

                if (birthDay< 1900 || birthDay > 2021) {
                    System.out.println("Năm sinh không hợp lệ. Xin nhập lại ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Dữ liệu nhập vào không phải là số. Vui lòng nhập lại : ");
            }
        }
        System.out.println("Nhập số điện thoại : ");
        String phone = scanner.nextLine();
        while(!Pattern.matches("^[0-9]{10}$",phone)){
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
            InternCandidate internCandidate=new InternCandidate(id, firstName, lastName, birthDay, address, phone, email, major, semester,universityName);
            try {
                fileWriter = new FileWriter("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\review\\candidates_manager\\data\\Candidates",true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            try {
                bufferedWriter.write(internCandidate.toString());
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Hoàn thành !");
        }
    }

    @Override
    public void searchCandidates() {

    }

    @Override
    public void showAll() {
        for (Candidates candidate : candidatesList) {
            System.out.println(candidate.toString());
        }
    }

//    @Override
//    public void writeFile(FileWriter fileWriter,Candidates candidates) {
//        try {
//            fileWriter = new FileWriter("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\review\\candidates_manager\\data\\Candidates",true);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
//        try {
//            bufferedWriter.write(candidates.toString());
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    public List readFile() {
//        try {
//            FileReader fileReader = new FileReader("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\review\\candidates_manager\\data\\Candidates");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//            while((line=bufferedReader.readLine())!=null){
//                String[] candidates = line.split(",");
//                Candidates candidates1=new Candidates(Integer.parseInt(candidates[0]),candidates[1],candidates[2],Integer.parseInt(candidates[3]),candidates[4],candidates[5],candidates[6]);
//                candidatesList.add(candidates1);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return candidatesList;
//    }
}

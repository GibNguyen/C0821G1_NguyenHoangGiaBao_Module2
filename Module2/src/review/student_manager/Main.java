package review.student_manager;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("-----Hệ thống quản lý sinh viên------" + "\n" +
                    "1.Thêm sinh viên" + "\n" +
                    "2.Xóa sinh viên" + "\n" +
                    "3.Sửa thông tin sinh viên" + "\n" +
                    "4.Xem danh sách sinh viên" + "\n" +
                    "5.Kiểm tra sinh viên có trong danh sách" + "\n" +
                    "6.Sắp xếp danh sách sinh viên(Theo điểm số)" + "\n" +
                    "7.Thoát" + "\n");

            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn nhập vị trí sinh viên: ");
                    int index = Integer.parseInt(input.nextLine());
                    System.out.println("Mời bạn nhập ID: ");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.println("Mời bạn nhập tên: ");
                    String name = input.nextLine();
                    System.out.println("Mời bạn nhập địa chỉ: ");
                    String adress = input.nextLine();
                    System.out.println("Mời bạn nhập điểm: ");
                    int point = Integer.parseInt(input.nextLine());
                    Student student = new Student(id, name, adress, point);
                    studentList.add(index - 1, student);
                    break;
                case 2:
                    System.out.println("Nhập ID sinh viên muốn xóa: ");
                    int idXoa = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < studentList.size(); i++) {
                        if (idXoa == studentList.get(i).getiD()) {
                            int indexXoa = i;
                            studentList.remove(indexXoa);
                        }

                    }

                    break;
                case 3:
                    System.out.println("Nhập ID sinh viên muốn sửa: ");
                    int idSua = Integer.parseInt(input.nextLine());
                    for (Student item : studentList) {
                        if (idSua == item.getiD()) {
                            System.out.println("Sửa tên: ");
                            String nameEdit = input.nextLine();
                            System.out.println("Sửa địa chỉ: ");
                            String addressEdit = input.nextLine();
                            System.out.println("Sửa điểm: ");
                            int pointEdit = Integer.parseInt(input.nextLine());
                            item.setName(nameEdit);
                            item.setAdress(addressEdit);
                            item.setPoint(pointEdit);
                        }
                    }
                case 4:
                    for (Student value : studentList) {
                        System.out.println("ID: " + value.getiD() + " Tên: " + value.getName() + " Địa chỉ: " + value.getAdress() + " Point: " + value.getPoint());
                    }
                    break;
                case 5:
                    System.out.println("Nhập mã sinh viên muốn kiểm tra: ");
                    int idKiemtra = Integer.parseInt(input.nextLine());
                    boolean check = false;
                    int indexKiemTra = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (idKiemtra == studentList.get(i).getiD()) {
                            indexKiemTra = i;
                            check = true;
                            break;
                        } else {
                            check = false;
                        }
                    }
                    if (check) {
                        System.out.println("ID: " + studentList.get(indexKiemTra).getiD() + " Tên: " + studentList.get(indexKiemTra).getName() + " Địa chỉ: " + studentList.get(indexKiemTra).getAdress() + " Point: " + studentList.get(indexKiemTra).getPoint());
                    } else {
                        System.out.println("Sinh viên không tồn tại trong danh sách");
                    }
                    break;
                case 6:
                    Collections.sort(studentList);
                    break;
                case 7:
                    System.exit(0);

            }
        }
    }
}



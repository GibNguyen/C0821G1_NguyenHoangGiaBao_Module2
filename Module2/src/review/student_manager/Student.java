package review.student_manager;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private int iD;
    private String name;
    private String adress;
    private int point;

    public Student() {
    }

    public Student(int iD, String name, String adress, int point) {
        this.iD = iD;
        this.name = name;
        this.adress = adress;
        this.point = point;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }


    //    @Override
//    public int compareTo(Object o) {
//        if (o == null || !(o instanceof Student)) {
//            return 0;
//        }
//        Student student = (Student) o;
//        if (this.point > student.getPoint()) {
//            return 1;
//        } else if (this.point < student.getPoint()) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getPoint() - o2.getPoint();
    }
}

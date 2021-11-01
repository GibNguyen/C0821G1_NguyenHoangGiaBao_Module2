package review.candidates_manager.models;

public class InternCandidate extends Candidates {
    private String major;
    private int semester;
    private String universityName;


    public InternCandidate(int iD, String firstName, String lastName, int birthDay, String address, String phone, String email, String major, int semester, String universityName) {
        super(iD, firstName, lastName, birthDay, address, phone, email);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public InternCandidate(String major, int semester, String universityName) {
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public InternCandidate() {
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString()+","+this.major+","+this.semester+","+this.universityName;
    }
}

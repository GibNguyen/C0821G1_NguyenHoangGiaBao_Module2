package review.candidates_manager.models;

public class FresherCandidate extends Candidates {
    private int graduationTime;
    private String graduationRank;
    private String education;


    public FresherCandidate() {
    }

    public FresherCandidate(int iD, String firstName, String lastName, int birthDay, String address, String phone, String email, int graduationTime, String graduationRank, String education) {
        super(iD, firstName, lastName, birthDay, address, phone, email);
        this.graduationTime = graduationTime;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduationTime() {
        return graduationTime;
    }

    public FresherCandidate(int graduationTime, String graduationRank, String education) {
        this.graduationTime = graduationTime;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public void setGraduationDate(int graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString()+","+this.graduationTime+","+this.graduationRank+","+this.education;
    }
}

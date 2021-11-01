package review.candidates_manager.models;

public class ExperienceCandicate extends Candidates {
    private int experienceYear;
    private String proSkill;


    public ExperienceCandicate(int iD, String firstName, String lastName, int birthDay, String address, String phone, String email , int experienceYear, String proSkill) {
        super(iD, firstName, lastName, birthDay, address, phone, email);
        this.experienceYear = experienceYear;
        this.proSkill = proSkill;
    }

    public ExperienceCandicate(int experienceYear, String proSkill) {
        this.experienceYear = experienceYear;
        this.proSkill = proSkill;
    }

    public ExperienceCandicate() {
    }

    public ExperienceCandicate(int experienceId, String experienceFirstName, String experienceLastName, int experienceDateOfBirth, String experienceAddress, int experiencePhone, String experienceEmail) {
    }


    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString()+","+this.experienceYear+","+this.proSkill;
    }
}

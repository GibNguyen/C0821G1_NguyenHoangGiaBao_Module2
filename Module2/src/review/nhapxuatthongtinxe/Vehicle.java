package review.nhapxuatthongtinxe;

public class Vehicle {
    private int giaTri = 0;
    private int dungTich = 0;

    public Vehicle() {

    }

    public Vehicle(int giaTri, int dungTich) {
        this.giaTri = giaTri;
        this.dungTich = dungTich;
    }

    public float getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double keKhaiThue() {
        if (this.getDungTich() < 100) {
            return this.getGiaTri() * 0.01;
        }
        if (this.getDungTich() >= 100 && this.getDungTich() <= 200) {
            return this.getGiaTri() * 0.03;
        } else {
            return this.getGiaTri() * 0.05;
        }
    }
    public void displayVehicle(){
        System.out.println(keKhaiThue());
    }
    @Override
    public String toString() {
        return "Giá Trị Xe : " + this.getGiaTri() + "," + "Dung Tích : " + this.getDungTich() + "," + this.keKhaiThue();
    }
}

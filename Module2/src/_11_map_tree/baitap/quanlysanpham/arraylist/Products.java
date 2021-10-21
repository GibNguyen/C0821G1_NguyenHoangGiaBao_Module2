package _11_map_tree.baitap.quanlysanpham.arraylist;

public class Products implements Comparable {
    private int iD;
    private double price;
    private String name;

    public Products() {
    }

    public Products(int iD, String name, double price) {
        this.iD = iD;
        this.price = price;
        this.name= name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Products{" +
                "iD=" + iD +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o==null||!(o instanceof Products)){
            return 0;
        }
        Products products = (Products)o;
        if(this.getPrice()>products.getPrice()){
            return 1;
        }
        else if(this.getPrice()<products.getPrice()){
            return -1;
        }
        else return 0;
    }
}

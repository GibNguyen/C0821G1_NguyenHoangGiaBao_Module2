package _16_io_binary.baitap;

import java.io.Serializable;

public class Products implements Serializable {
    private int codeProduct;
    private String nameProduct;
    private String manufacturerProdcut;
    private double priceProduct;
    private String descriptionProduct;

    public Products(int codeProduct, String nameProduct, String manufacturerProdcut, double priceProduct, String descriptionProduct) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.manufacturerProdcut = manufacturerProdcut;
        this.priceProduct = priceProduct;
        this.descriptionProduct = descriptionProduct;
    }

    public Products() {
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturerProdcut() {
        return manufacturerProdcut;
    }

    public void setManufacturerProdcut(String manufacturerProdcut) {
        this.manufacturerProdcut = manufacturerProdcut;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    @Override
    public String toString() {
        return "Products{" +
                "codeProduct=" + codeProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", manufacturerProdcut='" + manufacturerProdcut + '\'' +
                ", priceProduct=" + priceProduct +
                ", descriptionProduct='" + descriptionProduct + '\'' +
                '}';
    }
}

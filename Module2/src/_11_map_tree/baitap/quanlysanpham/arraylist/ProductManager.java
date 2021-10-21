package _11_map_tree.baitap.quanlysanpham.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    List<Products> productList;

    public ArrayList<Products> getProductList() {
        return (ArrayList<Products>) productList;
    }

    public void setProductList(ArrayList<Products> productList) {
        this.productList = productList;
    }

    public ProductManager() {
        this.productList = new ArrayList();
    }

    public ProductManager(ArrayList<Products> productList) {
        this.productList = productList;
    }

    public void addProduct(Products products) {
        productList.add(products);
    }

    public void showProduct() {
        for (Products products : productList) {
            System.out.println(products);
        }
    }

    public void findProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                System.out.println(productList.get(i));
            }
        }
    }

    public void sortProduct() {
        Collections.sort(productList);
    }

    public void editProduct(int id, String name, double price) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getiD()) {
                productList.get(i).setName(name);
                productList.get(i).setPrice(price);
            }
        }
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getiD()) {
                productList.remove(productList.get(i));
            }
        }
    }
}

package _16_io_binary.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add product" + "\n" +
                    "2.Show product" + "\n" +
                    "3.Find product" + "\n");
            int choice = Integer.parseInt(scanner.nextLine());
            List<Products> productsList = new ArrayList<>();
            switch (choice) {
                case 1:
                    System.out.print("Enter the code : ");
                    int code = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the name : ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the manufacture : ");
                    String manufacture = scanner.nextLine();
                    System.out.print("Enter the Price : ");
                    Double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter the Description : ");
                    String description = scanner.nextLine();
                    Products products = new Products(code, name, manufacture, price, description);
                    productsList.add(products);
                    FileOutputStream fileOutputStream = new FileOutputStream("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_16_io_binary\\baitap\\products", true);
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(productsList);
                    fileOutputStream.close();
                    break;
                case 2:
                    FileInputStream fileInputStream = new FileInputStream("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_16_io_binary\\baitap\\products");
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    try {
                        productsList=(List)objectInputStream.readObject();
                        for (Products products2 : productsList) {
                            System.out.println(products2);
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    fileInputStream.close();
                    break;
                case 3:
                    FileInputStream fileInputStream1 = new FileInputStream("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_16_io_binary\\baitap\\products");
                    ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
                    Products products1 = null;
                    try {
                        products1 = (Products) objectInputStream1.readObject();
                        productsList.add(products1);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    productsList.add(products1);
                    fileInputStream1.close();
                    System.out.print("Enter the name of product you want to find: ");
                    String nameFind = scanner.nextLine();
                    for(Products products2:productsList){
                        if(products2.getNameProduct().equals(nameFind)){
                            System.out.println(products2);
                        }
                        else {
                            System.out.println("The product is not exit ");
                        }
                    }
            }
        }
    }
}

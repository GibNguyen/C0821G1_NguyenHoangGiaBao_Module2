package _16_io_binary.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Products> productsList = new ArrayList<>();
        while (true) {
            System.out.println("1.Add product" + "\n" +
                    "2.Show product" + "\n" +
                    "3.Find product" + "\n");
            int choice = Integer.parseInt(scanner.nextLine());

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
                    FileOutputStream fileOutputStream = new FileOutputStream("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_16_io_binary\\baitap\\products");
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(productsList);
                    fileOutputStream.close();
                    break;
                case 2:
                    try {
                        FileInputStream fileInputStream = new FileInputStream("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_16_io_binary\\baitap\\products");
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                        productsList = (List<Products>) objectInputStream.readObject();
                        for (Products products2 : productsList) {
                            System.out.println(products2);
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                    break;
                case 3:
                    FileInputStream fileInputStream1 = new FileInputStream("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_16_io_binary\\baitap\\products");
                    ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
//                    boolean check = false;
                    int index;
                    try {
                        productsList=(List<Products>) objectInputStream1.readObject();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    fileInputStream1.close();
                    System.out.print("Enter the name of product you want to find: ");
                    String nameFind = scanner.nextLine();
                    index=productsList.indexOf(new Products(nameFind));
                    if(index==-1){
                        System.out.println("The products is not exit");
                    }
                    else {
                        System.out.println(productsList.get(index));
                    }
            }
        }
    }
}

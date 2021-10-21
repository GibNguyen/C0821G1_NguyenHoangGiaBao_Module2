package _11_map_tree.baitap.quanlysanpham.arraylist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while (true) {
            System.out.println("-----Product Manager----"+"\n"+
                    "1.Add Product"+"\n"+
                    "2.Edit Product"+"\n"+
                    "3.Delete Product"+"\n"+
                    "4.Show Product"+"\n"+
                    "5.Find Product by Name"+"\n"+
                    "6.Sort Product"+"\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Nhập id sản phầm : ");
                    int idAdd= Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên sản phẩm : ");
                    String nameAdd = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm : ");
                    double priceAdd= Double.parseDouble(scanner.nextLine());
                    Products products = new Products(idAdd,nameAdd,priceAdd);
                    productManager.addProduct(products);
                    break;
                case 2:
                    System.out.print("Nhập ID sản phẩm muốn sửa : ");
                    int idEdit= Integer.parseInt(scanner.nextLine());
                    System.out.print("Hãy nhập tên muốn sửa : ");
                    String nameEdit = scanner.nextLine();
                    System.out.print("Hãy nhập giá muốn sửa : ");
                    double priceEdit = Double.parseDouble(scanner.nextLine());
                    productManager.editProduct(idEdit,nameEdit,priceEdit);
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm muốn xóa : ");
                    int idDelete= Integer.parseInt(scanner.nextLine());
                    productManager.deleteProduct(idDelete);
                case 4:productManager.showProduct();
                break;
                case 5:
                    System.out.println("Nhâp tên sản phẩm muốn tìm : ");
                    String nameFind= scanner.nextLine();
                    productManager.findProduct(nameFind);
                    break;
                case 6:
                    productManager.sortProduct();
                    productManager.showProduct();
            }
        }
    }

}

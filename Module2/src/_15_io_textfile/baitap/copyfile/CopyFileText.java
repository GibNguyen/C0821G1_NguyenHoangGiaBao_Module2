package _15_io_textfile.baitap.copyfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileText {
    public  static String readFile(FileReader fileReader){
        int i;
        String std="";
        try {
            fileReader = new FileReader("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_15_io_textfile\\baitap\\copyfile\\sourcefile");
            while ((i=fileReader.read())!=-1){
                std=std+(char)i;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return std;
    }

    public static void writeFile(FileWriter fileWriter,String content){
        try {
            fileWriter=new FileWriter("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_15_io_textfile\\baitap\\copyfile\\target");
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String std ="";
        try {
            std=readFile(new FileReader("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_15_io_textfile\\baitap\\copyfile\\sourcefile"));
            try {
                writeFile(new FileWriter("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_15_io_textfile\\baitap\\copyfile\\target"),std);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Copy success");
    }
}


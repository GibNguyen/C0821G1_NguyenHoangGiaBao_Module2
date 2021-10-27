package _15_io_textfile.baitap.read_csv_file;



import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadCsv {
    public static void main(String[] args) throws IOException {
        List<Nation> nationlist = new ArrayList();
        String line;
        try {
            FileReader fileReader = new FileReader("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\_15_io_textfile\\baitap\\read_csv_file\\Nation");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] nation = line.split(",");
                Nation nation1 = new Nation(Integer.parseInt(nation[0]), nation[1], nation[2]);
                nationlist.add(nation1);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(Nation nation:nationlist){
            System.out.println(nation.getId()+","+nation.getCode()+","+nation.getName()+"\n");
        }
    }
}


package review.candidates_manager.services;

import review.candidates_manager.models.Candidates;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite implements IReadAndWrite {
    List<Candidates> candidatesList = new ArrayList<>();
    @Override
    public void writeFile(Candidates candidates) {
        try {
            FileWriter fileWriter=new FileWriter("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\review\\candidates_manager\\data\\Candidates",true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(candidates.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List readFile() {
        try {
            FileReader fileReader=new FileReader("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\review\\candidates_manager\\data\\Candidates");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line=bufferedReader.readLine())!=null){
                String[] candidates=line.split(",");
                Candidates candidates1=new Candidates(Integer.parseInt(candidates[0]),candidates[1],candidates[2],Integer.parseInt(candidates[3]),candidates[4],candidates[5],candidates[6]);
                candidatesList.add(candidates1);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return candidatesList;
    }
}

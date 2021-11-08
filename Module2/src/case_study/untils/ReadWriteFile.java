package case_study.untils;

import case_study.models.*;
import review.candidates_manager.models.InternCandidate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReadWriteFile {
    public void writeListEmployee(String path, List<Employee> myList) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : myList) {
                bufferedWriter.write(employee.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeListCustomer(String path, List<Customer> myList) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : myList) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> readListEmployee(String path, List<Employee> myList) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                Employee employee = new Employee(array[1], array[2], array[3], Integer.parseInt(array[4]), Integer.parseInt(array[5]), array[6], Integer.parseInt(array[0]), array[7], array[8], Double.parseDouble(array[9]));
                myList.add(employee);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myList;
    }

    public List<Customer> readListCustomer(String path, List<Customer> myList) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                Customer customer = new Customer(array[1], array[2], array[3], Integer.parseInt(array[4]), Integer.parseInt(array[5]), array[6], Integer.parseInt(array[0]), array[7], array[8]);
                myList.add(customer);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myList;
    }

    public void writeMap(String path, Map<Facility, Integer> myMap) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> facility : myMap.entrySet()) {
                bufferedWriter.write(facility.getKey().toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<Facility, Integer> readMap(String path, Map<Facility, Integer> myMap) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                if (array.length == 8) {
                    Villa villa = new Villa(array[0], Double.parseDouble(array[1]), Double.parseDouble(array[2]), Integer.parseInt(array[3]), array[4], array[5], Double.parseDouble(array[6]), Integer.parseInt(array[7]));
                    myMap.put(villa, 0);
                } else if (array.length == 7) {
                    House house = new House(array[0], Double.parseDouble(array[1]), Double.parseDouble(array[2]), Integer.parseInt(array[3]), array[4], array[5], Integer.parseInt(array[6]));
                    myMap.put(house,0);
                }
                else {
                    Room room = new Room(array[0],Double.parseDouble(array[1]),Double.parseDouble(array[2]),Integer.parseInt(array[3]),array[4],array[5]);
                    myMap.put(room,0);
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myMap;
    }
}

package org.example;

import java.io.*;
import java.util.ArrayList;

public class FileHandler implements Serializable{
    public void checkFileExistence(){
        File file = new File("data.ser");
        try {
            boolean a = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void saveAll(ArrayList<Hotel> hotels){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            out.writeObject(hotels);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Hotel> readAll(){
        ArrayList<Hotel> hotels;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"))) {
            hotels = (ArrayList<Hotel>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            hotels = new ArrayList<>();
            e.printStackTrace();
        }
        return hotels;
    }
}

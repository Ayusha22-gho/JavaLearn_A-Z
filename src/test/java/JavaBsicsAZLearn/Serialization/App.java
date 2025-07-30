package JavaBsicsAZLearn.Serialization;

import java.io.*;

public class App {

    public static void main(String[] args){
         //Car car = new Car(23456,"Hyundai","Grey");
        Ford car = new Ford(23412,"Ford","Black","SUV");

         try {
             FileOutputStream fileOutputStream = new FileOutputStream("Serialized.txt");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

             outputStream.writeObject(car);
             fileOutputStream.close();
             outputStream.close();

             System.out.println("Car object has been serialized");

         }catch(IOException e){
             e.printStackTrace();
         }

        try {

            FileInputStream fileInputStream = new FileInputStream("Serialized.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Car deserialized = (Car) objectInputStream.readObject();

            System.out.println(deserialized);

            System.out.println("Car object has been deserialized");

        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

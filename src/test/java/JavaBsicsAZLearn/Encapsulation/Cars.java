package JavaBsicsAZLearn.Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<String> cars;

    public List<String> getCars() {
        //return cars;
        return new ArrayList<>(this.cars);
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public static void main(String[] args){
        List<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Porsche");

        Cars carClass = new Cars();
        carClass.setCars(cars);

        for(String s : carClass.getCars()){
            System.out.println(s);
        }
        System.out.println();

        //List and array list are mutable objects
        List<String> actualCars = carClass.getCars();

        actualCars.add("Kia");//this has updated the original List
        //to avoid this we will return new arraylist while doing getcars

        for(String s : carClass.getCars()){
            System.out.println(s);
        }

        System.out.println();
        for(String s : actualCars){
            System.out.println(s);
        }
    }
}

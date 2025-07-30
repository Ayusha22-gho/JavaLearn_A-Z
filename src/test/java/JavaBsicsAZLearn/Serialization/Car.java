package JavaBsicsAZLearn.Serialization;

import java.io.Serializable;

public class Car implements Serializable {

    int carNum;
    String name;
    transient String color; //transient keyword prevents the variable to be serialized

    public Car(int carNum,String name, String color){
        this.carNum = carNum;
        this.name = name;
        this.color = color;

    }

    @Override
    public String toString() {
        return this.carNum +"-"+this.name+"-"+this.color;
    }
}

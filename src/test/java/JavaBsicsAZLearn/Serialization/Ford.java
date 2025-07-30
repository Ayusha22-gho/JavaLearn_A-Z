package JavaBsicsAZLearn.Serialization;

public class Ford extends Car{ //it is serialized by default
    private String fordType;
    public Ford(int carNum, String name, String color,String fordType) {
        super(carNum, name, color);
        this.fordType = fordType;
    }
}

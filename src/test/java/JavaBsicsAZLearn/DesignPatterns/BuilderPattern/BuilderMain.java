package JavaBsicsAZLearn.DesignPatterns.BuilderPattern;

public class BuilderMain {

    /**
     * As our data objects grow in size, the constructor may grow to contain many attributes
     *
     * Users who reference our object would also be required to update their constructor calls each t
     * ime that the object was modified, resulting in a class that would be difficult to use and maintain
     *
     * BUILDER PATTERN SOLVES THIS PROBLEM: we can use method chaining instead of using many parameters
     *
     * -> The primary advantage of the builder pattern is that over time this approach leads
     * to far more maintainable code
     * -> if a new optional field is added to the Person class then our code that
     * creates objects using the PersonBuilder class will not need to be changed
     *
     *
     * **/

    public static void main(String[] args){
        //old way
//        Car car = new Car("Ford","Focus","black",5,125);
//        System.out.println(car);

        //methos chaining
        Car car = new Car.CarBuilder().setBrand("Ford").setName("Focus").setColor("Black").setNumOfDoors(5).setHorsePower(124).build();
        System.out.println(car);

        //here no need to mention setBrand or etc. if not present

    }
}

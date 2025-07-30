package JavaBsicsAZLearn.Encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0){
           throw new IllegalArgumentException("Age cannot be less than 0");

        }
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public Person(){

    }

    public String toString(){
        return "Person "+ this.age+" "+this.name;
    }

}

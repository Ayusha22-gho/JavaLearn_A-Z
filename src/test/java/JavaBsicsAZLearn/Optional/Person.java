package JavaBsicsAZLearn.Optional;

public class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Person(String name){
        this.name = name;
    }
    public String toString(){
        return this.name;
    }
}

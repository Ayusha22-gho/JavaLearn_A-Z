package JavaBsicsAZLearn.Encapsulation;

import JavaBsicsAZLearn.Encapsulation.Child;
import JavaBsicsAZLearn.Encapsulation.GrandChild;
import JavaBsicsAZLearn.Encapsulation.Parent;

public class App {

    public static void main(String[] args){
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Parent p3 = new GrandChild();

        p1.travel();
        p2.travel();
        p3.travel();

        //In java we can override methods only and not variables
        //so run time ploymophism cannot be done on data members
        System.out.println(p1.age);
        System.out.println(p2.age);
        System.out.println(p3.age);

        GrandChild g = new GrandChild();
        System.out.println(g.age);

        Person person  = new Person();
        person.setAge(26);
        person.setName("Ayusha");

        System.out.println(person);//call the tostring method
    }
}

package JavaBsicsAZLearn.DesignPatterns.ImmutableObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class IOPMain {

    /**
     * Sometimes we want to create simple objects that can be shared across multiple classes
     * but for security reasons we don't want their value to be modified
     *
     * -> we could copy the object before sending it to another method but this creates a large overhead that duplicates the object every time it is passed
     *
     *
     *          IMMUTABLE OBJECT PATTERN MAKES SURE THE STATE OF AN OBJECT WILL NOT CHANGE !!!
     * -> we can achieve this pattern via encapsulation
     * -› this pattern is inherently thread-safe (because immutable objects never change)
     *-> either clone arrayllist or use unmodifable for collection as only using final
     * with reference type is not enough
     *
     * **/

    public static void main(String[] args){

        ArrayList<String> person = new ArrayList<>();
        //with arraylist as well we cannot modify the list

        person.add("Ayusha");
        person.add("Mohit");
        person.add("Barsha");

        Person person1 = new Person("Ajit",26,person);
        System.out.println(person1.getName()+" "+person1.getAge()+" "+person1.getFriends());

        person1.getFriends().clear();
        person1.getFriends().add("New friends");

        System.out.println(person1.getName()+" "+person1.getAge()+" "+person1.getFriends());

    }
}

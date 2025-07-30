package JavaBsicsAZLearn.DesignPatterns.ImmutableObjectPattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {

    private final String name;
    private final int age;
    //private final Collection<String> friends;
    private final ArrayList<String> friends;
    //final List -> list is a reference type, so we might not change the reference
    //but it can change the content
    //to prevent that we will use Collection

    Person(String name, int age, ArrayList<String> friends){
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    public Collection<String> getFriends() {
//        //return friends;
//        return  Collections.unmodifiableCollection(this.friends);
//    }

    public ArrayList<String> getFriends(){
        return (ArrayList<String>) this.friends.clone();
    }

    //no setters as we do not want the objects too get modified
}

package JavaBsicsAZLearn.Optional;

import java.util.Optional;

public class App {

    public static void main(String[] args){

        Person person = new Person("Ayusha Ghosh");

        Optional<Person> personEmpty = Optional.empty();
        System.out.println(personEmpty);


        //Optional<Person> personOptional = Optional.of(person);
        //System.out.println(personOptional.get().getName());
        //System.out.println(personOptional);

        Optional<Person> personOptional = Optional.ofNullable(person);
        if(personOptional.isPresent()){
            System.out.println("There is a non null object in the optional with value:" + personOptional.get());
        }else{
            System.out.println("The optional is empty");
        }

        Optional<Person> o= Optional.ofNullable(new Person("Jiya Ghosh"));

        Person p = o.orElse(new Person("This is a new person object if Jiya Ghosh is null"));

        System.out.println(p);

        Optional<Person> option = Optional.ofNullable(null);
        Person per = option.orElseGet(()->giveAnotherPerson());
        System.out.println(per);
    }

    public static Person giveAnotherPerson(){
        return new Person("New Person");
    }
}

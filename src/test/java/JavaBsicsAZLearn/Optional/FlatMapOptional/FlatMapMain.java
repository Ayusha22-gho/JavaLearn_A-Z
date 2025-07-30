package JavaBsicsAZLearn.Optional.FlatMapOptional;

import java.util.Optional;

public class FlatMapMain {


    public static void main(String[] args){
        //Stamp stamp = new Stamp("Barbodas");
        Optional<Stamp> stamp = Optional.ofNullable(new Stamp("Barbodas"));

        //Passport passport = new Passport(stamp);
        Optional<Passport> passport = Optional.ofNullable(new Passport(stamp));

       // Person person = new Person("Ayusha",passport);
        Optional<Person> person = Optional.ofNullable(new Person("Ayusha Ghosh",passport));

        //System.out.println(person.getName()+" "+person.getPassport().getStamp().getStampOfCountry());

        //There is a possibility that the stamp may be null/passport may be null
        //So we would have to do a lot of null checks

        //WE SHOULD USE OPTIONAL

        String stampOfCountry =
               // person.map(Person::getPassport).map(Passport::getStamp).map(Stamp::getStampOfCountry).orElse("Unknown");
               // stamp.map(Stamp::getStampOfCountry).orElse("Unknown");
                person.flatMap(Person :: getPassport)
                        .flatMap(Passport::getStamp)
                        .map(Stamp::getStampOfCountry)
                        .orElse("Unknown");

        System.out.println(stampOfCountry);




    }
}

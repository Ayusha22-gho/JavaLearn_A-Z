package JavaBsicsAZLearn.Optional.FlatMapOptional;

import java.util.Optional;

public class Person {

    private String name;
    private Optional<Passport> passport;

    public Person(String name, Optional<Passport> passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public Optional<Passport> getPassport() {
        return passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(Optional<Passport> passport) {
        this.passport = passport;
    }
}

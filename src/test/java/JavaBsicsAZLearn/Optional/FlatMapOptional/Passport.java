package JavaBsicsAZLearn.Optional.FlatMapOptional;

import java.util.Optional;

public class Passport {

    //with declaring it as optional, we do not have to ceck whether
    //stamp is null or not
    private Optional<Stamp> stamp;

    public Passport(Optional<Stamp> stamp) {
        this.stamp = stamp;
    }

    public void setStamp(Optional<Stamp>stamp) {
        this.stamp = stamp;
    }

    public Optional<Stamp> getStamp() {
        return stamp;
    }
}

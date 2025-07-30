package JavaBsicsAZLearn.NestedInterface;

public interface OuterInterface {

    //Nested Interface are static by default
    //NI declared inside class Can take any access modifier
    // however NI declared inside interface is public implicitly.
    void messageOutside();

    interface NestedInterface{
        void messageInside();

    }
}

package JavaBsicsAZLearn.GenericsinJava;

class Box <T> {
    private T element;

    public Box(T element){
        this.element = element;
    }

    public T getElement(){
        return this.element;
    }

    public void setElement(T element){
        this.element = element;
    }
}
public class GenericClass {

    public static void main(String args[]){
       Box<Integer> box1 = new Box<>(100);
        Box<String> box2 = new Box<>("Adam");
        System.out.println(box1.getElement() +" "+ box2.getElement());
    }
}

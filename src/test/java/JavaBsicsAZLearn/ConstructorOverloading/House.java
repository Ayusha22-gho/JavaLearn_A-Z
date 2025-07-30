package JavaBsicsAZLearn.ConstructorOverloading;

public class House {

    private int numOfRooms;
    private int numOfDoors;
    private int numOfWindows;

    public House(){
        this(5);
    }

    public House(int numOfRooms) {
        this(numOfRooms,10);
    }

    public House(int numOfRooms, int numOfDoors) {
        this(numOfRooms,numOfDoors,25);
    }

    public House(int numOfRooms, int numOfDoors, int numOfWindows) {
        this.numOfRooms = numOfRooms;
        this.numOfDoors = numOfDoors;
        this.numOfWindows = numOfWindows;
    }

    public static void main(String args[]){
        House house = new House();
        System.out.println(house.numOfRooms +" " +house.numOfDoors +" " + house.numOfWindows);
    }
}

package car;

public class Car {
    //Name
    //Manufacturer
    //Type
    //ID

    //public fields can be accessed outside a class, while private fields can only be accessed inside the class
    public String name;
    public String manufacturer;
    public String type;
    private int id;

    //getter and setter methods: are used to view and set private fields outside a class

    public int getId() {
       return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

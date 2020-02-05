public class Car extends Vehicle {
    //variables
    private String start;
    private String accelerate;
    private String speed;
    private String stop;

    //constructors
    public Car(){
    }
    public Car(String start){
        this.start = start;
    }

    //methods - getters + setters




    public String start(Car c){
        return "The "+ c.getColor() +" "+c.getModel() +" is starting";
    }
    public String accelerate(Car c){
        return "The "+ c.getColor() +" "+c.getModel() +" is accelerating";
    }

    public String setSpeed(int mph){
        return "The speed is "+ mph +" mph";
    }







}

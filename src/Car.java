public class Car extends Vehicle {
    //variables

    //constructors
    public Car(){
    }
    public Car(String color, String model){
        this.color = color;
        this.model = model;
    }

    //methods
    public String start(Car c){
        return "The "+ c.getColor() +" "+c.getModel() +" is starting";
    }
    public String accelerate(Car c){
        return "The "+ c.getColor() +" "+c.getModel() +" is accelerating";
    }
    public String setSpeed(Car c, int mph){
        return "The "+ c.getColor() +" "+c.getModel() +" is going "+ mph +" mph";
    }
    public String stop(Car c){
        return "The "+ c.getColor() +" "+c.getModel() +" is stopped";
    }






}

public class Vehicle {
    protected String color;
    protected String model;

    public Vehicle(){
    }
    public Vehicle(String color, String model){
        this.color = color;
        this.model = model;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getDescription(){
        return "Car: "+getModel()+"\nColor: "+getColor();
    }

}

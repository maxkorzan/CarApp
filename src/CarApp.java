public class CarApp {
    public static void main(String[] args) {

//        Vehicle v = new Vehicle();

        Car c1 = new Car();
        c1.setColor("red");
        c1.setModel("Porsche");

        Car c2 = new Car();
        c2.setColor("blue");
        c2.setModel("Jetta");

//        System.out.println(c1);
        System.out.println(c1.getColor() +" "+c1.getModel());
        System.out.println(c1.start(c1));
        System.out.println(c1.accelerate(c1));
        System.out.println(c1.setSpeed(90));
        System.out.println();

        System.out.println(c2.getColor() +" "+c2.getModel());
        System.out.println(c2.start(c2));
        System.out.println(c2.accelerate(c2));
        System.out.println(c2.setSpeed(90));


    }
}

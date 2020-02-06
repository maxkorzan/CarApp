public class CarApp {
    public static void main(String[] args) {

//        Vehicle v = new Vehicle();

        Car c1 = new Car();
        c1.setColor("red");
        c1.setModel("Porsche");

        Car c2 = new Car();
        c2.setColor("blue");
        c2.setModel("Jetta");

        Car c3 = new Car("yellow", "camaro");


//        System.out.println(c1.getColor() +" "+c1.getModel());
        System.out.println(c1.start(c1));
        System.out.println(c1.accelerate(c1));
        System.out.println(c3.start(c3));
        System.out.println(c1.setSpeed(c1, 90));
        System.out.println(c1.stop(c1));
        System.out.println(c3.accelerate(c3));
        System.out.println();

//        System.out.println(c2.getColor() +" "+c2.getModel());
        System.out.println(c2.start(c2));
        System.out.println(c3.stop(c3));
        System.out.println(c2.accelerate(c2));
        System.out.println(c2.setSpeed(c2, 55));
        System.out.println(c2.stop(c2));



    }
}

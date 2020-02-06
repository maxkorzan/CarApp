import java.util.ArrayList;
import java.util.Scanner;

public class CarAppModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();

        for(int i=0; i<4; i++){
            System.out.print("Enter a car model: ");
            String model = sc.nextLine();
            System.out.print("Enter the car color: ");
            String color = sc.nextLine();

            Car car = new Car();
            //prompt from user and populate car class
            car.setModel(model);
            car.setColor(color);

            //add car to the cars arraylist
            cars.add(car);
        }

        for(Car c: cars){
            System.out.println(c.getDescription());
        }

    }
}

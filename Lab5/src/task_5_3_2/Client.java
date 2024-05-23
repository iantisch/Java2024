package task_5_3_2;

import task_5_3_2.builders.Builder;
import task_5_3_2.builders.CarSetting;

public class Client {

    public static void main(String[] args) {
        Builder builder = new CarSetting();
        Production director = new Production(builder);

        Car car = director.buildSedan("red");
        System.out.println(car);

        Car car2 = car.clone();

        System.out.println(car2);
        // check if these classes different
        System.out.println(car == car2);
    }
}

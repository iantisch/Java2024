package task_4_3_1;

import task_4_3_1.builders.CarSetting;

public class Client {
    public static void main(String[] args) {
        Production director = new Production(new CarSetting());

        Car car = director.buildCoupe("red");
        System.out.println(car);

        Car car2 = director.buildSUV("black");
        System.out.println(car2);

        Car car3 = director.buildCoupe("green");
        System.out.println(car3);

        Car car4 = director.buildCoupe("yellow");
        System.out.println(car4);
    }
}

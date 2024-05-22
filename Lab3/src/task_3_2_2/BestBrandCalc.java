package task_3_2_2;

import task_3_2_2.factory.*;
import task_3_2_2.transport.Transport;

public class BestBrandCalc {

    private static Transport[] createTransports(TransportFactory factory, int numberBuses, int numberTrolleybuses, int numberTrams) {
        Transport[] transports = new Transport[numberBuses + numberTrolleybuses + numberTrams];
        int i = 0;
        for (; i < numberBuses; i++) {
            transports[i] = factory.createBus();
        }
        for (; i < numberBuses + numberTrolleybuses; i++) {
            transports[i] = factory.createTrolleybus();
        }
        for (; i < numberBuses + numberTrolleybuses + numberTrams; i++) {
            transports[i] = factory.createTram();
        }
        return transports;
    }

    private static int calculateTotalCost(Transport[] transports, int N) {
        int totalCost = 0;
        for (Transport transport : transports) {
            totalCost += transport.getPurchaseCost() + transport.calculateDistanceCost(N * 1000);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int numberBuses = 10;
        int numberTrolleybuses = 7;
        int numberTrams = 5;
        int N = 200;
        int hyundaiTotalCost;
        int skodaTotalCost;
        int volvoTotalCost;

        TransportFactory hyundaiFactory = new Hyundai();
        TransportFactory skodaFactory = new Skoda();
        TransportFactory volvoFactory = new Volvo();

        Transport[] transports;

        transports = createTransports(skodaFactory, numberBuses, numberTrolleybuses, numberTrams);
        skodaTotalCost = calculateTotalCost(transports, N);

        transports = createTransports(volvoFactory, numberBuses, numberTrolleybuses, numberTrams);
        volvoTotalCost = calculateTotalCost(transports, N);

        transports = createTransports(hyundaiFactory, numberBuses, numberTrolleybuses, numberTrams);
        hyundaiTotalCost = calculateTotalCost(transports, N);

        System.out.println("Skoda сумарна вартість: " + skodaTotalCost + " грн");
        System.out.println("Volvo сумарна вартість: " + volvoTotalCost + " грн");
        System.out.println("Hyundai сумарна вартість: " + hyundaiTotalCost + " грн");

        int min = Math.min(Math.min(skodaTotalCost, volvoTotalCost), hyundaiTotalCost);

        if (min == volvoTotalCost) {
            System.out.println("\nVolvo обійдеться найдешевше");
        } else if (min == skodaTotalCost) {
            System.out.println("\nSkoda обійдеться найдешевше");
        } else if (min == hyundaiTotalCost) {
            System.out.println("\nHyundai обійдеться найдешевше");
        }
        System.out.println("Найкращий варіант!!!");
    }
}

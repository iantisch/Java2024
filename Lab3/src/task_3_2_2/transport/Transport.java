package task_3_2_2.transport;

public interface Transport {
    int getPurchaseCost();
    int getOperationalCost();
    int calculateDistanceCost(int distance);
}

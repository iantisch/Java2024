package task_5_3_2.builders;

import task_5_3_2.components.*;

public class TransmissionOption {
    private int numberOfGears;
    private TransmissionType transmissionType;

    public TransmissionOption setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
        return this;
    }

    public TransmissionOption setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    public Transmission build() {
        return new Transmission(numberOfGears, transmissionType);
    }
}

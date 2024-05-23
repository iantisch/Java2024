package task_4_3_1.builders;

import task_4_3_1.components.Transmission;
import task_4_3_1.components.TransmissionType;

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

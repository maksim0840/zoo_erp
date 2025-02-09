package domains;

import interfaces.IAnimalType;

public class Predator implements IAnimalType {
    public boolean isInteractiveAllowed() {
        return false;
    }
}

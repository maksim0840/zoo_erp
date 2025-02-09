package domains;

import interfaces.IAnimalType;

public class Herbo implements IAnimalType {
    private int kindness;

    @Override
    public boolean isInteractiveAllowed() {
        return this.kindness > 5;
    }
}

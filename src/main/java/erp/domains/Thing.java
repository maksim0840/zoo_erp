package erp.domains;

import erp.interfaces.IInventory;

public class Thing implements IInventory {
    private final int number;

    public Thing(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return this.number;
    }
}

package erp.services;

import erp.interfaces.IApprover;

public class VetClinic implements IApprover {
    @Override
    public boolean isApproved(int health) {
        return health > 5;
    }
}

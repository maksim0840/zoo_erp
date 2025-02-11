package erp.interfaces;

import erp.domains.Thing;

import java.util.List;
import java.util.Optional;

public interface IThingStorage {
    public List<Thing> getThings();
    public boolean addThing(Thing thing);
    public Optional<Thing> takeThing(Thing thing);
    public Optional<Thing> takeThing(int number);
}

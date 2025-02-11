package erp.services;

import erp.domains.Thing;
import erp.interfaces.IThingStorage;

import java.util.List;
import java.util.stream.Collectors;

public class ZooThingService {
    IThingStorage thingStorage;

    public  ZooThingService(IThingStorage thingStorage) {
        this.thingStorage = thingStorage;
    }

    public List<Integer> getThingsNumber() {
        return this.thingStorage.getThings().stream()
                .map(Thing::getNumber)
                .collect(Collectors.toList());
    }
}

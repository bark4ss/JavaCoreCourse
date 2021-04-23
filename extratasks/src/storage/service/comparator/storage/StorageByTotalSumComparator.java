package storage.service.comparator.storage;

import storage.model.Storage;

import java.util.Comparator;

public class StorageByTotalSumComparator implements Comparator<Storage> {
    @Override
    public int compare(Storage o1, Storage o2) {
        return Double.compare(o2.getTotalSum(), o1.getTotalSum());
    }
}

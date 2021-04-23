package storage.service.format.storage;

import storage.model.Storage;

public class StorageLongFormat implements StorageFormatter {
    @Override
    public String getFormattedStorage(Storage storage) {
        return storage.getStorageId() + " - " + storage.getTotalSum() + " - " + storage.getTotalItemCount();
    }
}

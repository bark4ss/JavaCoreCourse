package extratasks.storage.service.format.storage;

import extratasks.storage.model.Storage;

public class StorageLongFormat implements StorageFormatter {
    @Override
    public String getFormattedStorage(Storage storage) {
        return storage.getStorageId() + " - " + storage.getTotalSum() + " - " + storage.getTotalItemCount();
    }
}

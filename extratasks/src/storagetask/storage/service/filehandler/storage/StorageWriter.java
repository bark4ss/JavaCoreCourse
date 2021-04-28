package storagetask.storage.service.filehandler.storage;

import storagetask.storage.exception.StorageException;
import storagetask.storage.model.Storage;
import storagetask.storage.service.comparator.storage.StorageByTotalSumComparator;
import storagetask.storage.service.format.storage.StorageFormatter;
import storagetask.storage.service.format.storage.StorageLongFormat;
import storagetask.storage.service.format.storage.StorageShortFormat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class StorageWriter {

    public void writeStorageData(List<Storage> storages, String fileName, int switcher) {

        Comparator<Storage> comparator = new StorageByTotalSumComparator();
        storages.sort(comparator);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            StorageFormatter formatter = null;
            if(switcher==1) {
                formatter = new StorageShortFormat();
            }
            if(switcher==2) {
                formatter = new StorageLongFormat();
            }
            for (Storage storage:storages) {
                writer.write(formatter.getFormattedStorage(storage) + "\n");
            }


        } catch (IOException e) {
            throw new StorageException(e);
        }
    }
}

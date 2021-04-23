package storage.service.filehandler.storage;

import storage.exception.StorageException;
import storage.model.Storage;
import storage.service.comparator.storage.StorageByTotalSumComparator;
import storage.service.format.storage.StorageFormatter;
import storage.service.format.storage.StorageLongFormat;
import storage.service.format.storage.StorageShortFormat;

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

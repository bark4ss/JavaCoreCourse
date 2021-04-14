package extratasks.storage.service.filehandler.storage;

import extratasks.storage.exception.StorageException;
import extratasks.storage.model.Storage;
import extratasks.storage.service.comparator.storage.StorageByTotalSumComparator;
import extratasks.storage.service.format.storage.StorageFormatter;
import extratasks.storage.service.format.storage.StorageLongFormat;
import extratasks.storage.service.format.storage.StorageShortFormat;

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

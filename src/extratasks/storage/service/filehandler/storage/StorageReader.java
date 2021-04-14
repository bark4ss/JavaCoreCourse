package extratasks.storage.service.filehandler.storage;

import extratasks.storage.exception.StorageException;
import extratasks.storage.model.Item;
import extratasks.storage.model.Storage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StorageReader {

    public List<Storage> getStoragesFromDataFile (String fileName) {
        List<Storage> result = new ArrayList<>();
        Storage st1 = new Storage("ST1");
        Storage st2 = new Storage("ST2");
        Storage st3 = new Storage("ST3");
        Storage st4 = new Storage("ST4");

        result.add(st1);
        result.add(st2);
        result.add(st3);
        result.add(st4);

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] arrLine = line.split(" - ");
                Item item = new Item();
                item.setName(arrLine[0]);
                double price = Double.parseDouble(arrLine[2]);
                item.setPrice(price);
                int count = Integer.parseInt(arrLine[3]);
                item.setCount(count);

                for (Storage st:result) {
                    if(st.getStorageId().equals(arrLine[1])) {
                        st.getItems().add(item);
                        break;
                    }
                }
            }

        } catch (IOException e) {
            throw new StorageException(e);
        }

        return result;
    }
}

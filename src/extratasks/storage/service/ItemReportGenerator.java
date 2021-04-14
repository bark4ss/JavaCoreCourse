package extratasks.storage.service;

import extratasks.storage.model.ItemReport;
import extratasks.storage.model.Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemReportGenerator {

    public List<ItemReport> getTotalReport (List<Storage> storages) {
        List<ItemReport> result = new ArrayList<>();
        for (Storage st:storages) {
            for (Map.Entry<String,Double> entry: st.getUniqueItemWithSum().entrySet()) {
                ItemReport itemReport = new ItemReport(entry.getKey(),st.getStorageId(),entry.getValue());
                result.add(itemReport);
            }
        }
        return result;
    }
}

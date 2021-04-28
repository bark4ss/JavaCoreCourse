package storagetask.storage.main;

import storagetask.storage.model.ItemReport;
import storagetask.storage.model.Storage;
import storagetask.storage.service.ItemReportGenerator;
import storagetask.storage.service.filehandler.itemreport.ItemReportWriter;
import storagetask.storage.service.filehandler.storage.StorageReader;
import storagetask.storage.service.filehandler.storage.StorageWriter;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        StorageReader storageReader = new StorageReader();
        StorageWriter writer = new StorageWriter();
        ItemReportWriter itemReportWriter = new ItemReportWriter();
        ItemReportGenerator itemReportGenerator = new ItemReportGenerator();
        List<Storage> storages = storageReader.getStoragesFromDataFile("data.txt");
        List<ItemReport> itemReports = itemReportGenerator.getTotalReport(storages);
        itemReportWriter.writeItemReportData(itemReports,"product-report.txt");
        //writer.writeStorageData(storages,"st-total.txt",2);

    }
}

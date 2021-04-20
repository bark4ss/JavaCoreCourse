package extratasks.storage.main;

import extratasks.storage.model.ItemReport;
import extratasks.storage.model.Storage;
import extratasks.storage.service.ItemReportGenerator;
import extratasks.storage.service.filehandler.itemreport.ItemReportWriter;
import extratasks.storage.service.filehandler.storage.StorageReader;
import extratasks.storage.service.filehandler.storage.StorageWriter;

import java.util.List;
import java.util.stream.Collectors;

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

package storage.service.filehandler.itemreport;

import storage.exception.StorageException;
import storage.model.ItemReport;
import storage.service.comparator.itemreport.ItemReportByNameComparator;
import storage.service.comparator.itemreport.ItemReportByUniqueSumComparator;
import storage.service.format.itemreport.ItemReportFormatter;
import storage.service.format.itemreport.ItemReportFormatterImpl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class ItemReportWriter {

    public void writeItemReportData(List<ItemReport> itemReports, String fileName) {

        Comparator<ItemReport> comparatorByName = new ItemReportByNameComparator();
        Comparator<ItemReport> comparatorByUniqueSum = new ItemReportByUniqueSumComparator();
        itemReports.sort(comparatorByName.thenComparing(comparatorByUniqueSum));
        ItemReportFormatter formatter = new ItemReportFormatterImpl();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (ItemReport itemReport:itemReports) {
                writer.write(formatter.formatItemReport(itemReport) + "\n");
            }
        } catch (IOException e) {
            throw new StorageException(e);
        }
    }
}

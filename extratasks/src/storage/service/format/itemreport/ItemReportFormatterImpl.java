package storage.service.format.itemreport;

import storage.model.ItemReport;

public class ItemReportFormatterImpl implements ItemReportFormatter {
    @Override
    public String formatItemReport(ItemReport itemReport) {
        return itemReport.getItemName() + " - " + itemReport.getStorageId() + " - " + itemReport.getTotalUniqueSum();
    }
}

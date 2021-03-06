package storagetask.storage.service.comparator.itemreport;

import storagetask.storage.model.ItemReport;

import java.util.Comparator;

public class ItemReportByNameComparator implements Comparator<ItemReport> {
    @Override
    public int compare(ItemReport o1, ItemReport o2) {
        return o1.getItemName().compareTo(o2.getItemName());
    }
}

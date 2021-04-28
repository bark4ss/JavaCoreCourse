package storagetask.storage.service.comparator.itemreport;

import storagetask.storage.model.ItemReport;

import java.util.Comparator;

public class ItemReportByUniqueSumComparator implements Comparator<ItemReport> {
    @Override
    public int compare(ItemReport o1, ItemReport o2) {
        return Double.compare(o2.getTotalUniqueSum(),o1.getTotalUniqueSum());
    }
}

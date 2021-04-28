package storagetask.storage.model;

import java.util.Objects;

public class ItemReport {

    private String itemName;
    private String storageId;
    private double totalUniqueSum;

    public ItemReport() {
    }

    public ItemReport(String itemName, String storageId, double totalUniqueSum) {
        this.itemName = itemName;
        this.storageId = storageId;
        this.totalUniqueSum = totalUniqueSum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public double getTotalUniqueSum() {
        return totalUniqueSum;
    }

    public void setTotalUniqueSum(double totalUniqueSum) {
        this.totalUniqueSum = totalUniqueSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemReport that = (ItemReport) o;
        return Double.compare(that.totalUniqueSum, totalUniqueSum) == 0 && Objects.equals(itemName, that.itemName) && Objects.equals(storageId, that.storageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, storageId, totalUniqueSum);
    }

    @Override
    public String toString() {
        return "ItemReport{" +
                "itemName='" + itemName + '\'' +
                ", storageId='" + storageId + '\'' +
                ", totalUniqueSum=" + totalUniqueSum +
                '}';
    }
}

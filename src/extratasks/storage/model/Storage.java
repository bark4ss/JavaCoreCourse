package extratasks.storage.model;

import java.util.*;

public class Storage {

    private String storageId;
    private List<Item> items = new ArrayList<>();

    public Storage() {
    }

    public Storage(String storageId) {
        this.storageId = storageId;
    }

    public Storage(String storageId, List<Item> items) {
        this.storageId = storageId;
        this.items = items;
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotalSum () {
        double sum= 0.0;
        for (Item item:items) {
            sum += item.getSum();
        }

        return sum;
    }

    public int getTotalItemCount () {
        int total = 0;
        for (Item item:items) {
            total += item.getCount();
        }
        return total;
    }

    public Map<String,Double> getUniqueItemWithSum () {
        Map<String, Double> map = new HashMap<>();
        for (Item item : items) {
            double sum = item.getSum();
            if(map.containsKey(item.getName())){
                sum = map.get(item.getName()) + item.getSum();
            }
            map.put(item.getName(), Math.round(sum*100)/100D);
        }
        return map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Objects.equals(storageId, storage.storageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageId);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storageId='" + storageId + '\'' +
                ", items=" + items +
                '}';
    }
}

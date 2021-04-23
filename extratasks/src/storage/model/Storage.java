package storage.model;

import java.util.*;
import java.util.stream.Collectors;

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
        return items.stream().map(Item::getSum).reduce(0.0,Double::sum);
    }

    public int getTotalItemCount () {
        return items.stream().map(Item::getCount).reduce(0,Integer::sum);
    }

    public Map<String,Double> getUniqueItemWithSum () {
        return items.stream().collect(Collectors.groupingBy(Item::getName,Collectors.summingDouble(Item::getSum)));
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

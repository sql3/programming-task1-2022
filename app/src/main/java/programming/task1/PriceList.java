/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package programming.task1;

import java.util.HashMap;
import java.util.Map;

public class PriceList {
    private final Map<Integer, NameAndPrice> list = new HashMap<>();

    public Map<Integer, NameAndPrice> getList() {
        return list;
    }

    public boolean addProduct(int code, NameAndPrice product) {
        if (list.containsKey(code)) return false;
        list.put(code, product);
        return true;
    }

    public boolean replacePrice (int code, Double newPrice) {
        if (!list.containsKey(code)) return false;
        list.replace(code, new NameAndPrice(list.get(code).getName(), newPrice));
        return true;
    }

    public boolean replaceName (int code, String newName) {
        if (!list.containsKey(code)) return false;
        list.replace(code, new NameAndPrice(newName, list.get(code).getPrice()));
        return true;
    }

    public boolean deleteProduct (int code) {
        if (!list.containsKey(code)) return false;
        list.remove(code);
        return true;
    }

    public Double findCost(int code, int quantity) {
        return list.get(code).getPrice() * quantity;
    }
}

class NameAndPrice {
    private String name;
    private Double price;

    public NameAndPrice(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
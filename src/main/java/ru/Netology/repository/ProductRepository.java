package ru.Netology.repository;

import ru.Netology.domain.Product;

public class ProductRepository {
    private static Product[] items = new Product[0];

    public void save(Product item) {
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public static Product[] findAll() {
        return items;
    }

    public Product[] findByID(int id) {
        for (Product item : items) {
            if (item.getId() == id) {
                return items;
            }
        }
        return null;
    }

    public void removeById (int id) {
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
}

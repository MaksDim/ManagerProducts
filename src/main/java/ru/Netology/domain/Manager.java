package ru.Netology.domain;

import ru.Netology.repository.ProductRepository;

import static java.util.regex.Pattern.matches;

public class Manager {
    private Product[] products = new Product[0];

    public void add(Product product) {
        int length = products.length + 1;
        Product[] tmp = new Product[length];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = product;
        products = tmp;
    }

    public Product[] getAll() {
        Product[] result = new Product[products.length];
        for (int i = 0; i < result.length; i++) {
            int index = products.length - i - 1;
            result[i] = products[index];
        }
        return result;
    }

    public Manager() {

    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : ProductRepository.findAll()) {
            if (matches(product, text)) {

            }
        }
        return result;

    }
}

package com.mycrommerce.product_service.seed;

import com.mycrommerce.product_service.model.Product;
import com.mycrommerce.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() == 0) {
            seedProducts();
        }
    }

    private void seedProducts() {
        Product product1 = new Product();
        product1.setName("Wireless Mouse");
        product1.setDescription("A high-quality wireless mouse with ergonomic design.");
        product1.setPrice(29.99);

        Product product2 = new Product();
        product2.setName("Bluetooth Headphones");
        product2.setDescription("Noise-cancelling Bluetooth headphones with 30 hours of battery life.");
        product2.setPrice(79.99);

        Product product3 = new Product();
        product3.setName("Laptop Stand");
        product3.setDescription("Adjustable laptop stand for improved posture and comfort.");
        product3.setPrice(39.99);

        Product product4 = new Product();
        product4.setName("Smartphone Charger");
        product4.setDescription("Fast-charging USB-C cable and wall adapter for your smartphone.");
        product4.setPrice(19.99);

        Product product5 = new Product();
        product5.setName("Portable Speaker");
        product5.setDescription("Waterproof portable Bluetooth speaker with high-quality sound.");
        product5.setPrice(49.99);

        // Save the products into the database
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);
        productRepository.save(product5);

        System.out.println("Sample products added to the database.");
    }
}

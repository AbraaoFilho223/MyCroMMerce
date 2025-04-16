package com.mycrommerce.order_service.seed;

import com.mycrommerce.order_service.model.Order;
import com.mycrommerce.order_service.repository.OrderRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class DataSeeder {

    private final OrderRepository orderRepository;

    public DataSeeder(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostConstruct
    public void seed() {
        if (orderRepository.count() == 0) {
            List<Order> orders = List.of(
                new Order(1L, 1L, 2, 49.98, LocalDateTime.now().minusDays(5)),
                new Order(2L, 3L, 1, 19.99, LocalDateTime.now().minusDays(3)),
                new Order(3L, 2L, 4, 79.96, LocalDateTime.now().minusDays(1))
            );
            orderRepository.saveAll(orders);
        }
    }
}

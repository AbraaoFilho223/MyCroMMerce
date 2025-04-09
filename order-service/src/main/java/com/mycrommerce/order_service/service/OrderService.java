package com.mycrommerce.order_service.service;

import com.mycrommerce.order_service.model.Order;
import com.mycrommerce.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * Creates a new order.
     *
     * @param order The order to create.
     * @return The created order.
     */
    public Order createOrder(Order order) {
        // Set the current time as the order date
        order.setOrderDate(LocalDateTime.now());
        return orderRepository.save(order);
    }

    /**
     * Retrieves an order by its ID.
     *
     * @param id The ID of the order.
     * @return An Optional containing the Order if found, otherwise empty.
     */
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    /**
     * Retrieves all orders.
     *
     * @return A list of all orders.
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Additional methods (update, delete, etc.) can be added if needed
}

package com.mycrommerce.payment_service.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Entity representing a payment record.
 */
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;
    private String paymentMethod;
    private Double amount;
    private LocalDateTime paymentDate;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    public Payment() {
        this.paymentDate = LocalDateTime.now();
        this.status = PaymentStatus.PROCESSING;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDateTime getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDateTime paymentDate) { this.paymentDate = paymentDate; }

    public PaymentStatus getStatus() { return status; }
    public void setStatus(PaymentStatus status) { this.status = status; }
}
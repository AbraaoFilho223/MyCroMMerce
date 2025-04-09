package com.mycrommerce.payment_service.service;

import com.mycrommerce.payment_service.model.Payment;
import com.mycrommerce.payment_service.model.PaymentStatus;
import com.mycrommerce.payment_service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Service class containing business logic for payments.
 */
@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment processPayment(Payment payment) {
        payment.setPaymentDate(LocalDateTime.now());

        if (payment.getAmount() > 0) {
            payment.setStatus(PaymentStatus.SUCCESS);
        } else {
            payment.setStatus(PaymentStatus.FAILED);
        }

        return paymentRepository.save(payment);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Optional<Payment> getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }
}
package com.mycrommerce.payment_service.seed;

import com.mycrommerce.payment_service.model.Payment;
import com.mycrommerce.payment_service.model.PaymentStatus;
import com.mycrommerce.payment_service.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataSeeder implements CommandLineRunner {

    private final PaymentRepository paymentRepository;

    public DataSeeder(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        seedPayments();
    }

    private void seedPayments() {
        if (paymentRepository.count() == 0) {
            Payment payment1 = new Payment();
            payment1.setOrderId(1L);
            payment1.setPaymentMethod("Credit Card");
            payment1.setAmount(100.00);
            payment1.setPaymentDate(LocalDateTime.now());
            payment1.setStatus(PaymentStatus.SUCCESS);
            paymentRepository.save(payment1);

            Payment payment2 = new Payment();
            payment2.setOrderId(2L);
            payment2.setPaymentMethod("PayPal");
            payment2.setAmount(200.00);
            payment2.setPaymentDate(LocalDateTime.now());
            payment2.setStatus(PaymentStatus.FAILED);
            paymentRepository.save(payment2);

            Payment payment3 = new Payment();
            payment3.setOrderId(3L);
            payment3.setPaymentMethod("Bank Transfer");
            payment3.setAmount(50.00);
            payment3.setPaymentDate(LocalDateTime.now());
            payment3.setStatus(PaymentStatus.PROCESSING);
            paymentRepository.save(payment3);
        }
    }
}

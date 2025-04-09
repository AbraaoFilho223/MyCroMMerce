package com.mycrommerce.payment_service.repository;

import com.mycrommerce.payment_service.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for the Payment entity.
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
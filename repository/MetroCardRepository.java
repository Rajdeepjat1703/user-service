package com.webknot.user_service.repository;

import com.webknot.user_service.model.MetroCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MetroCardRepository extends JpaRepository<MetroCard, Long> {
    Optional<MetroCard> findByUserId(Long userId);

    MetroCard findByCardNumber(String cardNumber);
}


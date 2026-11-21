package com.bank.cards.card;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {

    List<Card> findByClientIdOrderByIdAsc(Long clientId);

    List<Card> findByClientIdAndStatusOrderByIdAsc(Long clientId, CardStatus status);

    List<Card> findAllByOrderByCreatedAtDescIdDesc();
}

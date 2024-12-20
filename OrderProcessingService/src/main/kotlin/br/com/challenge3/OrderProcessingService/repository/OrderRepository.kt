package br.com.challenge3.OrderProcessingService.repository

import br.com.challenge3.OrderProcessingService.domain.core.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository : JpaRepository<Order, Long> {
}
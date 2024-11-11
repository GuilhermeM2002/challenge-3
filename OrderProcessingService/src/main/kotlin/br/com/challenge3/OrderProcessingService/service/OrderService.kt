package br.com.challenge3.OrderProcessingService.service

import br.com.challenge3.OrderProcessingService.application.dto.OrderDto
import br.com.challenge3.OrderProcessingService.domain.core.Order
import br.com.challenge3.OrderProcessingService.domain.core.Status
import br.com.challenge3.OrderProcessingService.repository.OrderRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.OffsetDateTime

@Service
class OrderService {
    @Autowired
    private lateinit var modelMapper: ModelMapper
    @Autowired
    private lateinit var orderRepository: OrderRepository

    fun orderProcessing(dto : OrderDto){
        val newPrice : Double = dto.totalPrice - dto.totalPrice * 0.1
        val orderProcessed : Order = modelMapper.map(dto, Order::class.java)
        orderProcessed.setTotalPrice(newPrice)
        orderProcessed.setProcessingDate(OffsetDateTime.now())
        orderProcessed.setStatus(Status.PROCESSING)

        orderRepository.save(orderProcessed)
    }
}
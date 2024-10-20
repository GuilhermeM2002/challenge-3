package br.com.challenge3.OrderProcessingService.application.useCaseImpl

import br.com.challenge3.OrderProcessingService.application.dto.OrderDto
import br.com.challenge3.OrderProcessingService.domain.useCase.OrderConsumerUseCase
import br.com.challenge3.OrderProcessingService.service.OrderService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class OrderConsumerUseCaseImpl : OrderConsumerUseCase {
    @Autowired
    private lateinit var orderService: OrderService

    @KafkaListener(topicPattern = "orders", groupId = "group-1")
    override fun orderConsumer(order: String) {
        val dto : OrderDto = ObjectMapper().readValue(order, OrderDto::class.java)
        orderService.orderProcessing(dto)
    }
}
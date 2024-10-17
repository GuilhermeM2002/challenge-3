package br.com.challenge3.OrderProcessingService.domain.useCase

interface OrderConsumerUseCase {
    fun orderConsumer(order : String)
}
package br.com.challenge3.OrderProcessingService.application.dto

import java.time.OffsetDateTime

class OrderDto (
    var id : Long?,
    var listOfProducts : Set<Long>,
    var clientEmail : String,
    var address : String,
    var totalPrice : Double,
    var date : OffsetDateTime
) {
    constructor() : this(
        id = null,
        listOfProducts = emptySet(),
        clientEmail = "",
        address = "",
        totalPrice = 0.0,
        date = OffsetDateTime.now()
    )
}
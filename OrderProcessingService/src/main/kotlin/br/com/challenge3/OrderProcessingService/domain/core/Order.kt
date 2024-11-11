package br.com.challenge3.OrderProcessingService.domain.core

import br.com.challenge3.OrderProcessingService.infra.converter.SetOfLongsConverter
import jakarta.persistence.*
import java.time.OffsetDateTime

@Entity
@Table(name = "processed_orders ")
class Order(
    @Id
    private var id : Long?,

    @Column(name = "products", nullable = false)
    @Convert(converter = SetOfLongsConverter::class)
    private var listOfProducts : Set<Long>,

    @Column(name = "email", nullable = false)
    private var clientEmail : String,

    @Column(name = "address")
    private var address : String,

    @Column(name = "price", nullable = false)
    private var totalPrice : Double,

    @Column(name = "discounted_price")
    private var discountedPrice : Double,

    @Column(name = "date_order", nullable = false)
    private var date : OffsetDateTime,

    @Column(name = "processing_order")
    private var processingDate : OffsetDateTime,

    @Column(name = "status", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private var status : Status
) {
    constructor() : this(
        id = null,
        listOfProducts = emptySet(),
        clientEmail = "",
        address = "",
        totalPrice = 0.0,
        discountedPrice = 0.0,
        date = OffsetDateTime.now(),
        processingDate = OffsetDateTime.now(),
        status = Status.PENDING
    )

    // Getters e Setters
    fun getId(): Long? {
        return id
    }

    fun setId(id: Long?) {
        this.id = id
    }

    fun getListOfProducts(): Set<Long> {
        return listOfProducts
    }

    fun setListOfProducts(listOfProducts: Set<Long>) {
        this.listOfProducts = listOfProducts
    }

    fun getClientEmail(): String {
        return clientEmail
    }

    fun setClientEmail(clientEmail: String) {
        this.clientEmail = clientEmail
    }

    fun getAddress(): String {
        return address
    }

    fun setAddress(address: String) {
        this.address = address
    }

    fun getTotalPrice(): Double {
        return totalPrice
    }

    fun setTotalPrice(totalPrice: Double) {
        this.totalPrice = totalPrice
    }

    fun getDiscountedPrice(): Double {
        return discountedPrice
    }

    fun setDiscountedPrice(discountedPrice: Double) {
        this.discountedPrice = discountedPrice
    }

    fun getDate(): OffsetDateTime {
        return date
    }

    fun setDate(date: OffsetDateTime) {
        this.date = date
    }

    fun getProcessingDate(): OffsetDateTime {
        return processingDate
    }

    fun setProcessingDate(processingDate: OffsetDateTime) {
        this.processingDate = processingDate
    }

    fun getStatus(): Status {
        return status
    }

    fun setStatus(status: Status) {
        this.status = status
    }
}
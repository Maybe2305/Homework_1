fun main() {
    val minPriceForCommission = 35
    val commission = 0.0075
    val amount: Double = 10000.0
    val commissionForTransfer = if (amount * commission > minPriceForCommission)
        amount * commission else minPriceForCommission



    println("Комиссия составит: $commissionForTransfer руб.")
}



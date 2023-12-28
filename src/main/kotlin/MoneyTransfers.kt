fun main() {
    val minPriceForCommission = 35
    val commission = 0.0075
    val amount: Double = 1000.0
    val sumCommission = amount * commission
    val result = if (amount > minPriceForCommission) amount - sumCommission else amount
    val resultCommission = amount - result

    println("Комиссия составит: $resultCommission руб.")
}



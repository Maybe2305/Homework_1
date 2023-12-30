fun main() {
    var sumBuy = 500.0   // Сумма платежа до вычета скидок
    val middleSale = 100.0   // скидка на платёж от 1000 до 10000
    val bigSale = sumBuy * 0.05   // скидка на платёж более 10000
    val regularCustomer = true // Введите 'false' если клиент не является постоянным


    var resultSale = if (sumBuy <= 1000) sumBuy
    else if (sumBuy > 1000 && sumBuy <= 10_000) sumBuy - middleSale
    else if (sumBuy > 10_000) sumBuy - bigSale
    else sumBuy   // высчитали скидку для обычных клиентов


    val immenseSale = resultSale * 0.01   // скидка для постоянных клиентов

    val saleForRegularOrOrdinaryCustomer =
        if (regularCustomer) sumBuy - (sumBuy - resultSale) - immenseSale else resultSale   // высчитали скидку для постоянных клиентов

    println("Пользователь заплатит: $saleForRegularOrOrdinaryCustomer")
}
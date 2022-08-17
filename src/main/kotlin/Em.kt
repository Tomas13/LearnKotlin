import java.math.BigDecimal

enum class PaymentOptions {
    CASH,
    CARD,
    TRANSFER;

    var commission = BigDecimal.ZERO


}


fun main() {
    val c1 = PaymentOptions.CARD
    val c2 = PaymentOptions.CARD
    println(c1 == c2)

    c1.commission = BigDecimal.TEN
    println(c1.commission)

    val t = PaymentOptions.TRANSFER
    println(t.commission)
}

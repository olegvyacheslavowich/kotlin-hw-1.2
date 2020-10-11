import java.math.BigDecimal
import java.util.*

fun main() {

    val minAmount = BigDecimal(35);
    val input = Scanner(System.`in`)

    print("Enter transfer amount:")
    val amount = input.nextBigDecimal();

    if (amount < minAmount) {
        print("Amount less than $minAmount")
        return;
    }

    print("Transfer fee = ${countFee(amount)}")
}

fun countFee(amount:BigDecimal): BigDecimal {
    val feePercent = BigDecimal(0.75);
    return amount * feePercent / BigDecimal(100);
    }
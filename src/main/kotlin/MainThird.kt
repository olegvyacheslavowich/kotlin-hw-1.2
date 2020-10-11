fun main() {

    val previousBuyAmount = 12_031.10
    val isMusicLover = true;
    val currentBuyAmount = 13_000.00;

    print("Сумма оплаты после применения скидки: ${getCountAmount(previousBuyAmount, currentBuyAmount, isMusicLover)}")

}

fun getCountAmount(previousBuyAmount:Double, currentBuyAmount:Double, isMusicLover:Boolean):Double {

    var sumResult = currentBuyAmount;
    if (previousBuyAmount > 1000 && previousBuyAmount <= 10_000) {
        sumResult -= 100;
    } else if (previousBuyAmount > 10_000){
        sumResult -= sumResult * 0.05;
    }

    if (isMusicLover) {
        sumResult -= sumResult * 0.01;
    }

    return sumResult
}

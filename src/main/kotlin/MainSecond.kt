import java.util.*

fun main() {

    print("Введите количество лайков")
    val input = Scanner(System.`in`)
    val likesCount = input.nextInt()
    print("Понравилось $likesCount ${getEnding(likesCount)}")


}

fun getEnding(likesCount:Int):String {
    val manString = "человеку";
    val peopleString = "людям";
    val likesCountString = likesCount.toString().trim();
    return if (likesCountString.endsWith("1")) manString else peopleString
}
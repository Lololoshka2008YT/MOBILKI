import kotlin.random.Random

fun main(){
    val a = Random.nextInt(0, 100)
    while(true) {
        print("Введите число: ")
        val num = readln().toInt()
        when {
            num > a -> println("Меньше")
            num < a -> println("Больше")
            else -> {println("Вы угадали"); break}
        }
    }
}
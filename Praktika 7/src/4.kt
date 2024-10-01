fun main()
{
    var a = IntArray(10)
    for (i in 0..9) {
        a[i] = (1..100).random()
        print(" ${a[i]} ")
    }
    println("\nМинимальное число: ${a.min()} ")
}

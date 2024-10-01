fun main()
{
    println("Введите слово")
    val slovo= readln()
    val reverse=slovo.reversed()
    if(slovo==reverse)
    {
        println("Слово палиндром")
    }
    else{
        println("Слово не палиндром")
    }

}

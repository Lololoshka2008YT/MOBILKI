fun main()
{
    println("Введите температуру в Цельсиях")
    val cels= readln().toInt()
    println("Градусов в Фаренгейтах ${Faren(cels)}")

}
fun Faren(cels:Int):Double
{
    return if(cels==0)
    {
       32.0
    }
    else{
        cels*9.0/5+32
    }

}
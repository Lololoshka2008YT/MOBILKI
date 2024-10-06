fun main()
{
    println("Введите минуты: ")
    val min= readln().toInt()
    println("Введите FPS: ")
    val fps= readln().toInt()
    println("Кадров в $min минут: ")
   println(FPS(min,fps))
}

fun FPS(min:Int,fps:Int):Int
{
    val min=min*60
    val fps=fps*min
    return fps
}
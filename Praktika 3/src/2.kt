
fun main()
{
    print("Введите 3 числа: ")//После каждого введённого числа нажать Enter
    val x = readln().toInt()
    val y = readln().toInt()
    val z = readln().toInt()
    val max=maxOf(x,y,z)
    val min=minOf(x,y,z)
    if((x==y) or (x==z) or (y==z))
        println("ОШИБКА. Введено несколько равных чисел")
    else if((x<max) and (x>min))
        println("$x - среднее число")
    else if((y<max) and (y>min))
        println("$y - среднее число")
    else if((z<max) and (z>min))
        println("$z - среднее число")



}
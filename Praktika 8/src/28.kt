fun main()
{
    println("Введите размер массива: ")
    val n= readln().toInt()
    println(razmer(n).joinToString(" "))

}
fun razmer(n:Int):IntArray
{
    val a=IntArray(n)
    for(i in 1..n)
    {
        a[i-1]=i
    }
    return a
}
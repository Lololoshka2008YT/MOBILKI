fun main()
{
    println("Введите первое слово")
    val a= readln()
    println("Введите второе слово")
    val b= readln()
    if(anagram(a,b))
    {
        println("Слова $a и $b анаграммы")
    }
    else println("Слова $a и $b не анаграммы")

}
fun anagram(a:String,b:String):Boolean
{
    val first=a.replace(" ","").toCharArray().sorted()
    val second=b.replace(" ","").toCharArray().sorted()
    return first==second
}
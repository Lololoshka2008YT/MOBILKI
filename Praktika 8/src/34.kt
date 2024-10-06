fun main() {
    print("Введите строку: ")
    val a = readln()
    println(delete(a))
}
fun delete(a:String):String
{
    return a.replace(Regex(" "), "")
}
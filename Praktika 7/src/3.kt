fun main() {
    println("Введите количество побед")
    val win = readln().toInt()
    println("Введите количество ничьих")
    val draw = readln().toInt()
    println("Введите количество поражений")
    val lose = readln().toInt()
    WIN(win,lose,draw)
}
fun WIN(win: Int, lose:Int,draw:Int){

    println("Количество очков равно: ${win*3+draw*1+lose*0}")

}

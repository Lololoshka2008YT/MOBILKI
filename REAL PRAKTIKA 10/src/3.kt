fun main() {
    println("Введите текст:")
    val text = readln()
    println("Введите сдвиг:")
    val shift = readln().toInt()
    val encryptedText = caesarCipher(text, shift)
    println("Зашифрованный текст: $encryptedText")
}

fun caesarCipher(text: String, shift: Int): String {
    val alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
    val result = StringBuilder()
    val alphabetLength = alphabet.length

    for (char in text) {
        if (char.isLetter() && char.lowercaseChar() in alphabet) {
            val isUpperCase = char.isUpperCase()
            val baseIndex = if (isUpperCase) 'А'.toInt() else 'а'.toInt()
            val alphabetIndex = alphabet.indexOf(char.lowercaseChar())
            val newIndex = (alphabetIndex + shift) % alphabetLength
            val newChar = alphabet[newIndex]
            result.append(if (isUpperCase) newChar.uppercase() else newChar)
        } else {
            result.append(char)
        }
    }
    return result.toString()
}
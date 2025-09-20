import kotlin.math.pow

fun main() {
//  //задача 1
//    print("Введите строку из символов: ")
//    val str = readln().toCharArray()
//    var amo = 1
//    var otpt = StringBuilder()
//
//    for (i in 1 until str.size) {
//        if (str[i] == str[i - 1]) {
//            amo++
//        }
//        else {
//            if (amo == 1){
//                otpt.append(str[i - 1])
//                amo = 1
//            }
//            else{
//                otpt.append(str[i - 1])
//                otpt.append(amo)
//                amo = 1
//            }
//        }
//
//    }
//    if (amo == 1){
//        otpt.append(str[str.size - 1])
//    }
//    else{
//        otpt.append(str[str.size - 1])
//        otpt.append(amo)
//    }
//
//    println(otpt.toString())

//    //задача 2
//    print("Введите строку из символов: ")
//    val str = readln().toCharArray()
//    var amo = 1
//    var otpt = StringBuilder()
//    str.sort()
//
//    for (i in 1 until str.size){
//        if (str[i] == str[i - 1]){
//            amo ++
//        }
//        else{
//            otpt.append(str[i - 1])
//            otpt.append(" - ")
//            otpt.append(amo)
//            otpt.append("\n")
//            amo = 1
//
//        }
//    }
//    otpt.append(str[str.size - 1])
//    otpt.append(" - ")
//    otpt.append(amo)
//    println(otpt.toString())

//    //задача 3
//
//    print("Введите число (в 10-ой системе счисления: ")
//    var num = readln().toInt()
//    var rm = StringBuilder()
//
//    while (num.toDouble() / 2 != 0.0){
//        rm.append(num % 2)
//        num /= 2
//    }
//
//    print(rm.toString().reversed())

//    // задача 4
//    print("Введите два числа и оператор (+, -, /, *) : ")
//    val input = readln()
//    val parts = input.split(" ")
//
//    val number1 = parts[0].toDouble()
//    val number2 = parts[1].toDouble()
//    val operation = parts[2]
//
//    val result = when (operation) {
//        "+" -> number1 + number2
//        "-" -> number1 - number2
//        "*" -> number1 * number2
//        "/" -> if (number2 != 0.0) number1 / number2 else "Ошибка: деление на ноль."
//        else -> "Ошибка: неизвестная операция."
//
//    }
//
//    println("Результат: $result")


//    //задание 5
//
//    println("Введите целое число n и основание степени x (например: 27 3):")
//    val input = readln()
//    val parts = input.split(" ")
//
//    val n = parts[0].toInt()
//    val x = parts[1].toInt()
//
//    var y = 0
//    var power = 1 // x^0 = 1
//
//    while (power < n) {
//        y++
//        power = Math.pow(x.toDouble(), y.toDouble()).toInt()
//    }
//
//    if (power == n) {
//        println("Целочисленный показатель степени y: $y")
//    } else {
//        println("Целочисленный показатель не существует.")
//    }

    //6 задание


    println("Введите первую цифру:")
    val firstDigit = readln().trim()

    println("Введите вторую цифру:")
    val secondDigit = readln().trim()

    val digit1 = firstDigit[0] //из строки в символ
    val digit2 = secondDigit[0] //

    val check = if (digit1.toString().toInt() % 2 != 0){
        digit1 //условие вернуло переменную
    }
    else if (digit2.toString().toInt() % 2 != 0) {
        digit2
    }
    else null

    if (check != null) {
        // Создаем нечетное число
        val otherDigit = if (check == digit1) {
            digit2
        } else digit1
        val oddNumber1 = "$otherDigit$check"


        println("Созданные нечетные числа: $oddNumber1")
    } else {
        println("Создать нечетное число невозможно.")
    }


}


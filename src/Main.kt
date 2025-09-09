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

    //задача 3

    print("Введите число (в 10-ой системе счисления: ")
    var num = readln().toInt()
    var i = 0
    var near = 2;
    var res : Double

    while (near.toDouble().pow(i + 1).toInt() > num) {
        res = near.toDouble().pow(i)
        if (near.toDouble().pow(i + 1).toInt() < num && near.toDouble().pow(i + 1).toInt() > res) {
            i++
        }
        println(res)
    }


}


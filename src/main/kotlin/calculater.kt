package org.example

class calculator (var n1:Double, var n2:Double, op:String)

fun main() {
    //Int, Double는 숫자라 !! 필요, String은 문자라서 !! 필요 없음
    //val은 변함없는 값, var은 변화하는 값이라서 var 사용
    //안내 추가
    // readLine()!!이 readln()으로 변경 이유 : 추후 추가 예정
    println("첫번째 값은?")
    var n1 = readln().toDouble()
    println("골라골라 +, -, *, /, %")
    //readLine() -> readlnOrNull() 변경 이유 추후 추가 예정
    var op = readlnOrNull().toString()
    println("두번째 값은?")
    var n2 = readln().toDouble()
    //Int로 하면 소수점 계산하려면 Double
//lv2
    //-> 해봐야지
/*    if (op == "+") {
        println("${n1 + n2}")
        //${ }이 뭐지
        // 덧셈일 때
    } else if (op == "-") {
        // 뺄셈일 때
        println("${n1 - n2}")
    } else if (op == "*") {
        // 곱셈일 때
        println("${n1 * n2}")
    } else if (op == "/") {
        // 나눗셈일 때
        println("${n1 / n2}")
    } else if (op == "%") {
        // 나머지연산일 때
        println("${n1 % n2}")
    } else {
        // 잘못된 연산자 일 때
        println("잘못된 연산입니다.")
    }*/

    when (op) {
        "+" -> {
            println("${n1 + n2}")
            //${ }이 뭐지
            // 덧셈일 때
        }
        "-" -> {
            // 뺄셈일 때
            println("${n1 - n2}")
        }
        "*" -> {
            // 곱셈일 때
            println("${n1 * n2}")
        }
        "/" -> {
            // 나눗셈일 때
            println("${n1 / n2}")
        }
        "%" -> {
            // 나머지연산일 때
            println("${n1 % n2}")
        }
        else -> {
            // 잘못된 연산자 일 때
            println("잘못된 연산입니다.")
        }
    }
    //자동실행이 됐으면 좋겠다!!
}

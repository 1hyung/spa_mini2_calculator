package org.example
//람다표현식으로 변경하고 class 안에 fun 만들어서 넣고, calculator class 적용하려고 하니 막힘.
//op 입력이 잘못되도 값이 계산이 되고, 값이 5개가 출력되는 것을 변경하고 싶음.
import java.lang.Double.sum

//calculaor 실행이 안돼서 보니 fun이 calculator 안에 들어있어서 그럼
fun main() {
//    calculator(1.5, 2.0, "+") // 건물주가 되었다, 건물 인테리어 하기
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
    //람다 표현식으로 변경
    val Add: (n1: Double, b: Double) -> Double = { a, b -> a + b }
    println(Add(n1, n2))
    val Substract: (n1: Double, b: Double) -> Double = { a, b -> a - b }
    println(Substract(n1, n2))
    val multiply: (n1: Double, b: Double) -> Double = { a, b -> a * b }
    println(multiply(n1, n2))
    val Divide: (n1: Double, b: Double) -> Double = { a, b -> a / b }
    println(Divide(n1, n2))
    val remain: (n1: Double, b: Double) -> Double = { a, b -> a % b }
    println(remain(n1, n2))
    /*    when (op) {
            "+" -> {
                // 덧셈일 때
                println("${n1 + n2}")
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
        }*/
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


    //자동실행이 됐으면 좋겠다!!
}

class calculator(var n1: Double, var n2: Double, op: String) {
    // 실제 기능을 작동할 함수 fun 어쩌구 저쩌구}
    fun add(n1: Double, b: Double): Double {
        return n1 + n2
    }

    fun Substract(n1: Double, b: Double): Double {
        return n1 + n2
    }

    fun multiply(n1: Double, b: Double): Double {
        return n1 + n2
    }

    fun Divide(n1: Double, b: Double): Double {
        return n1 + n2
    }

    fun remain(n1: Double, b: Double): Double {
        return n1 + n2
    }

}

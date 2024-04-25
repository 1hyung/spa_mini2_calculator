fun main() {
//람다표현식으로 변경하고 class 안에 fun 만들어서 넣고, calculator class 적용하려고 하니 막힘.
    //op 입력이 잘못되도 값이 계산이 되고, 값이 5개가 출력되는 것을 변경하고 싶음.
    println("첫번째 값은?")
    var n1 = readln().toDouble()
    println("골라골라 +, -, *, /, %")
    var op = readlnOrNull().toString()
    println("두번째 값은?")
    var n2 = readln().toDouble()

/*    val calculator = calculator(n1, n2)
    calculator.add()
    calculator.Substract()
    calculator.multiply()
    calculator.Divide()
    calculator.remain()*/


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

}

//class는 고유의 특징값 "속성"과 기능의 구현인 "함수"로 이루어져 있다. 아직 함수는 구현 못함
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



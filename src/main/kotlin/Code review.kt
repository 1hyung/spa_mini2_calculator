fun main() {
//람다표현식으로 변경하고 class 안에 fun 만들어서 넣고, calculator class 적용하려고 하니 막힘.
    //op 입력이 잘못되도 값이 계산이 되고, 값이 5개가 출력되는 것을 변경하고 싶음.
    println("첫번째 값은?")
    var n1 = readln().toDouble()
    println("골라골라 +, -, *, /, %")
    var op = readlnOrNull().toString()
    println("두번째 값은?")
    var n2 = readln().toDouble()

    val caculater = calculator(n1, n2)
    when (op) {
        "+" -> {
            caculater.Add()
            println(caculater.Add())
        }

        "-" -> {
            caculater.Sub()
            println(caculater.Sub())
        }

        "*" -> {
            caculater.Multiply()
            println(caculater.Multiply())
        }

        "/" -> {
            caculater.Divide()
            println(caculater.Divide())
        }

        "%" -> {
            caculater.remain()
            println(caculater.remain())
        }

        else -> println("잘못된 입력입니다. 입력을 확인해주세요.")
    }

    /*        calculator.Add()
              calculator.Substract()
            calculator.multiply()
            calculator.Divide()
            calculator.remain()*/
//클래스의 존재 이유 속성 담아주는것을 안쓰고 있다

}

//class는 고유의 특징값 "속성"과 기능의 구현인 "함수"로 이루어져 있다. 아직 함수는 구현
class calculator(var n1: Double, var n2: Double) {
    // 실제 기능을 작동할 함수 fun 어쩌구 저쩌구} 3룸 아파트(필드)
    /*
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
    */


    //람다 표현식으로 변경 class로 이동 fun으로 / 변경 -> : 변경 / 익명함수를 함수로 바꾸는 과정
    fun Add(): Double = n1 + n2
    fun Sub(): Double = n1 - n2
    fun Multiply(): Double = n1 * n2
    fun Divide(): Double = n1 / n2
    fun remain(): Double = n1 % n2
    /*    fun Add2(a: Double, b: Double) : Double { return a + b }
        fun Substract (a: Double, b: Double) : Double = { a, b -> a - b }
        fun multiply (a: Double, b: Double) : Double = { a, b -> a * b }
        fun Divide (a: Double, b: Double) : Double = { a, b -> a / b }
        fun remain (n1: Double, b: Double) : Double = { a, b -> a % b }*/
}



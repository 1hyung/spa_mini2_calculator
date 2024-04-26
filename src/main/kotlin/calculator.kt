fun main() {

    println("첫번째 값은?")
    var n1 = readln().toDouble()
    println("골라골라 +, -, *, /, %")
    var op = readlnOrNull().toString()
    println("두번째 값은?")
    var n2 = readln().toDouble()

    val calculator = calculator(n1, n2)
    when (op) {
        "+" -> {
            val Add = calculator.Add()
            println(Add)
        }

        "-" -> {
            val Sub = calculator.Sub()
            println(Sub)
        }

        "*" -> {
            val Multiply = calculator.Multiply()
            println(Multiply)
        }

        "/" -> {
            val Divide = calculator.Divide()
            println(Divide)
        }

        "%" -> {
            val remain = calculator.remain()
            println(remain)
        }

        else -> println("잘못된 입력입니다. 입력을 확인해주세요.")
    }


}

class calculator(var n1: Double, var n2: Double) {

    fun Add(): Double = n1 + n2
    fun Sub(): Double = n1 - n2
    fun Multiply(): Double = n1 * n2
    fun Divide(): Double = n1 / n2
    fun remain(): Double = n1 % n2

}
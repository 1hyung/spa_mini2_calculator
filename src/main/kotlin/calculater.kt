package org.example

fun main() {
    var num1 = readLine()!!.toDouble()
    var operator = readLine().toString()
    var num2 = readLine()!!.toDouble()
//lv1
    if (operator == "+") {
        println("$num1 + $num2")
        // 덧셈일 때
    } else if(operator == "-") {
        // 뺄셈일 때
        println("$num1 - $num2")
    } else if(operator == "*") {
        // 곱셈일 때
        println("$num1 * $num2")
    } else if(operator == "/") {
        // 나눗셈일 때
        println("$num1 / $num2")
    } else {
        // 잘못된 연산자 일 때
        println("잘못된 연산입니다.")
    }
}
/*
package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main1() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}

// 어디 있든지 main에서 시작함
fun main() {
    val dataNumber = readLine()!!.toInt()
    val sum = dataNumber + 3
    println("입력은 ${dataNumber}인데 3을 더해서 ${sum}이예요!")
}*/
//fun main() {
//    if (false) {
//        println("if문 안에 들어왔어요")
//    }
//}
fun main() {

    /*    val value = 123

        when (value) {
            3 -> {
                println("값이 3입니다")
            }

            5 -> {
                println("값이 5입니다")
            }

            else -> {
                println("값이 3과 5가 아닙니다")
            }
        }*/
//특정 이름을 가진 사람일때 축하메시지를 띄워줘요
    var eventName = "참새"
    var myName = "참새"

    if (myName == eventName) {
        println("환영합니다 ${myName}님! 이벤트에 당첨됐어요!")
    } else {
        println("환영합니다 ${myName}님!")
    }
}

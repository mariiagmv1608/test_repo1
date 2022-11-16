fun main() {

    //логічний оператор if else
    var a1 = 6
    var a2 = true
    var a3 = false
    var a4 = 9
    if (a1==null){
        println("a1 is null")
        if (a2) println("true")
    } else if(a1==6){
        println("a1 = 6")
        if (!a3 && a4 == 8 ) println("1234567890")
    }
    else{
        println("a1 is $a1")
    }

    //------------------------------------------------
    //when

    val day = 4
//при оголошенні умовного оператора у дужках ми вказуємо, яку ми будемо перевіряти.
    //перевіряємо одну змінну, але на багато умов
    //аналог свіч кейс
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)


    //короткий запис
    var num = 1
    var res = if(num > 5) 1 else 0
    println(res)

}
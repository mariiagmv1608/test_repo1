fun main(){
    println(test1(7,4))
    var test2_res = test2(7,5)
    println(test2_res)//показать, что переменную надо оглашать до, а не после вызова
    var text_test = "text for test"
    println(test4(text_test))
}

fun test(): Int { //какой тип данных возвращ функция
    return 5+5
}

//fun test(): Int = 5+5
//}
//fun test() = 5+5
//}

fun test1(x: Int, y: Int): Int {
    return x+y
    //можно селать прінт вместо ретурн
}

fun test2(x: Int, y: Int): String { //можем вказати який тип данних поверне функція
    return "String is: ${x+y}" //функція повертає разультат, не виводить

}

fun test3(x: Int, y: Int): Unit { //unit - ничого не повертаэ, тып данных
    println("hello")

}

fun test4(text: String): String = "$text" //короткый запыс




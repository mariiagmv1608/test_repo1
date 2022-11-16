fun main(){
    val test1: String = "Hello"
    //test1 = "Goodbye" /**- не можна, бо val - константа**/
    //котлін строго типізована мова, проте тут він може передбачувати тип змінної, яку ми кладемо(на відміну від пайтона та js)

    var test2 = "Hello"
    test2 = "Hey"
    //test2 = 1

    println("Value of test2 $test2")
    println("${2+3}") /**альтернатива конкатинації у джава**/
//------------------------------------------------

    //Data types
    val v0: Byte = 1 //8 байт (-128 до 127)
    val v01: Short = 11 // 16 біт (числа від -32768 до 32767)
    val v1: Int = 2147483647 // 32 біта (-2147483648; 2147483647)
    val v2: Long = 5 // 64 біта - зберігаємо більше число

    val v3: Double = .1   // Double - 64
    val v4: Float = 1.34F   // Float - 32

    val myLetter = 'D'        // Char; числа присвоювати не можемо(хоча у джаві так можна, там певному символу відповідає якийсь код(ASCII))
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String


    //Перетворення типів

    val a1: Long = v1.toLong()

    //------------------------------------------------
    //оператори https://www.w3schools.com/kotlin/kotlin_operators.php


}



//class User -  створили найпростіший клас, який нічого в соби не має, але все одно є класом

//1
//class User {
//    var firstName: String = "Maria"
//    var lastName: String = "Grey"
//
//    fun printUser(){
//        println("$firstName $lastName")
//    }
//
//}

//-------------

//2
class User(var _firstName: String = "Name", var _lastName: String = "LastName"){

//var firstName: String = _firstName //спочатку просто вар без = та ініт + у конструкторі _імя
//var lastName: String = _lastName

//init{ //функція
//    firstName = _firstName
//    lastName = _lastName
//}

    //-----------------------
//3 конструктори
//--------------------------------------------------
//    constructor(): this("Peter", "Patric"){
//        println("дані встановлені")
//    }
//    constructor(firstName: String): this(firstName, "Grey"){
//        println("дані встановлені $firstName") //фамілія за замовчуванням
//    }
//------------------------------------------------------------

    //4 пропісиваем в основном классе дефолтние значенія
//5 - створимо нову змінну та не будемо прописувати через конструктор

    var login: String? = null


}
fun main() {
//    val maria = User()
//--------------------------
//    val maria = User() - екземпляр
//    maria.lastName = "Brown" - властывисть
////    println(maria.firstName)
//    maria.printUser() - метод
//
//    val john = User()
//    john.firstName = "John"
//    john.lastName = "Doe"
//    john.printUser()
    //-----------------------------


    val maria = User("Maria", "Brown")
//    maria. - не виведе, бо не встановлюємо ніяких властывостей
    println(maria._firstName)

    //конструктор, якщо не передамо параметри
    val peter = User()
    println(peter._lastName)

    val grey = User("Dorian")
    println(grey._lastName)


    //логін, п5
 grey.login = "Codi"
 println(grey.login)
}
fun main(){
    //for each
    val items = listOf("apple", "orange", "lemon") //метод повертає незмінний список(не змін пот знач, ні дод нові)
    //mutableListOf() - буде змінюв

    for (item in items){
        println(item)
    }

    //while
    var index = 0
    while (index < items.size) {
        println("Item at $index  is ${items[index]}")
        index++
    }

    //Діапазони(є у пітоні)
    //3...10(от 3 до 10)
    println(5 in 3..10)

    for (i in 3..10){
        println(i)
    }

    for (i in 1 until 10){
        println(i) //10 не включітельно
    }

   // for(i in 10 downTo 1)//в убыв порядке

    for (i in 0..100 step 10){
        println(i)
    }

}
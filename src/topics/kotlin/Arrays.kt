fun main(){
     // Создание пустого массива


var nums = arrayOf("one", "two")
nums[0] = "some" // Изменение элементов в массиве

// Также можно создавать списки, что обладают большим набором функций
var nums2 = listOf(1, 2, 3, 5) // Присвоение всех значений сразу

var user = mutableMapOf("name" to "Bob", "age" to 1, "isHasCar" to true)




val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
println(cars.size)

cars.forEach {el ->
    println(el)
}
}
package fundamentals.function

fun main() {
//  println(square(24))
  val price = getPrice(price = 10.99)
//  println(price)

  val newPrice = getPrice(currency = "e", price = 12.99)
//  println(newPrice)

  val reminderAfterDivision = getReminderAfterDivision(10, 2)
//  println(reminderAfterDivision)

  val reminder = getReminder(5, 2)
//  println(reminder)
  val sum = getSum(5, 15, 32, 14)
//  println(sum)

  val numbers = intArrayOf(5, 15, 32, 55, 12)
  val sumArray = getSum(*numbers)
//  println(sumArray)
  val lastSum = getSum(5, *numbers, 1)
  println(lastSum)

}

fun square(number: Int): Int {
  return number * number
}

fun getPrice(currency: String = "$", price: Double) = "$currency$price"

fun getReminderAfterDivision(a: Int, b: Int): Int {
  return a % b
}

//simplified version which is called single-expression function
fun getReminder(a: Int, b: Int)  = a % b

fun getSum(vararg numbers: Int) = numbers.sum()
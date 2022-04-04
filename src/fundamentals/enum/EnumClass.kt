package fundamentals.enum

fun main() {
  val winter = Seasons.WINTER
  println(winter)

  Seasons.values().forEach {
      println(it)
  }

  println(winter.getNumberOfSeasons()) //We can call it using the already created object.
  println(Seasons.AUTUMN.getNumberOfSeasons()) //We can call it using the enum class.
}
enum class Seasons {
  WINTER,
  SPRING,
  SUMMER,
  AUTUMN;

  fun getNumberOfSeasons() = 4
}

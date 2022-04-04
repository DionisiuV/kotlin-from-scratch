package fundamentals.enum.advance

fun main() {
  val distance = Planet.MOON.convertDistance()
  println(distance)
  enumValues<Planet>().forEach { println(it)}
}
enum class Planet(val planet: String, val distance: Int) {
  MOON(planet = "MOON", distance = 384_400),
  MARS(planet = "MOON", distance = 384_400),
  JUPITER(planet = "MOON", distance = 384_400);

  fun convertDistance() = this.distance * 1_000
}

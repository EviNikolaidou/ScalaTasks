package day3

object Functional1 extends App {
  val timezones = java.util.TimeZone.getAvailableIDs
  val countries = for (zone <- timezones if zone.contains("/*")) yield {
    zone.stripPrefix("/*")
  }
  println(countries)
}
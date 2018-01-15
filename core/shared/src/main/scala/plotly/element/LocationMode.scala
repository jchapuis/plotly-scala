package plotly.element

sealed abstract class LocationMode(val label: String) extends Product with Serializable

object LocationMode {
  case object ISO3 extends LocationMode("ISO-3")
  case object UsaStates extends LocationMode("USA-states")
  case object CountryNames extends LocationMode("country names")
}

object Show extends App{

}
trait Show[A] {
  def show(aValue: A): String ="abstract"
}
class longShow{
  def longValue(aValue: Long): String = {
    "Long Show Method"
  }

  val longShowObj: Show[Long] = new Show[Long] {
    override def show(aValue: Long): String = aValue.toString
  }
}
class doubleShow {
  def doubleShowMethod(avalue: Double): String = {
    "Double Show Method"
  }

  val doubleShowObj: Show[Double] = new Show[Double] {
    override def show(aValue: Double): String = aValue.toString
  }
}
case class Position(xaxis: Int, yaxis: Int){
val position: Show[Position] = new Show[Position] {
  override def show(aValue: Position): String = aValue.toString
}
}
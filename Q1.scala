object Q1 extends App{
  def calcAvg(temps: List[Int]): Double = {
    val f = temps.map(_ * (9.0 / 5.0) + 32.0)
    f.reduce(_ + _) / f.length
  }

  val temps = List(0, 10, 20, 30) //32,50,68,86 
  val avg = calcAvg(temps)
  println(s"Average Fahrenheit temperature: $avg")
}

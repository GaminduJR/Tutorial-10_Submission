object Q2 extends App {
  def countLetterOccurrences(words: List[String]): Int = {
    val totalLength = words.map(_.length).reduce(_ + _)
    totalLength
  }

  val words = List("apple", "banana", "cherry", "date")
  val totalCount = countLetterOccurrences(words)
  println(s"Total count of letter occurrences: $totalCount")
}

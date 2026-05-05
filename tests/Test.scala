object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(58, 99, 25, 7, 9)
    assert(Policy.score(signalcase_1) == 118)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(70, 106, 8, 23, 11)
    assert(Policy.score(signalcase_2) == 94)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(92, 89, 18, 15, 5)
    assert(Policy.score(signalcase_3) == 129)
    assert(Policy.classify(signalcase_3) == "review")
  }
}

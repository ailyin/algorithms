package com.ailyin

import scala.util.Random

object AlgoUtils {

  def createArray(len: Int): Array[Int] = {
    val arr = new Array[Int](len)
    for (i <- 0.until(len)) {
      arr(i) = Random.nextInt(10000)
    }
    arr
  }

}

package org.example

case class DataIris (
                  sepal_length: Double,
                  sepal_width: Double,
                  petal_length: Double,
                  petal_width: Double
                )

object DataIris {
  def apply(a: Array[String]): DataIris =
  DataIris (
      a(0).toDouble,
      a(1).toDouble,
      a(2).toDouble,
      a(3).toDouble
    )
}
package me.tongfei.proxima.index

import poly.algebra._

/**
  * @author Tongfei Chen
  */
class ExhaustiveNearestNeighbor[K, T, R](samples: Map[K, T])(implicit sim: Similarity[T, R]) extends RetrievalEngine[K, T] {
  def topK(k: Int)(x: T) =
}

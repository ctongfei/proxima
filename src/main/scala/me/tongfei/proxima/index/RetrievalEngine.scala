package me.tongfei.proxima.index

/**
  * @author Tongfei Chen
  */
trait RetrievalEngine[K, T] {

  def topK(k: Int)(x: T): Seq[K]

}

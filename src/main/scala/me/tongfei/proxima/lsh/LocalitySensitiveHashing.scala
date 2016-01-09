package me.tongfei.proxima.lsh

import poly.algebra._

/**
  * @author Tongfei Chen
  */
trait LocalitySensitiveHashing[-Element, +Signature] extends Similarity[Element, Double] {

  def hash(t: Element): Signature

}

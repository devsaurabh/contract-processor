package com.example.contracts

class DslContract extends Contract {
  /**
    * Processes the DSL
    *
    * @return String value
    */
  override def process(): String = {
    // perform some operation
    "Processed dsl"
  }

  def apply: DslContract = new DslContract()
}
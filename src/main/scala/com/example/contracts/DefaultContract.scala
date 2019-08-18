package com.example.contracts

class DefaultContract extends Contract {
  /**
    * Processes the task
    *
    * @return String value
    */
  override def process(): String = {
    // this is the default contract
    "No valid processor found. Using default"
  }

  def apply: DefaultContract = new DefaultContract()
}

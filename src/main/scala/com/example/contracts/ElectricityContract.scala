package com.example.contracts


class ElectricityContract extends Contract {
  /**
    * Processes the Electricity
    *
    * @return result after processing
    */
  override def process(): String = {
    // perform some operation
    "Processed electricity"
  }

  def apply: ElectricityContract = new ElectricityContract()
}
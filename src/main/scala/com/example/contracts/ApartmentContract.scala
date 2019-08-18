package com.example.contracts

class ApartmentContract extends Contract {
  /**
    * Processes the Apartment contract
    *
    * @return String value
    */
  override def process(): String = {
    // perform some operation
    "Processed apartment_rent"
  }

  def apply: ApartmentContract = new ApartmentContract()
}

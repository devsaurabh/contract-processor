package com.example.helpers

import com.example.contracts.{ApartmentContract, Contract, DefaultContract, DslContract, ElectricityContract}

object ContractFactory {
  private val mappings: Map[String, Class[_ <: Contract]] =
    Map(
      ContractType.Electricity -> classOf[ElectricityContract],
      ContractType.Apartment -> classOf[ApartmentContract],
      ContractType.Dsl -> classOf[DslContract]
    ).withDefaultValue(classOf[DefaultContract])

  def apply(someType: String): Contract = {
    mappings(someType).getDeclaredConstructor().newInstance()
  }
}

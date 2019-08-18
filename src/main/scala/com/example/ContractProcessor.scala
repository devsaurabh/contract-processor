package com.example

import com.example.helpers.ContractFactory

class ContractProcessor {
  def processContract(contractType: String): Unit = {
    val processor = ContractFactory(contractType)
    println(processor.process())
  }
}

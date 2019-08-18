package com.example

object Main extends App {
  val contractProcessor = new ContractProcessor

  contractProcessor.processContract("electricity")
  contractProcessor.processContract("dsl")
  contractProcessor.processContract("apartment")
  contractProcessor.processContract("invalid")
}

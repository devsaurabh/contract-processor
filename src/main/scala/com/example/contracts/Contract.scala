package com.example.contracts

/**
  * A simple generic trait which defines a task to process
  */
trait Contract {
  /**
    * Processes the task
    * @return String value
    */
  def process(): String
}

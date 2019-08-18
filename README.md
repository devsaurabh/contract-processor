# Contract Processor
A simple app to process various type of contracts/agreements

### Requirement
Given a type, call individual method based on type without modifying the original method if new types are added.

### Solution
This is a simple use case of Factory design pattern for object creation based on type.

### Approach
First, create a base trait for all the contracts
```
trait Contract {
  /**
    * Processes the task
    * @return String value
    */
  def process(): String
}
```
then implement individual contracts
```
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
```
Now, create a Contract Factory and map each contract with a type
```
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
```

### Project Requirements
- Scala version: 2.12.7
- SBT Version: 1.2.8

### Running the Project
Run the Main.scala from withing the IDE or run the compiled jar.

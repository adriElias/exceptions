# Custom Exceptions and Error Handling

Educational Java project to practice:

- Creating and using **custom exceptions**
- Difference between **checked** and **unchecked** exceptions
- Working with collections (`ArrayList<Product>`)
- Handling common runtime errors like `IndexOutOfBoundsException`
- Input validation before performing critical operations

## Objectives

- Create a custom exception and learn how to throw and catch it
- Work with collections (`ArrayList<Product>`) and perform calculations on data
- Detect and handle typical errors such as `IndexOutOfBoundsException`

## Statement Summary

Simple sales management application:

- Class `Product`: name and price
- Class `Sale`: contains a list of products (`ArrayList<Product>`) and a total price
- Method `calculateTotal()`:
    - If the product list is empty → throws custom exception `EmptySaleException`
    - If products exist → sums prices and stores the total
- Intentionally trigger and catch an `IndexOutOfBoundsException` (e.g., accessing invalid index)
- Final step: change `EmptySaleException` to extend `RuntimeException` (unchecked)

## Project Structure
```text
src/
├── Product.java
├── Sale.java
├── EmptySaleException.java
└── Main.java               # tests and demonstration
```
## Main Classes

```text
| Class                   | Type                         | Main Responsibility                                      |
|-------------------------|------------------------------|------------------------------------------------------------------|
| `Product`               | Regular class                | Represents a single product (name + price)                       |
| `Sale`                  | Class                        | Manages list of products and calculates sale total               |
| `EmptySaleException`    | Custom exception             | Thrown when trying to calculate total on an empty sale           |
| `Main`                  | Executable class             | Demonstrates adding products, calculating total, error handling  |
```
## How to Run

```bash
javac src/*.java
java -cp src Main
```
## Expected Output(Example)
```text
Adding products...
Calculating total...
Sale total: 47.5 €

Testing empty sale...
Error: To make a sale you must first add products

Testing out-of-bounds access...
Error: Index 5 out of bounds for length 3
```
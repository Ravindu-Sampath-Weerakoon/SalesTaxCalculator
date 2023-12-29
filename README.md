# SalesTaxCalculator
This repository contains a very simple Java program that simulates a sales tax calculator. It includes a Tax class to represent products, calculate taxes, and print details. The DriverQ3 class demonstrates the usage of the Tax class.

## Usage
The DriverQ3 class demonstrates how to use the Tax class to calculate taxes for a product (e.g., a television) and print the details.

## Purpose

The code aims to:

1. Provide an educational example for basic OOP concepts in Java.
2. Showcase the implementation of a simple sales tax calculator.

## Tax Class Structure and Main Methods

The `Tax` class is structured as follows:

1. Fields:
   - `productName`: String
   - `price`: float
   - `imported`: boolean
   - `exempted`: boolean
   - `tax`: float
   - `taxedPrice`: float

2. Constructors:
   - `public Tax()`
   - `public Tax(String productName, float price, boolean imported, boolean exempted)`

3. Methods:
   - `public void storeTheAmountOfTax()`: Calculates and stores the amount of tax based on product details.
   - `public void calculateAndSoreTheTaxedPrice()`: Calls `storeTheAmountOfTax` and calculates the taxed price.
   - `public void printTheDetailsOfTaxObject()`: Calls `calculateAndSoreTheTaxedPrice` and prints product details, tax, and taxed price.

## DriverQ3 Class and Usage

The `DriverQ3` class demonstrates the usage of the `Tax` class:

1. Creates a `Tax` object for a television.
2. Prints the details using the `printTheDetailsOfTaxObject` method.

## Usage

The code provides a hands-on learning experience for:

- Understanding basic OOP principles in Java.
- Implementing a simple sales tax calculator.

## Contributing

Contributions are welcome! If you have suggestions, improvements, or bug fixes, feel free to create a pull request. Let's enhance this educational resource together.

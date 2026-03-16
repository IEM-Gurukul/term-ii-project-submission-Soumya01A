[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

E-Commerce Shopping Cart Management System

## Problem Statement (max 150 words)

Online shopping is widely used today, but in some systems shopping cart management is not handled efficiently. Users may face difficulties while adding, updating, or removing items from their shopping cart. This can make the shopping process confusing and inefficient. Therefore, there is a need for a simple system that can manage shopping cart operations effectively.
The proposed E-Commerce Shopping Cart Management System will allow users to add items, update quantities, remove items, and calculate the total cost of products in the cart. The system will be developed using object-oriented programming concepts such as classes, inheritance, polymorphism, and exception handling to ensure better organization and maintainability.

## Target User

Online shoppers who want to manage their cart items easily and efficiently.

## Core Features

1) Add items to the shopping cart
2) Update item quantity
3) Remove items from the cart
4) Display items in the cart
5) Calculate total price

## OOP Concepts Used

- Abstraction: Using classes such as Product and ShoppingCart to hide internal implementation and provide only necessary functionalities
- Inheritance: A base Product class can be extended by other product types if needed.
- Polymorphism: Methods can perform different operations depending on the object used.
- Exception Handling: Used to handle errors such as invalid input, incorrect quantity, or operations on an empty cart.
- Collections / Threads: Java ArrayList is used to store and manage cart items dynamically.

## Proposed Architecture Description
The system consists of several classes: Product, ShoppingCart, and OrderManager.
The Product class stores product information such as product ID, name, and price. The ShoppingCart class manages operations like adding, removing, and updating items in the cart. The OrderManager class calculates the total cost of the items. These classes interact together to create a simple and organized shopping cart management system.

## How to Run
1) Install Java JDK on your system.
2) Open the project in an IDE such as IntelliJ IDEA, Eclipse, or VS Code.
3) Compile the Java files.
4) Run the Main.java file to start the application.

## Git Discipline Notes
Minimum 10 meaningful commits required.

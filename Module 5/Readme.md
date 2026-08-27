# ☕ Java Programming for Beginners – Module 5 (Final Project)
This folder contains my final project from Module 5 of the Java Programming for Beginners course by IBM on Coursera.

## 🛒 About This Project
Project Name: Grocery Shopping Console Application

For this final project, I built a stand-alone console application for a grocery shop. The program calculates the total bill for items a customer chooses based on unit price and quantity, and goes further with search by name, filtering by price, average price calculation, discounted billing, and inventory management.

## 🖥️ Sample Output
```
========================================
       WELCOME TO THE GROCERY SHOP
========================================
--- Testing searchItem() ---
Found 'Bread' at index 2
Item not found.

--- Testing calculateAveragePrice() ---
Average price of all items: $1.78

--- Testing filterItemsBelowPrice() ---
Items below $1.00:
- Sugar ($0.5)
- Tea Pack ($0.3)
- Spaghetti ($0.8)
- Salt ($0.4)
- Biscuits ($1.0)

Items below $2.50:
- Sugar ($0.5)
- Tea Pack ($0.3)
- Bread ($2.0)
- Milk ($1.5)
- Rice ($1.0)
- Flour ($1.2)
- Spaghetti ($0.8)
- Salt ($0.4)
- Biscuits ($1.0)
- Yogurt ($1.8)
- Butter ($2.2)
- Mix Spices ($2.0)
- Black pepper ($1.5)
- Pasta ($1.3)
- sauces ($1.6)

Enter the name of the item (or type 'finish' to end shopping):
Bread
Enter the quantity of Bread:
2
Added 2 x Bread to the bill. Current total: $4.0
Enter the name of the item (or type 'finish' to end shopping):
finish
Your original total is: $4.0
No discount applied.
Thank you for shopping with us!
Thank you for using the shopping cart. Goodbye!
```

## 📚 Topics Covered
In this module, I applied everything learned across the course to build a stand-alone console application from scratch.
Topics included:

* Creating a Java Program
* Public class with a public main method as the entry point
* Strings and String Operations
* Comparing item names with equalsIgnoreCase
* Operators and Data Types
* Working with String, float, and int arrays together
* Exception Handling
* Creating a custom checked exception (ItemNotFoundException extends Exception)
* Throwing and catching exceptions with try-catch
* Loops
* Nested while loops (outer loop for multiple customers, inner loop for one customer's shopping)
* for loops to iterate through arrays
* Conditional Statements
* Checking stock, quantity, and discount thresholds
* Arrays
* Iterating through String, float, and int arrays by index
* Methods and Functions
* Writing and calling reusable methods (searchItem, calculateAveragePrice, filterItemsBelowPrice)

## 💻 Lab Work
The project includes a hands-on console application, GroceryShopping.java, covering:

* Building item, price, and stock arrays (20 grocery items)
* Reading user input with Scanner
* Throwing and catching a custom ItemNotFoundException
* Calculating and printing a running total bill
* Searching for an item by name and printing its index
* Calculating the average price of all items
* Filtering and printing items below a given price threshold
* Applying a discount to the total bill when a condition is met
* Managing inventory: checking stock before a purchase and reducing it after

## 📝 Practice & Assessment
Final Project
Grocery Shopping Console Application ✅

## 📖 Additional Learning Materials
The project also includes:

* Sample code walkthroughs provided in the lab instructions
* Additional challenges section covering search, average price, filtering, discounts, and inventory management

## 🛠️ Technologies Used

* Cloud IDE
* Java
* JDK 21

## 🎯 Learning Goal
The goal of this final project was to apply the full range of skills from the course — strings, operators, exceptions, loops, conditionals, arrays, and methods — to build a working, stand-alone console application from a set of requirements.

Course: Java Programming for Beginners – Coursera Module: 5 – Final Project (Grocery Shopping Application) Status: Completed ✅

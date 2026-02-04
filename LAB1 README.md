

# Java Array Problems Assignment

## Overview

This project contains solutions to three array-based problems written in **Java**.
The programs focus on using **arrays, loops, methods, and user input** to solve real-world style problems.

---

## Problems Included

### Problem 1: Two Sum Problem

This program finds two indices in an integer array whose values add up to a given target.

**Program Features**

* Prompts the user to enter:

  * Number of elements
  * Values of the array
  * Target sum
* Uses a `twoSum` method that:

  * Accepts an integer array and a target value
  * Returns an array containing the two indices
* Displays the indices of the two numbers that add up to the target

**Constraints**

* Exactly one valid solution exists
* The same element cannot be used twice
* Array contains at least two elements

**Sample Output**

```
Output: [0, 1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9
```

---

### Problem 2: Best Time to Buy and Sell Stock

This program calculates the **maximum profit** that can be achieved from stock prices entered by the user.

**Program Features**

* Allows the user to:

  * Enter number of days
  * Enter stock prices for each day
* Calculates the maximum profit using multiple transactions
* Ensures only one stock is held at a time
* Asks the user if they want to run the program again (`y/n`)

**Rules**

* Buy and sell can occur on the same day
* If no profit is possible, output is `0`

**Sample Output**

```
Maximum Profit: 7
Do you want to run again? (y/n): n
Program ended. Goodbye!
```

---

### Problem 3: Weekly Employee Hours

This program computes total weekly working hours for employees using a **2D array**.

**Program Features**

* Each row represents an employee
* Each column represents one day of the week
* Calculates total weekly hours for each employee
* Displays:

  * Each employee’s total hours
  * Employee with the **highest** total hours
  * Employee with the **lowest** total hours

**Sample Output**

```
Employee 7 with 41 hours
Employee 2 with 20 hours
```

---

## Technologies Used

* Java
* Arrays (1D and 2D)
* Loops
* Methods
* Scanner for user input

---

## How to Run

1. Open the project in a Java IDE (IntelliJ, Eclipse, or VS Code)
2. Compile the program
3. Run the main class
4. Follow the on-screen prompts

---

## Author

**Jameil Chalmers**

---

If you want, I can:

* Split this into **separate READMEs per problem**
* Make it **shorter** or more **formal**
* Match a specific **professor’s rubric**

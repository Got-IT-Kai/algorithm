# Algorithm & Data Structure Practice
This repository is my personal space for solving algorithm challenges, primarily from [LeetCode](https://leetcode.com/).

The main goal is to consistently practice problem-solving skills and deepen my understanding of data structures and algorithms using Java.

## Focus Areas

* **Problem Solving**
  * Developing logical thinking to solve complex problems efficiently.
* **Data Structures**
  * Implementing and utilizing fundamental data structures (e.g., Arrays, Trees, Graphs, Hash Tables).
* **Algorithms**
  * Applying core algorithms (e.g., Sorting, Searching, Dynamic Programming, BFS/DFS).
* **Clean Code & Testing**
  * Writing readable, well-structured code and verifying its correctness with unit tests (`JUnit 5`).

## Project Structure

To maintain clarity and organization, solutions are grouped by difficulty.

Each problem solution is managed within its own package to ensure it is self-contained.

```tree
.
├── src
│   ├── main
│       └── java
│           └── dev
│               ├── easy
│               │   └── problem_name
│               ├── medium
│               │   └── problem_name
│               └── hard
│                   └── problem_name

```

## Review and Repetition Strategy

Repetition is key to mastery. My strategy for reviewing previously solved problems is as follows:

* **Create a New Solution Class**
  * For a problem I want to review (e.g., `TwoSum`), I will create a new, separate class (e.g., `TwoSum_1`).
* **Reuse the Test Case**
  * The original test file (`TwoSumTest.java`) will be updated to include tests for the new review class.
  * This allows me to verify the new solution against the same set of established test cases.
* **Rewrite from Scratch**
  * I will re-implement the solution logic from scratch in the new class, relying only on my current understanding.

This active-recall method helps solidify my understanding rather than passively re-reading old code.

## Tech Stack

* **Language**: Java (21)
* **Build Tool**: Gradle (with Kotlin DSL)
* **Testing**: JUnit 5
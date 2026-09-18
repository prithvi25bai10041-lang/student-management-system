# Student Management System

A lightweight, console-based Java application designed to manage student records efficiently. The system allows users to create, view, search, and generate reports on student data while persisting records locally using file I/O operations.

## Author Details
* **Author**: PRITHVI SIKARWAR
* **Registration Number**: 25BAI10041

## Overview

The **Student Management System** provides a simple interface for handling basic student information (Name, Roll Number, and Course). Built using Object-Oriented Programming (OOP) principles in Java, it automatically loads saved records upon launch and persists updates directly to a text file (`students.txt`), ensuring data retention across sessions.

## Features

* **Add Student**: Interactive prompt to capture a student's name, roll number, and course, auto-saving data to persistent storage.

* **View Students**: Displays a full list of all currently enrolled students.

* **Search Student**: Allows searching for a specific student using their unique Roll Number.

* **Generate Summary Report**: Displays all student details along with the total count of enrolled students.

* **Data Persistence**: Uses automatic file read/write mechanisms (`students.txt`) so no data is lost when closing the application.

## Technologies/Tools Used

* **Programming Language**: Java (JDK 17 or higher recommended)

* **Concepts Applied**:

  * Object-Oriented Programming (OOP)

  * Java Collections Framework (`ArrayList`, `List`)

  * File I/O (`BufferedReader`, `BufferedWriter`, `FileReader`, `FileWriter`)

  * Stream/Lambda Expressions

* **Build Tool / Execution**: Java Command Line (`javac`, `java`) or any standard IDE (IntelliJ IDEA, Eclipse, VS Code).

## Steps to Install & Run the Project

### Prerequisites

Make sure you have Java Development Kit (JDK) installed on your system. You can verify installation by running:

```
java -version
javac -version
```

### Installation & Execution

1. **Clone or Download the Repository**

   ```
   git clone <repository-url>
   cd <repository-folder>
   ```

2. **Navigate to the Source Directory**

   ```
   cd src
   ```

3. **Compile the Java Files**
   Compile all `.java` source files using `javac`:

   ```
   javac *.java
   ```

4. **Run the Application**
   Launch the main application using the `Main` class:

   ```
   java Main
   ```

## Instructions for Testing

Follow these steps to test all major workflows in the application:

1. **Adding Students (Option 1)**

   * Select option `1`.

   * Input: Name (`John Doe`), Roll No (`101`), Course (`Computer Science`).

   * Expected Output: `Students saved to file successfully!` and `Student added successfully!`.

2. **Viewing Students (Option 2)**

   * Select option `2`.

   * Expected Output: A list of all added students formatted as:

     `Roll No: 101, Name: John Doe, Course: Computer Science`

3. **Searching for a Student (Option 3)**

   * Select option `3`.

   * Input an existing Roll No: `101`.

   * Expected Output: `Found: Roll No: 101, Name: John Doe, Course: Computer Science`.

   * Test non-existing Roll No: `999`.

   * Expected Output: `Student not found.`.

4. **Generating Report (Option 4)**

   * Select option `4`.

   * Expected Output:

     ```
     --- Student Report ---
     Roll No: 101, Name: John Doe, Course: Computer Science
     Total Students: 1
     ```

5. **Testing Persistence**

   * Exit the application using option `5`.

   * Relaunch the application (`java Main`).

   * Verify that `students.txt` is detected and loaded automatically on startup (`Students loaded from file successfully!`).

## Screenshots

> *Note: Place your console output screenshots inside a `screenshots/` directory and update the relative paths below if applicable.*

### Main Menu & Output

```
--- Student Management System ---
1. Add Student
2. View Students
3. Search Student
4. Generate Report
5. Exit
Enter choice: 
```

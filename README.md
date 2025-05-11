# Employee Management System

A simple Java application that demonstrates core Object-Oriented Programming principles and GUI development with Java Swing.

## Project Overview

This Employee Management System allows users to:
- Add employee records with name, email, and employee ID
- View employee details
- Search for employees by ID
- Delete employee records
- Check employee access levels based on ID

The application is available in both Command Line Interface (App.java) and Graphical User Interface (EmployeeSwingApp.java) versions!

## Learning Journey

This project represents my journey learning several key Java concepts:

- **Object-Oriented Programming**: Implemented classes with encapsulation, inheritance, and composition relationships
- **Java Swing UI**: Created my first GUI application with interactive elements and event handling
- **Data Structures**: Used LinkedList to store and manage employee records
- **Exception Handling**: Implemented try-catch blocks to gracefully handle potential errors
- **Input Validation**: Added email format validation and other data checks

## Project Structure

- `GetEmp.java`: Core employee class with data validation and access control
- `accessHierarchy.java`: Determines employee access levels based on ID
- `checkerID.java`: Utility class for employee ID verification
- `EmployeeSwingApp.java`: GUI version of the application using Java Swing
- `App.java`: Console-based version of the application

## Features

### Access Hierarchy
The system automatically assigns access levels (Senior, Junior, or Intern) based on the last three digits of an employee's ID:
- 700+ = Senior access
- 500-699 = Junior access
- Below 500 = Intern access

### Data Validation
- Email addresses must end with "@gmail.com"
- Various error handling for missing or invalid data

## Getting Started

1. Clone this repository
2. Compile all Java files: `javac *.java`
3. Run the GUI version: `java EmployeeSwingApp`
   OR
   Run the console version: `java App`

## Future Improvements

I'm still learning and plan to enhance this project with:
- Database integration for persistent storage
- Improved input validation
- Better UI design
- User authentication
- Report generation

## Reflections

This project helped me understand the power of OOP principles in building scalable applications. Working with Java Swing was challenging but rewarding, and I'm excited to continue improving my skills in software development!

Feel free to provide feedback or suggestions for improvement!

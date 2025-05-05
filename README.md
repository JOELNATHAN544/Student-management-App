# Student-management-App


## 📌 Objective

This project is a **console-based Java application** designed to manage student data and academic records. It applies **Object-Oriented Programming (OOP)** concepts such as classes, inheritance, encapsulation, and polymorphism, and showcases control flow and type casting.

---

## 🚀 Features

### ✅ Core Functionalities:
- Add new students (basic and graduate)
- Display student information
- Calculate and display GPA
- Polymorphic display of different student types

### 🎓 Inheritance & Polymorphism
- `Student` is the base class.
- `GraduateStudent` extends `Student` with additional fields: `thesisTitle` and `advisorName`.
- Uses **abstract class** `Person` as a common parent with `displayInfo()` method.

### 🔁 Control Flow
- Menu-driven interface using `if-else` and `switch`
- Looping with `while` and `for-each`
- Option to exit program

### 🧠 Other Concepts Used
- Use of `Scanner` for user input
- Type casting for GPA calculation
- Encapsulation with getters/setters
- String manipulation using `StringBuilder`

---

## 🗂️ File Structure

```plaintext
src/
│
├── Person.java             # Abstract base class
├── Student.java            # Base student class
├── GraduateStudent.java    # Inherits Student with extra fields
├── StudentManagementApp.java # Main class with menu and logic


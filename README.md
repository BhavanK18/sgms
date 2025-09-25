# 🎓 Student Grade Management System 

A **console-based Java application** that helps manage student records and automatically calculates total marks, percentage, GPA, and grade.  
This project is designed to demonstrate **Core Java concepts** such as **Object-Oriented Programming (OOP)**, **Collections**, **Exception Handling**, and **File I/O with Serialization**.

---

## 📑 Table of Contents
- [Features](#-features)
- [Technologies Used](#%EF%B8%8F-technologies-used)
- [Project Structure](#-project-structure)
- [Grading Logic](#-grading-logic)
- [Installation & Usage](#-installation--usage)
- [Sample Run](#%EF%B8%8F-sample-run)
- [Future Enhancements](#-future-enhancements)
- [Learning Outcomes](#-learning-outcomes)

---

## ✨ Features
- **Add Student**  
  Input roll number, name, and marks for multiple subjects.
- **Automatic Calculations**  
  Computes total marks, percentage, grade, and GPA.
- **View / Search / Delete**  
  Display all students, find a student by roll number, or delete records.
- **Persistent Storage**  
  Records are saved to a file (`students.dat`) using **object serialization**, so data remains after program exit.

---

## 🛠️ Technologies Used
- **Java SE 8+** – Core language features.
- **Collections Framework** – `ArrayList` for dynamic storage.
- **File I/O & Serialization** – Save and retrieve records across sessions.
- **Exception Handling** – Ensures graceful error handling for invalid input or file issues.

---

## 📂 Project Structure
```

StudentGradeManagement/
│
├─ src/
│   ├─ Main.java           # Entry point & menu handling
│   ├─ Student.java        # Student class (fields, grade calculation)
│   └─ StudentManager.java # Business logic, CRUD ops, file handling
│
├─ .gitignore             # Ignore .class and data files
└─ README.md              # Project documentation

````

---

## 🧮 Grading Logic
| Percentage Range | Grade | GPA |
|------------------|-------|-----|
| 90–100           | A     | 10  |
| 75–89            | B     | 8   |
| 60–74            | C     | 6   |
| 40–59            | D     | 5   |
| <40              | F     | 0   |

*(You can modify these ranges in `Student.java` to suit your requirements.)*

---

## 🚀 Installation & Usage

### Prerequisites
- Java Development Kit (JDK) **8 or later**
- Git (if cloning directly from GitHub)

### Steps
1. **Clone the Repository**
   ```bash
   git clone https://github.com/BhavanK18/sgms.git
   cd sgms
   ```

2. **Compile**

   ```bash
   javac src/*.java
   ```

3. **Run**

   ```bash
   java -cp src Main
   ```

---

## 🖥️ Sample Run
```
--- Student Grade Management ---
1. Add Student
2. View All
3. Search
4. Delete
5. Exit
Choice: 1
Enter Roll No: 101
Enter Name: Alice
Enter number of subjects: 3
Marks in subject 1: 95
Marks in subject 2: 88
Marks in subject 3: 91
Student added!

Choice: 2
Roll: 101 | Name: Alice | Total: 274 | %: 91.33 | Grade: A | GPA: 10.0

---
```
## 🔮 Future Enhancements

* **Graphical User Interface (GUI):** Build a desktop version using Swing or JavaFX.
* **Database Integration:** Replace file serialization with MySQL/SQLite + JDBC for more scalability.
* **Authentication:** Add user login/roles for admin and teachers.
* **Reporting:** Export grade sheets as PDF or CSV.

---

## 🎯 Learning Outcomes

Working on this project demonstrates:

* **Object-Oriented Design:** Classes, encapsulation, and methods.
* **Collections Usage:** Managing dynamic data with `ArrayList`.
* **File Handling:** Reading/writing objects using streams and serialization.
* **Exception Handling:** Managing user input and I/O errors.
* **Clean Code Practices:** Modular design and separation of concerns.

---

### 💡 Author

Maintained by **Bhavan K**.

---

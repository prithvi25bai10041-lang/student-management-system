# Project Statement - Student Management System

## Author Details
* **Author**: PRITHVI SIKARWAR
* **Registration Number**: 25BAI10041

---

## 1. Problem Statement
Educational institutions often struggle to maintain accurate, accessible, and organized student records. Traditional paper-based record-keeping systems are prone to physical damage, loss, and inefficiency when searching for specific student profiles. On the other hand, many fully digital administrative solutions are overly complex, requiring dedicated database servers, continuous internet connectivity, and extensive setup procedures. 

There is a clear need for a lightweight, standalone software solution that allows administrative staff to manage student data efficiently, search records rapidly, generate basic aggregate reports, and maintain persistent storage locally without relying on external database overhead.

---

## 2. Scope of the Project
The **Student Management System (SMS)** is scoped as a console-driven, single-user administrative tool built using Java.

### In-Scope:
* **Record Management**: Capturing student details including Name, Roll Number, and Course.
* **Persistent Storage**: Reading from and writing to a local flat file (`students.txt`) to ensure data remains intact across application restarts.
* **Data Retrieval**: Direct lookup of individual student records using their unique Roll Number.
* **Summary Reporting**: Displaying formatted lists of all registered students along with dynamic total count metrics.
* **Console User Interface**: Clean, interactive menu navigation running via standard Java runtime environments.

### Out-of-Scope (Future Potential):
* Multi-user role-based access control (Admin vs. Student logins).
* Graphical User Interface (GUI) frameworks (e.g., Swing, JavaFX, Web dashboards).
* Integration with relational database management systems (RDBMS) such as MySQL or PostgreSQL.

---

## 3. Target Users
* **Academic Administrators**: Staff members responsible for recording new enrollments, updating course allocations, and managing basic student registries.
* **Course Instructors & TAs**: Educators who need quick, local access to search student roll numbers and verify student course enrollments.
* **Lab Assistants**: Personnel requiring immediate terminal-based verification of student details in computer lab environments.

---

## 4. High-Level Features
1. **Interactive Console Menu**: Simple, user-friendly prompt loop for selecting operations.
2. **Student Profile Creation**: Input validation and instant memory/file insertion for student records.
3. **Roll Number Search Engine**: Linear search mechanism for fast profile retrieval by integer ID.
4. **Summary & Aggregate Reporting**: Module dedicated to outputting student counts and directory listings.
5. **Automatic File Persistence Engine**: Transparent background load and save handling to guarantee continuous data retention.
# 🎓 Student Counselling System

A **Java-based console application** that simulates a student counselling system.  
It allows **students** and **counsellors** to interact, manage sessions, and store/retrieve data using a database backend.

---

## 📌 Features

- 👨‍🎓 **Student & Counsellor Roles** – Separate functionality for each role  
- 🔑 **Session Management** – Login/logout with session tracking  
- 💾 **Database Integration** – Store and fetch data using JDBC  
- ⚡ **Command-Line Interface** – Lightweight and easy to run  
- 🛠️ **Modular Codebase** – Well-structured with separate classes for operations  

---

## 🛠️ Technologies Used

- **Programming Language**: Java  
- **Database**: JDBC (works with MySQL / PostgreSQL / SQLite)  
- **Environment**: Console-based application  

---

## 🚀 Setup & Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/Tejaswinikarri1/Student-Counselling-System.git
   cd Student-Counselling-System
2. Configure Database

   - Update DatabaseConnection.java with your JDBC URL, username, password.
 
   - Create necessary tables (e.g., students, counselors, sessions).

3. Compile and Run

   - javac src/*.java -d bin/
   - java -cp bin Main

🔄 Workflow

- Run the application (Main.java)

- Choose role: Student or Counselor

- Authenticate via database credentials

- Start or manage counseling sessions

- Store/retrieve records using DatabaseOperations

🚧 Future Enhancements

- Add JavaFX GUI or a web-based interface (Spring Boot)

- Implement course/college recommendation system

- Enhance input validation & exception handling

- Add role-based security

- Use Hibernate/JPA for database operations

📜 License

- This project currently has no license.

- If you’d like to make it open-source, consider adding an MIT License


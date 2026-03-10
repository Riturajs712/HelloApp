<div align="center">

# 👋 HelloApp

### 🚀 A Progressive Java Learning Project

<img src="https://img.shields.io/badge/Java-Programming-orange?style=for-the-badge&logo=java" />
<img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven" />
<img src="https://img.shields.io/badge/Git-Version_Control-black?style=for-the-badge&logo=git" />
<img src="https://img.shields.io/badge/GitHub-Repository-blue?style=for-the-badge&logo=github" />

</div>

---

# 📌 Project Overview

**HelloApp** is a progressive Java project designed to demonstrate how a simple program can evolve into a **modular, maintainable, and extensible application**.

The project starts with a basic **Hello World** program and gradually introduces more advanced concepts including:

* Command-line arguments
* Standard input handling
* Collection management
* Code refactoring
* Object-oriented design
* Data persistence
* Banner-style output formatting

This repository is meant for **learning Java fundamentals and software engineering best practices**.

---

# 🎯 Learning Objectives

Through this project, you will learn:

- 📌 Java program structure  
- 📌 Command-line arguments  
- 📌 Standard input handling  
- 📌 Java collections  
- 📌 Code refactoring  
- 📌 Object-oriented programming (OOP)  
- 📌 Data persistence  
- 📌 Maven build system  
- 📌 Git branching workflow

---

# 🧭 Use Case Roadmap

The application evolves through multiple incremental use cases.

| Use Case | Description                                     |
| -------- | ----------------------------------------------- |
| UC1      | Display **Hello World** in the console          |
| UC2      | Accept a user name via command-line argument    |
| UC3      | Handle optional arguments with default greeting |
| UC4      | Accept multiple command-line names              |
| UC5      | Read a name from standard input                 |
| UC6      | Read multiple names from standard input         |
| UC7      | Store names in memory and list them             |
| UC8      | Remove names from stored collection             |
| UC9      | Refactor input processing into methods          |
| UC10     | Move name management to a separate class        |
| UC11     | Persist names across program runs               |
| UC12     | Display greetings in banner format              |

📖 Detailed documentation for each use case is available in:

```
docs/HelloAppUC.md
```

---

# 🛠 Technology Stack

| Technology    | Purpose                                  |
| ------------- | ---------------------------------------- |
| ☕ **Java**    | Core programming language                |
| 📦 **Maven**  | Build automation & dependency management |
| 🌿 **Git**    | Version control                          |
| 🐙 **GitHub** | Repository hosting                       |

---

# ⚙️ Project Setup

## 1️⃣ Clone the Repository

```bash
git clone https://github.com/yourusername/HelloApp.git
cd HelloApp
```

---

## 2️⃣ Build the Project

Compile the project using Maven:

```bash
mvn clean install
```

This will:

* Download dependencies
* Compile the source code
* Build the project

---

## 3️⃣ Run the Application

```bash
java -cp target/classes HelloApp
```

---

# 📂 Project Structure

```
hello-app
│
├── pom.xml
├── README.md
│
├── docs
│   └── HelloAppUC.md
│
└── src
    ├── main
    │   └── java
    │       └── HelloApp.java
    │
    └── test
        └── java
            └── HelloAppTest.java
```

---

# 🌿 Git Workflow

This project follows a **feature-based development workflow**.

### Branch Structure

| Branch      | Purpose                          |
| ----------- | -------------------------------- |
| main        | Stable production-ready code     |
| Dev         | Integration branch               |
| feature/UCX | Feature branch for each use case |

Example feature branches:

```
feature/UC1-display-hello-world
feature/UC2-command-line-name
feature/UC3-optional-arguments
```

---

# 🔧 Maven Project

This project uses **Apache Maven** for build automation.

The `pom.xml` file defines:

* Project metadata
* Java version
* Dependencies
* Build configuration

Build the project using:

```bash
mvn clean install
```

---

# 🤝 Contribution

Contributions are welcome.

Steps:

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Submit a Pull Request

---

# 👨‍💻 Author

**Ritu Raj Singh**

- 🎓 SRM Institute of Science and Technology  
- 💻 Computer Science Student

---

# 📜 License

This project is created for **educational and learning purposes**.
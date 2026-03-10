# HelloApp – Development Branch

## ⚙️ Development Overview

This branch (`dev`) contains the **ongoing development** of the HelloApp project.

All new features and use cases are implemented through **feature branches** and then merged into `dev` after review.
Once all features are completed and stable, the `dev` branch will be merged into the `main` branch.

---

# 🌿 Branching Strategy

The project follows a **feature branch workflow**.

| Branch          | Purpose                            |
| --------------- | ---------------------------------- |
| `main`          | Stable production-ready code       |
| `dev`           | Development integration branch     |
| `feature/UCx-*` | Individual use case implementation |

Development flow:

```
feature branch → dev → main
```

---

# 🧭 Use Case Development Roadmap

Each functionality of HelloApp is implemented as a **separate use case**.

| Use Case | Description                           | Branch          |
| -------- | ------------------------------------- | ----------------|
| UC1      | Display Hello World                   | `feature/UC1`   |


# 📖 Detailed documentation for each use case :

To access the docs of individual use case go visit the folder :
```
docs/
```

---

# 📂 Development Project Structure

```
HelloApp
│
├── src
│   ├── main
│   │   └── java
│   │
│   └── test
│       └── java
│
├── docs
│
├── pom.xml
├── README.md
└── .gitignore
```

---

# 🛠 Build Instructions

Build the project using Maven:

```
mvnd clean install
```

or

```
mvn clean install
```

This will:

* compile the source code
* run tests
* generate the build output in the `target/` directory

---

# 🤝 Development Guidelines

* Each use case must be implemented in a **separate feature branch**
* Feature branches must be created from `dev`
* All changes must go through a **pull request before merging into dev**
* `main` should only contain **stable releases**

Example workflow:

```
git checkout dev
git checkout -b feature/UC1-display-hello-world
```

After implementation:

```
feature/UC1-display-hello-world → dev
```

---

# 👨‍💻 Author

**Ritu Raj Singh**
- SRM Institute of Science and Technology
- Computer Science Student

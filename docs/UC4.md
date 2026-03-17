# UC4 – Display "Hello" with Multiple Command-Line Arguments

## Use Case ID
UC4

## Description
The application accepts multiple names as command-line arguments and displays a personalized greeting for each name. If the user does not provide any arguments, the application displays a default greeting using the name **"World"**.

This use case extends the functionality of UC3 by supporting multiple inputs and demonstrating how to iterate through the `args[]` array.

## Disadvantages of Previous Use Case

In UC3, the application handles only **one command-line argument** (`args[0]`).  
If multiple names are provided, the application ignores the additional arguments.

UC4 improves this by iterating through the entire `args[]` array and displaying greetings for all provided names.

## Main Flow

1. User runs the application with one or more name arguments.

**With multiple arguments**
```bash
java HelloApp John Alice Bob
```

**Without arguments**
```bash
java HelloApp
```

2. The application checks whether any command-line arguments are provided.

3. If arguments exist, the application loops through the `args[]` array.

4. The application prints a greeting for each provided name.

5. If no arguments exist, the application prints the default greeting using `"World"`.

**Example Output (with multiple arguments)**

```
Hello, John!
Hello, Alice!
Hello, Bob!
```

**Example Output (without arguments)**

```
Hello, World!
```

6. The application terminates.

---

## Git Branch Creation

Create a feature branch for this use case before implementing the code.

```bash
git checkout -b feature/UC4-display-multiple-names
```

---

## Steps to Complete the Use Case

1. Create the feature branch.
2. Implement the UC4 logic in the code.
3. Compile and run the program to verify functionality.
4. Add the code to the Git repository.
5. Commit the changes.
6. Push the branch to GitHub.
7. Merge the feature branch into the `dev` branch.

Example Git commands:

```bash
git add .
git commit -m "UC4: Display hello for multiple command-line arguments"
git push origin feature/UC4-display-multiple-names
```

---

## Key Concepts Used

- Command-line Arguments (`args[]`)
- Arrays in Java
- Looping through arrays (`for` loop)
- Conditional Statements (`if`)
- Default Values
# UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop

## Description

The application accepts zero or more command-line arguments and prints a greeting message. It uses an enhanced for loop to process multiple names. If no arguments are provided, it displays a default greeting: "Hello, World!".

---

## Git Branch

git checkout -b feature/UC5-enhanced-for-loop

---

## Disadvantages of Previous Use Case (UC4)

- Used traditional indexed `for` loop
- More verbose and less readable
- Requires manual index handling
- Not ideal for simple read-only iteration

---

## Preconditions

- Application is executed with zero or more command-line arguments

---

## Main Flow

1. User runs the application with or without arguments
2. Application checks if arguments are provided
3. If no arguments:
   - Default value "World" is used
4. If arguments exist:
   - Iterate through all arguments using enhanced for loop
   - Build a comma-separated string of names
5. Display greeting:
   - Format: Hello, <names>!
6. Application terminates

---

## Postconditions

- Greeting is displayed correctly
- Defaults to "Hello, World!" if no arguments are provided

---

## Key Concepts Used

- Command-line arguments (args[])
- Enhanced for loop (for-each)
- StringBuilder for efficient string construction
- Conditional delimiter handling
- Default fallback value

---

## Sample Runs

### No arguments
java HelloApp

Output:
Hello, World!

---

### Single argument
java HelloApp Ritu

Output:
Hello, Ritu!

---

### Multiple arguments
java HelloApp Ritu Raj Singh

Output:
Hello, Ritu, Raj, Singh!

---

## Bonus Improvement (Java 8+)

You can simplify the code using:

String joinedNames = String.join(", ", args);
System.out.println("Hello, " + joinedNames + "!");

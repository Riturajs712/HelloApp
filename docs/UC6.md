# UC6: Display "Hello" with Multiple Command-Line Arguments using substring to Remove Trailing Delimiter

## Description

The application accepts zero or more command-line arguments and prints a greeting message. It uses an enhanced for loop to process multiple names and the substring() method to remove the trailing delimiter. If no arguments are provided, it displays a default greeting: "Hello, World!".

---

## Git Branch

git checkout -b feature/UC6-substring-method

---

## Disadvantages of Previous Use Case (UC5)

- Used conditional logic to avoid trailing delimiter
- Required index-based or conditional checks inside loop
- Mixed construction and formatting logic

---

## Preconditions

- Application is executed with zero or more command-line arguments

---

## Main Flow

1. User runs the application with or without arguments
2. Application checks if arguments are provided
3. If no arguments:
   - Displays "Hello, World!"
4. If arguments exist:
   - Iterate through all arguments using enhanced for loop
   - Append each name followed by ", "
   - Remove trailing delimiter using substring()
5. Display greeting:
   - Format: Hello, <names>!
6. Application terminates

---

## Postconditions

- Greeting is displayed correctly
- Defaults to "Hello, World!" if no arguments are provided

---

## Key Concepts Used

- Enhanced for loop (for-each)
- StringBuilder for efficient string construction
- substring() method for trimming extra characters
- length() method for safe substring operation
- Default fallback value
- Trailing delimiter removal

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

## Important Notes

- Always append delimiter during loop
- Remove last delimiter using substring(0, length - 2)
- Ensure length > 0 before substring to avoid exception

---

## Bonus Improvement

You can also simplify using Java built-in method:

String joinedNames = String.join(", ", args);
System.out.println("Hello, " + joinedNames + "!");
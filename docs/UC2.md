# UC2 – Display "Hello" with Command-Line Argument

## Use Case ID
UC2

## Description
The application accepts a user's name as a command-line argument and displays a personalized greeting. This enhances the basic functionality of UC1 by allowing user input to customize the output.

## Disadvantages of Previous Use Case

UC1 only displays a static "Hello World" message and does not allow user interaction. To make the application more useful and interactive, the application should accept user input and personalize the output.

## Main Flow

1. User runs the application with a name argument:
   ```
   java HelloApp John
   ```
2. The application reads the name from the `args[0]` parameter.
3. The application displays a personalized greeting.

Example Output:
```
Hello, John!
```

4. The application terminates.




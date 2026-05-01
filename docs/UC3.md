# UC3 – Display "Hello" with Command-Line Argument or Default Message

## Use Case ID
UC3

## Description
The application accepts a user’s name as a command-line argument and displays a personalized greeting. If the user does not provide any argument, the application displays a default greeting using the name **"World"**. This improves the robustness of the application compared to the previous use case.

## Disadvantages of Previous Use Case
In UC2, the application directly accesses `args[0]`. If the user runs the program without providing a command-line argument, the program crashes with an `ArrayIndexOutOfBoundsException`.

This makes the application fragile and not user-friendly. UC3 solves this issue by checking whether an argument exists before accessing it and by assigning a default value when none is provided.

## Main Flow

1. User runs the application with or without a name argument.

**With argument**
```bash
java HelloApp John
```

**Without argument**
```bash
java HelloApp
```

2. The application checks if a command-line argument is provided.  
3. If an argument exists, the application reads the name from `args[0]`.  
4. If no argument exists, the application assigns the default value `"World"`.  
5. The application displays the greeting message.

**Example Output (with argument)**

```
Hello, John!
```

**Example Output (without argument)**

```
Hello, World!
```

6. The application terminates.
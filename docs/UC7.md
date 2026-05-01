# UC7: Display Hello using String.join() or Default Message

## Description
The application accepts zero or more command-line arguments and prints a greeting. It uses the `String.join()` method to concatenate multiple names with a delimiter. If no arguments are provided, it displays the default message "Hello, World!".

---

## Branch Creation
```bash
git checkout -b feature/UC7-string-join
```

---

## Preconditions
- Application is launched with zero or more command-line arguments

---

## Main Flow
1. User runs the program with or without arguments  
2. Application checks `args.length == 0`  
3. If no arguments → set greeting to `"Hello, World!"`  
4. If arguments exist → use `String.join(", ", args)`  
5. Print `"Hello, <names>!"`  
6. Program terminates  

---

## Postconditions
- Greeting is displayed with names or default message

---

## Advantages
- Cleaner and shorter code  
- No manual delimiter handling  
- Built-in method improves readability  
- Less error-prone compared to substring approach  

---

## Disadvantages
- Requires understanding of `String.join()`  
- Slightly less flexible for custom formatting logic  

---

## Key Concepts Used
- `String.join()` method  
- Conditional statements (`if-else`)  
- Command-line arguments (`args`)  
- Default values handling  

---

## Sample Output

### No Arguments
```
Hello, World!
```

### One Argument
```
Hello, Alice!
```

### Multiple Arguments
```
Hello, Alice, Bob, Charlie!
```
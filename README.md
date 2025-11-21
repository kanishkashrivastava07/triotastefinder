# <3 TrioTasteFinder

A simple Java console application that helps you discover recipes using **only three ingredients**. Select a trio from the list, and the program instantly tells you what delicious dish you can make.

---

## Features

* 38 curated ingredient trios
* Matching recipe instructions for each trio
* Input validation (only numbers 1–38 allowed)
* Beginner‑friendly Java code

---

## Project Structure

```
TrioTasteFinder/
│
├── TrioTasteFinder.java
└── README.md
```

---

## How It Works

1. Displays a list of **38 ingredient trios**.
2. User selects a number.
3. Program checks whether the input is valid.
4. If valid → Displays recipe instructions.
5. If invalid → Shows an error message and asks again.

---

## Flowchart – Program Logic

"<img src="https://github.com/user-attachments/assets/237a6883-4aa9-4759-bf2c-c5fa2b31e100" height = "500"/>


---

## Code Overview

This program uses:

* Arrays of ingredient trios
* A matching array of recipe instructions
* A simple menu-based selection system
* Java's `Scanner` for input

---

## How to Run

### **Using CMD / Terminal:**

```
javac TrioTasteFinder.java
java TrioTasteFinder
```

---

## Example Output

```
1 Heavy cream Sweetened condensed milk Vanilla bean paste
2 Rice Krispies cereal Butter Marshmallows
...
Choose from (1 - 38): 1
You can make Ice Cream -> Whip heavy cream until thick...
```

---

## Requirements

* JDK 8 or above

---

## Future Enchancements
GUI version, random recipe generator, categories...

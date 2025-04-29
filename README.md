# 🧵 String Analyzer Program 

This is a Java-based console application developed as part of the Computer Programming I course (CSE 1241). It provides a menu-driven interface that allows users to perform various string operations. The program runs in an infinite loop and exits only when the user types "exit" or "quit".

## 📌 Features

The application supports the following options:

### 1. Count Number of Characters
Counts how many times a given character appears in a string.

```java
public static int numOfChars(String str, char ch)
```
### 2. Print Words in a Sentence
Prints each word in a sentence, removing punctuation marks like `, . ! ? _ - ( )` and whitespace.

```java
public static void printWords(String str)
```

### 3. Delete Substring 
Deletes the specified substring from the input string:
- If `type = 0`: Deletes **first occurrence**.
- If `type = 1`: Deletes **all occurrences**.

```java
public static String delete(String str, String subStr, int type)
```

### 4. Replace Substring
Replaces all occurrences of one substring with another substring.

```java
public static String replace(String str, String subStr1, String subStr2)
```

### 5. Sort Characters
Sorts characters in the input string:
- `type = 0`: Sorts by ASCII values.
- `type = 1`: Groups sorted as lowercase → uppercase → digits → others.

```java
public static String sortChars(String str, int type)
```

### 6. Hash Code of a String
Calculates a custom hash code based on the formula:

```
hashCode(s, b) = s0*b^(n-1) + s1*b^(n-2) + ... + sn-1
```

```java
public static int hashCode(String str, int b)
```


## 👤 Author

- **Name:** Ayşe Yıldız  

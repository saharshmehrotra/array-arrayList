# ArrayLists in Java: Convert between ArrayList and Array

This Java program demonstrates how to convert between ArrayList and Array in Java. It provides examples of converting an ArrayList to an Array and vice versa.

## Table of Contents
- [Introduction](#introduction)
- [Examples](#examples)
    - [Convert ArrayList to Array and vice versa](#convert-arraylist-to-array)
- [How to Run](#how-to-run)
- [License](#license)

## Introduction
In Java, the ArrayList class is a part of the Java Collections Framework and provides dynamic arrays. Sometimes, it's necessary to convert between ArrayList and Array, and this program showcases how to achieve that.

## Examples

### Convert ArrayList to Array and vice versa
```java
import java.util.ArrayList;
import java.util.Arrays;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> languagesList = new ArrayList<>();
        languagesList.add("Java");
        languagesList.add("Python");
        languagesList.add("JavaScript");

        // Convert ArrayList to String array
        String[] languagesArray = new String[languagesList.size()];
        languagesList.toArray(languagesArray);
        System.out.println("Array (Converted from ArrayList): " + Arrays.toString(languagesArray));
    }
}

### Convert Array to ArrayList
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayLists {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C"};

        // Convert array to ArrayList
        List<String> arrayToArrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList (Converted from Array): " + arrayToArrayList);
    }
}

# Array and ArrayList Utilities

This Java project provides utility functions and examples for working with arrays and ArrayLists. It covers common operations and conversions between arrays and ArrayLists.

## Table of Contents
- [Introduction](#introduction)
- [Functions](#functions)
    - [Array Operations](#array-operations)
    - [ArrayList Operations](#arraylist-operations)
- [Examples](#examples)
    - [Basic Array Manipulations](#basic-array-manipulations)
    - [ArrayList Operations](#arraylist-operations-examples)

## Introduction
Working with arrays and ArrayLists is fundamental in Java programming. This project aims to provide a set of utility functions and examples to simplify common tasks related to arrays and ArrayLists.

## Functions

### Array Operations
- `void printArray(T[] array)`: Print the elements of the array.
- `T[] concatenateArrays(T[] array1, T[] array2)`: Concatenate two arrays of the same type.
- `T[] reverseArray(T[] array)`: Reverse the elements of the array.

### ArrayList Operations
- `void printArrayList(List<T> list)`: Print the elements of the ArrayList.
- `List<T> concatenateArrayLists(List<T> list1, List<T> list2)`: Concatenate two ArrayLists of the same type.
- `List<T> reverseArrayList(List<T> list)`: Reverse the elements of the ArrayList.

## Examples

### Basic Array Manipulations
```java
ArrayUtilities<Integer> arrayUtils = new ArrayUtilities<>();

Integer[] array = {1, 2, 3, 4, 5};
arrayUtils.printArray(array);

Integer[] reversedArray = arrayUtils.reverseArray(array);
arrayUtils.printArray(reversedArray);

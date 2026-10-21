
# Homework 4 - Find Duplicate Images

## Description

This Java program uses ProcessBuilder to execute a Bash script that finds duplicate images in the `pics` folder.

The script searches for JPG, JPEG, and PNG files, calculates SHA-1 hashes, compares them, and saves duplicate results to a dated log file.

## How to Run

Compile the Java program:

    javac FindDuplicates.java

Run the program:

    java FindDuplicates

Bash must be installed and available in the terminal.

## Java Features

- ProcessBuilder executes the Bash script.
- BufferedReader reads the script output.
- ArrayList stores the output lines.
- A lambda expression filters and counts duplicate matches.
- Exception handling catches execution errors.

## Testing

Tested using five images:
- another-cat.jpg
- cat.jpg
- dog.jpg
- hamster.jpg
- rabbit.jpg

`another-cat.jpg` is an exact copy of `cat.jpg` with a different filename.

The program correctly identified the duplicate pair.

## Results

    Duplicate found: ./pics/another-cat.jpg and ./pics/cat.jpg
    Total duplicate matches: 1
    Script exit code: 0

The program successfully detected the duplicate images and completed without errors.

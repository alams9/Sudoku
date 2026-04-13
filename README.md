# Sudoku 
Sha Alam

Project Description:
  This is a Java program that generates a fully solved 9x9 Sudoku board. It follows all the traditional rules of Sudoku. Each row, column, and 3x3 grid contains no repetition. Instead of trial and error this project uses code to shift the initial row to create a valid board. Generating a faster board through this process.

How to Run the Program:
  Opening the project in a Java IDE and compiling the program. Run the main method right after and the Sudoku board will appear.

Summary of how the Sudoku board is generated:
  The Sudoku board is generated using a shift algorithm. Starting with a row with numbers 1-9 and altering each number. Every new row is altered using this shift creating a valid Sudoku board. The shift is calculated by (row * 3 ) + ( row / 3) and then this is used inside the create board adding the column and using modulo 9 to ensure any number in the row does not exceed the number 9 invalidating the board. This method allows the generation of a correct solution without using trial and error.
  
List of files included in the project:
  SudokuGenerator.java

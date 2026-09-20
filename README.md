Reverse Number in Java
📌 Description
This Java program takes an integer number as input from the user and reverses its digits.

For example:

Input: 12345
Output: 54321

The program uses a while loop and basic arithmetic operations such as modulus (%) and integer division (/) to reverse the number.

🛠️ Technologies Used
Java

Scanner class for user input

while loop

Modulus (%) operator

Integer division (/)

📂 Package and Class
Package:

package day6;

Class:

ReverseNumber

⚙️ How It Works
The program follows these steps:

Creates a Scanner object to read input from the user.

Asks the user to enter an integer.

Stores the original number in originalNum.

Initializes reversed to 0.

Uses a while loop to process each digit:

num % 10 gets the last digit.

reversed * 10 + digit adds the digit to the reversed number.

num / 10 removes the last digit from the original number.

Prints both the original and reversed numbers.

Example
If the user enters:

12345

The calculation happens as follows:

digit = 12345 % 10 = 5
reversed = 0 * 10 + 5 = 5

digit = 1234 % 10 = 4
reversed = 5 * 10 + 4 = 54

digit = 123 % 10 = 3
reversed = 54 * 10 + 3 = 543

digit = 12 % 10 = 2
reversed = 543 * 10 + 2 = 5432

digit = 1 % 10 = 1
reversed = 5432 * 10 + 1 = 54321

▶️ Sample Output
Please enter a integer number:
12345
Original number is:12345
Reversed number is:54321

💻 Source Code
package day6;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a integer number:");
        int num = scanner.nextInt();

        int originalNum = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.println("Original number is:" + originalNum);
        System.out.println("Reversed number is:" + reversed);
    }
}

🎯 Learning Objectives
This program helps practice:

Taking input using Scanner

Working with integers

Using while loops

Understanding the modulus operator %

Understanding integer division

Manipulating individual digits of a number

Storing and displaying the original value

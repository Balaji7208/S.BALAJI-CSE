/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class mark
{
public static void main(String[ ] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the student name:");
String n = s.nextLine();
System.out.println("Enter the class of student:");
String a = s.nextLine();
System.out.println("Enter roll no of student:");
int r = s.nextInt();
System.out.println("Enter mark in Python Programming:");
int m1 = s.nextInt();
System.out.println("Enter mark in basic EEE:");
int m2 = s.nextInt();
System.out.println("Enter mark in Data structure:");
int m3 = s.nextInt();
System.out.println("Enter mark in Engineering Mathematics:");

int m4 = s.nextInt();
System.out.println("Enter mark in Engineering Graphics:");
int m5 = s.nextInt();
int t = m1 + m2 + m3 + m4 + m5;
double y = (t*100)/500;
String z = "";
if(y>=90)
z = "A+";
else if(y>=80)
z = "A";
else if (y >=70)
z = "B+";
else if (y >= 60)
z = "B";
else if (y >= 50)
z = "C";
else if (y >= 40)
z = "D";
else
z = "E";
System.out.println("Total Marks = " + t);
System.out.println("Percentage = " + y);
System.out.println("Grade = " + z);
} 
    }
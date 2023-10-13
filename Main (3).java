/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class math
{
private int a;
private int b;
void add()
{System.out.println("a+b");}
}
class multiply extends math{
private int a;
private int b;
void mul()
{System.out.println("a*b");}
}

class maths
{
public static void main(String args[]){
multiply s=new multiply();
s.add();
s.mul();
}}
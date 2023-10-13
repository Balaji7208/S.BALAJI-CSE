/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class Eligibletovote {
public static void main(String[] args) {
int CandiateEligibletovote=10;
int Candiatenoteligibletovote=18; 
Scanner c=new Scanner(System.in);
System.out.println("please enter your age");
CandiateEligibletovote=c.nextInt();
if(CandiateEligibletovote>=Candiatenoteligibletovote) 
{
System.out.println("congratulation you are eligible for voting");
}
else{
System.out.println("Sorry you are not eligible for voting");
}
}
}
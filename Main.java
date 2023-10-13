/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Fibonaccinumbers {
public static void main(String[] args) {
int elementPosition=1,count=10, firstFibonacciNum=0,nextFibonacciNum=1;
System.out.print(firstFibonacciNum+""+nextFibonacciNum);
for(elementPosition=2;elementPosition<count;++elementPosition)
{
int sumofPrev2=firstFibonacciNum+nextFibonacciNum;
firstFibonacciNum=nextFibonacciNum;
System.out.print(""+sumofPrev2);
nextFibonacciNum=sumofPrev2;
elementPosition++;
}
}
}
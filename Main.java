import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    //in class problem
    // int i = 3;
    // while (i <=25)
    // {
    //   System.out.println(i);
    //   i += 2;
    // }


    //q1

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter positive integers to add. Enter -1 to stop.");
    // int sum = 0;
    // int input;
    // input = sc.nextInt();
    // while (input != -1) 
    // {
    //   if (input < 0) 
    //   {
    //     System.out.println("Error: Not added");
    //   } else 
    //   {
    //     sum += input;
    //     input = sc.nextInt();
    //   }
    // }
    // System.out.println("Sum is " + sum);
    



    //q2
    // Scanner sc = new Scanner(System.in);
    // System.out.println("How many numbers do you want to enter?");
    // int n = sc.nextInt();
    // int max = Integer.MIN_VALUE;
    // int i = 0;
    
    // System.out.println("Enter the numbers: ");
    // while (i < n)
    // {
    //   int in = sc.nextInt();
    //   if (max < in) 
    //   {
    //     max = in;
    //   }
    //   i++;
    // }

    // System.out.println("Largest number is " + max);


    //q3

    String str = "Calculator";
    System.out.println(str);
    int index = 0;
    while (index < str.length())
    {
      String currLet = str.substring(index, index + 1);

      index++;
    }
    System.out.println(str);




  }
}

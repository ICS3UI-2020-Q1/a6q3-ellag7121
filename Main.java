import java.util.Scanner;
/**
 * asks the user for 10 integers, finds the largest
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);

    //create the array
    int[] numbers = new int[10];

    //ask for the numbers
    System.out.println("Please enter in 10 integers to put into the array");
    for(int i = 0; i < numbers.length; i++){
      //store the input in the array
      numbers[i] = input.nextInt();
    }
    
    //create a variable for the max number
    int maxNum = numbers[0]; //set it to the first index of numbers, because if there is one bigger than that it will be changed in the for loop

    //find the max numbers
    for(int i = 0; i < numbers.length; i++){
      //check if the current index is bigger that the current max
      if(numbers[i] > maxNum){
        //set the new max to the current number index
        maxNum = numbers[i];
      }
    }

    //tell the user the maximum
      System.out.println("The largest number is " + maxNum);
  }
}

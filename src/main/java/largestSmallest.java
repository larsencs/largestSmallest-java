
import java.util.Scanner;


public class largestSmallest {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = 0;
        int smallest;
        int largest;
        int numArray[];
        
        System.out.println("Enter how many numbers you want to enter");
        int repeat = scan.nextInt();
        numArray = new int[repeat];
        
        for(int i = 0; i < repeat; i++){
            numArray[i] = scan.nextInt();
        }
        
        smallest = numArray[0];
        largest = numArray[0];
        
        for(int i = 0; i < repeat; i++){
            if(numArray[i] < smallest){
                smallest = numArray[i];
            }
            if(numArray[i] > largest){
                largest = numArray[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
     
          
        }

        
    
}

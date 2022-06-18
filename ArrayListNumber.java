import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> NewList = new ArrayList<>();

        System.out.print("How many members in your list:  ");
        int ListNo = input.nextInt();

        
    //Getting size of ArrayList from user
        for (int i = 0; i < ListNo; i++){
            System.out.print(i + ". Member of YourList:  ");
            int a = input.nextInt();
            NewList.add(a);
        }
    //Created size and members for ArrayList

    //Members added to list
        System.out.print("Members of List:  ");
        int total = 0;
        for (int j = 0; j < NewList.size(); j++){

            System.out.print(NewList.get(j));
            System.out.print(" , ");
            total += NewList.get(j);
        }
    //Calculating Average Members of List
        System.out.println();
        System.out.println("Average of Your List Members: " + total / NewList.size());

   //Calculating Harmonic result     
        float result = 0;
        for (int k : NewList) {
            result += 1f / k;
        }
        double NewTotal = NewList.size() / result;

        System.out.println("Average Harmonic:  " + NewTotal);
    }
}

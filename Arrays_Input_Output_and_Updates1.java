import java.util.*;
public class Arrays_Input_Output_and_Updates1{
    public static void main(String[] args) {
        int[] marks = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phy msarks:");
        marks[0] = sc.nextInt(); //phy
        System.out.print("Enter chem msarks:");
        marks[1] = sc.nextInt();//chem
        System.out.print("Enter math msarks:");
        marks[2] = sc.nextInt();//math
        sc.close();

        //System.out.println(marks.lenght); lenght claculet
        System.out.println("Physics "+marks[0]);
        System.out.println("Chemistry "+marks[1]);
        System.out.println("Math "+marks[2]);
        //Update
        //marks[2] = 100;
        //System.out.println("Math "+marks[2]);
        marks[2] = marks[2]+1;
        System.out.println("Math "+marks[2]);
        int percentage =(marks[0]+marks[1]+marks[2]) *100/ 300;
        System.out.println("Percentage: " + percentage + "%");

        

    }
}
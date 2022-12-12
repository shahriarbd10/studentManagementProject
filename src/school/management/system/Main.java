package school.management.system;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 * @author created by Anamika Hossain Lily
 */
public class Main {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Management obj = new Management();
        System.out.println("\n\n\t\t\t\t\t\t\t\t*****************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t*                         ------- ----------                    *");
        System.out.println("\t\t\t\t\t\t\t\t*                         STUDENT MANAGEMENT                    *");
        System.out.println("\t\t\t\t\t\t\t\t*                         ------- ----------                    *");
        System.out.println("\t\t\t\t\t\t\t\t*****************************************************************\n\n");
        System.out.println("\t\t\t\t\t\t\t\t*****************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t*                            Team Members                       *");
        System.out.println("\t\t\t\t\t\t\t\t*        Name                   ----               ID           *");
        System.out.println("\t\t\t\t\t\t\t\t*    Shahriar Hossain           ----          213-15-4589       *");
        System.out.println("\t\t\t\t\t\t\t\t*    ASif Dewan                 ----          213-15-4548       *");
        System.out.println("\t\t\t\t\t\t\t\t*    Supta Das Dip              ----          213-15-4596       *");
        System.out.println("\t\t\t\t\t\t\t\t*    Tanzim Ahmed               ----          213-15-4562       *");
        System.out.println("\t\t\t\t\t\t\t\t*    Tabib E Alahi              ----          213-15-4590       *");
        System.out.println("\t\t\t\t\t\t\t\t*****************************************************************\n\n");
        int n=1;
        int temp1=0,temp2=1,k;



        while(n!=0){
            
            System.out.println("* Press '1' to Add a new student info    *");
            System.out.println("* Press '2' to Search a student info     *");
            System.out.println("* Press '3' to Edit a student info       *");
            System.out.println("* Press '4' to Delete a student info     *");
            System.out.println("* Press '5' to Display all student info  *");
            System.out.println("* Press '6' to Delete all student info   *");
            System.out.println("* Press '0' to Exit                      *\n");

            System.out.print("Press Any Key: ");
            n=input.nextInt();
            if(n==1){
                obj.Add_info(temp1, temp2);
                temp1++;
                temp2++;
            }
            else if(n==2){

                obj.Search_info(temp1);
            }

            else if(n==3){

                obj.Edit_info(temp1);
            }
            else if(n==4){
                k=obj.Delete_info(temp1);
                if(k==1){
                    temp1--;
                    temp2--;
                }
            }

            else if(n==5){
                obj.Display_info(temp1);
            }
            else if(n==6){
                temp1=0;
                temp2=1;
                System.out.println("All Info Deleted");

            }
         
        }
        obj.finish();
    }
}


package school.management.system;
import java.util.Scanner;


public class Management implements Last{
    private String student_name;
    private String student_semester;
    private String student_id;
    private String student_section;
    private String student_cgpa;

    Management[] info = new Management[100];


    public void Add_info(int temp1, int temp2) {
        Scanner input = new Scanner(System.in);
        int i;

        for (i = temp1; i < temp2; i++) {
            info[i] = new Management();
            System.out.print("Enter Student Name: ");
            info[i].student_name = input.nextLine();
            System.out.print("Enter Student Unique ID: ");
            info[i].student_id = input.nextLine();
            System.out.print("Enter Semester: ");
            info[i].student_semester = input.nextLine();
            System.out.print("Enter Section: ");
            info[i].student_section = input.nextLine();
            System.out.print("Enter Cgpa: ");
            info[i].student_cgpa = input.nextLine();

        }
        System.out.println("Information Added Successfully!!..\n");

    }

    public void Search_info(int temp1) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Student ID: ");

        String phone1 = input.nextLine();
        String sid;
        int temp = 0, i;
        for (i = 0; i < temp1; i++) {
            sid = info[i].student_id;
            if (phone1.equals(sid)) {
                Display(info[i].student_name, info[i].student_id, info[i].student_semester, info[i].student_section, info[i].student_cgpa);
                temp = 1;
            }

        }
        if (temp == 0) {
            System.out.println("DATA Not found!!!\n");

        }
    }

    public void Edit_info(int temp1) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String Temp_id = input.nextLine();
        int temp = 0, i;
        String SID;
        for (i = 0; i < temp1; i++) {
            SID = info[i].student_id;
            if (Temp_id.equals(SID)) {

                Display(info[i].student_name, info[i].student_id, info[i].student_semester, info[i].student_section, info[i].student_cgpa);
                System.out.print("Enter a new name: ");
                info[i].student_name = input.nextLine();
                System.out.print("Enter a new ID: ");
                info[i].student_id = input.nextLine();
                System.out.print("Enter a new semester: ");
                info[i].student_semester = input.nextLine();
                System.out.print("Enter a new section: ");
                info[i].student_section = input.nextLine();
                System.out.print("Enter a New CGPA: ");
                info[i].student_cgpa = input.nextLine();

                System.out.println("Information Updated..\n");
                temp = 1;
            }

        }

        if (temp == 0) {
            System.out.println("Data is Wrong!!! Please Try again....");
        }
    }

    public int Delete_info(int temp1) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID to Delete: ");

        String id1 = input.nextLine();
        int temp = 0, i, j;
        for (i = 0; i < temp1; i++) {
            student_id = info[i].student_id;
            if (id1.equals(student_id)) {
                for (j = i; j < temp1; j++) {
                    info[j] = info[j + 1];
                    temp = 1;
                }
                if (temp == 1) {
                    System.out.println("Information Deleted..\n");
                    return 1;

                }

            }

        }

        if (temp == 0) {
            System.out.println("Data is wrong!!! Please Try again later....");
            return 0;
        }
        return 0;
    }

    public void Display_info(int temp1) {
        System.out.println("** Student Information **\n");
        int k = 1, i;
        if (temp1 == 0) {
            System.out.println("The List was not found ! ");
        } else {


            for (i = 0; i < temp1; i++) {
                System.out.println("************************************");
                System.out.printf("Student %d:\n", k);
                System.out.println("Name    : " + info[i].student_name);
                System.out.println("ID      : " + info[i].student_id);
                System.out.println("Semester: " + info[i].student_semester);
                System.out.println("Section : " + info[i].student_section);
                System.out.println("CGPA    : " + info[i].student_cgpa);

                k++;
            }
            System.out.println("**************************************");
        }
    }

    public void Display(String student_name,String student_id,String student_semester, String student_section, String student_cgpa){
        System.out.println("*********************************");
        System.out.println("Student Name : "+student_name);
        System.out.println("Student ID   : "+student_id);
        System.out.println("Semester     : "+student_semester);
        System.out.println("Section      : "+student_section);
        System.out.println("CGPA         : "+student_cgpa);
        System.out.println("*********************************");
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_semester() {
        return student_semester;
    }

    public void setStudent_semester(String student_semester) {
        this.student_semester = student_semester;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_section() {
        return student_section;
    }

    public void setStudent_section(String student_section) {
        this.student_section = student_section;
    }

    public String getStudent_cgpa() {
        return student_cgpa;
    }

    public void setStudent_cgpa(String student_cgpa) {
        this.student_cgpa = student_cgpa;
    }

    public Management[] getInfo() {
        return info;
    }

    public void setInfo(Management[] info) {
        this.info = info;
    }
    
     @Override
   public void finish()
        {
            System.out.println("Thank You for Using");
        }
}
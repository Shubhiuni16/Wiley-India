import java.util.Scanner;

//import java.lang.*;
class Student {
    static int regdNo;
    static String Name;
    static int year;
    static final String COLLEGE="S.L.I.E.T.";
    String course;
    String[] subject = new String[3]; 
    Student(){
        Scanner sc=new Scanner(System.in);  
        regdNo=Integer.parseInt(sc.nextLine());
        Name=sc.nextLine();
        year=Integer.parseInt(sc.nextLine());
        course=sc.nextLine();
        if(course=="CSE"||course=="ECE"||course=="EEE"){

        }  
        else{
            //throw new java.lang.Error("Should be CSE,ECE or EEE");
        }
        for(int i=0;i<3;i++)
        subject[i]=sc.nextLine();
        sc.close(); 
    }
    @Override
    public String toString() {
        System.out.println("Registration No.= "+regdNo+"\nName= "+Name+"\nYear= "+year+"\nCollege= "+COLLEGE+"\ncourse= "+course+"\n");
        for(int i=0;i<3;i++)
        System.out.println("Subject"+i+1+" = "+subject[i]);
        return super.toString();
    }

}
public class StudentDetails{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
    }

}

/* import java.util.Scanner;

enum Courses {
    CSE, EEE, ECE
}

class Student {
    static final String COLLEGE = "Hogwarts Magical School";
    static final int YEAR_OF_ADMISSION = 2021;
    final long regdNo;
    String name;
    Courses course;
    String[] subjects;

    // Parameterized constructor
    Student(long regdNo, String name, Courses course, String[] subjects) {
        this.regdNo = regdNo;
        this.name = name;
        this.course = course;
        this.subjects = subjects;
public class NewAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[2];

        for (int i = 0; i < 2; i++) {
            long regdNo = Long.parseLong(scanner.nextLine());
            String name = scanner.nextLine();
            Courses course = Courses.CSE;
            String subject = scanner.nextLine();
            switch (subject) {
                case "EEE":
                    course = Courses.EEE;
                    break;
                case "ECE":
                    course = Courses.ECE;
                    break;
                default:
                    break;
            }
            String[] subjects = new String[3];
            for (int j = 0; j < 3; j++) {
                subjects[j] = scanner.nextLine();
            }
            students[i] = new Student(regdNo, name, course, subjects);

            System.out.println(students[i]);
        }

        scanner.close();
    }
}
 */
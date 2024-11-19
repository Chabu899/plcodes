import java.util.Scanner;

class Biodata {
    String name;
    String course;
    String college;
    String city;
    String birthDate;

    void displayBiodata() {
        System.out.println("\nBiodata:");
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("College: " + college);
        System.out.println("City: " + city);
        System.out.println("Birth Date: " + birthDate);
    }
}

public class exp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Biodata myBiodata = new Biodata();

        System.out.print("Enter your name: ");
        myBiodata.name = scanner.nextLine();

        System.out.print("Enter your course: ");
        myBiodata.course = scanner.nextLine();

        System.out.print("Enter your college: ");
        myBiodata.college = scanner.nextLine();

        System.out.print("Enter your city: ");
        myBiodata.city = scanner.nextLine();

        System.out.print("Enter your birth date (e.g., 9th August 2004): ");
        myBiodata.birthDate = scanner.nextLine();

        myBiodata.displayBiodata();

        scanner.close();
    }
}

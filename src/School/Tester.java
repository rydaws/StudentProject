package School;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public void run(ArrayList<Student> db) {
        int choice;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter 1 to change a student's GPA\nEnter 2 to increment student absences\nEnter 3 to print all info for given students\nEnter 4 to quit");
            choice = input.nextInt();
            input.nextLine();
            if (choice == 4) return;


                switch (choice) {
                    case 1:
                        System.out.println("Enter the students name: ");
                        String name = input.nextLine();
                        for (Student student : db) {
                            if (name.equalsIgnoreCase(student.getName())) {
                                System.out.println(student.getName() + "'s GPA is currently: " + student.getGPA() + "\nEnter what you'd like to change it to: ");
                                double newGPA = input.nextDouble();
                                input.nextLine();

                                student.setGPA(newGPA);
                                System.out.println(student.getName() + "'s GPA has been updated to: " + student.getGPA());
                                break;
                            } else {
                                System.out.println("Person not found");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Enter the students name: ");
                        name = input.nextLine();
                        for (Student student : db) {
                            if (name.equalsIgnoreCase(student.getName())) {
                                student.incrementAbsences();
                                System.out.println(student.getName() + "'s absences are now: " + student.getAbsences());
                                break;
                            } else {
                                System.out.println("Person not found");
                            }
                        }
                        break;
                    case 3:
                        for (Student student : db) {
                            System.out.println("Name: " + student.getName() + "\nGPA: " + student.getGPA() + "\nAbsences: " + student.getAbsences() + "\n");
                        }
                        break;
                }
            }
        }


    public ArrayList<Student> fillDB(ArrayList<Student> db) {
        Student student1 = new Student("David Scott", 3.87, 1);
        Student student2 = new Student("Ryan Dawson", 3.61, 3);

        db.add(student1);
        db.add(student2);

        return db;
    }
}
import java.util.Scanner;

public class GradeBook {
    private static Student[] students;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        students = new Student[] { new Student(), new Student() };
        students[0].setFirstName("Alan");
        students[1].setFirstName("Ada");
        students[0].setLastName("Turing");
        students[1].setLastName("Lovelace");
        students[0].setGrade(95);
        students[1].setGrade(87);

        System.out.println("Welcome to the CM111 Grade Book App!");

        while(true) {
            System.out.println("\nPlease make a selection:\n");
            System.out.println("1) List Class Grades");
            System.out.println("2) Exit");
            //another option
            System.out.println("3) Update grade");
            System.out.println();
            System.out.print("\nPlease choose an option: ");
            String choice = input.nextLine();
            System.out.println();
            switch(choice) {
                case "1": // TODO: write a loop that, for each student prints 
                          //       lname, fname: grade 
                        for (Student student : students){
                            System.out.printf("%s, %s: %f\n", student.getLastName(), student.getFirstName(), student.getGrade());
                        }

                    continue;
                case "2":
                    System.out.println("Goodbye!");
                    return;

                // Challenge: write another option to allow updating grades for a selected student
                case "3":
                    //updating grade
                    System.out.println("Please choose 1 to update grades for Alan and choose 2 to update grades for Ada: ");
                    String updatedgrade = input.nextLine();
                    if (updatedgrade.equals("1")){
                        System.out.println("Enter a new Score for Alan");
                        int newGrade = input.nextInt();
                        students[0].setGrade(newGrade);
                        System.out.println("Alan's grade updated successfully.");
                    }
                    else if (updatedgrade.equals("2")){
                         System.out.println("Enter a new Score for Ada");
                        int newGrade = input.nextInt();
                        students[1].setGrade(newGrade);
                        System.out.println("Ada's grade updated successfully.");
                    }
                    else{
                        System.out.println("Invalid choice. Enter either 1 or 2.");
                    }
                    
                    

            }
        }
    }
}

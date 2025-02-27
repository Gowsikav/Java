public class EducationSystem {
    public static void main(String[] args) {
        System.out.println("Student Information:");
        for (int i = 0; i < Student.studentIds.length; i++) {
            System.out.println("Student ID: " + Student.studentIds[i] + ", Name: " + Student.studentNames[i]);
        }

        System.out.println("\nCourse Details:");
        for (int i = 0; i < Course.courseFees.length; i++) {
            System.out.println("Course Fee: $" + Course.courseFees[i]);
        }
        for (int i = 0; i < Course.courseGrades.length; i++) {
            System.out.println("Course Grade: " + Course.courseGrades[i]);
        }
        for (int i = 0; i < Course.isCourseAvailable.length; i++) {
            System.out.println("Course Available: " + Course.isCourseAvailable[i]);
        }

        System.out.println("\nLibrary Book Details:");
        for (int i = 0; i < Library.bookISBNs.length; i++) {
            System.out.println("Book ISBN: " + Library.bookISBNs[i]);
        }
        for (int i = 0; i < Library.bookPrices.length; i++) {
            System.out.println("Book Price: $" + Library.bookPrices[i]);
        }
        for (int i = 0; i < Library.bookEditions.length; i++) {
            System.out.println("Book Edition: " + Library.bookEditions[i]);
        }
    }
}
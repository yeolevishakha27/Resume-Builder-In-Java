import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.println("Enter your education: ");
        String education = scanner.nextLine();

        System.out.println("Enter your experience: ");
        String experience = scanner.nextLine();

        System.out.println("Enter your skills: ");
        String skills = scanner.nextLine();

        System.out.println("\n--- Resume ---");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Education: " + education);
        System.out.println("Experience: " + experience);
        System.out.println("Skills: " + skills);

        scanner.close();
    }
}

import java.util.Scanner;

public class JobSalarySurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        JobSurvey survey = new JobSurvey();

        while (!exit) {
         System.out.println("1. Enter job data for survey");
         System.out.println("2. Calculate metrics");
         System.out.println("3. Exit");
         System.out.print("Enter your choice: ");
          int choice = scanner.nextInt();
           scanner.nextLine();

          switch (choice) {
              case 1:
                 // User enters job information on this option
                   survey.enterJobInformation(scanner);
                   break;
                 case 2:
                    // Application calculates required metrics on this option
                    survey.calculateMetrics();
                    break;
                case 3:
               // User exits the application on this option
                   exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}

class JobSurvey {
    private String highestPaidJob;
    private String lowestPaidJob;
    private double highestSalary;
    private double lowestSalary;
    private double totalSalary;
    private int jobCount;
    private String highestPaidJobEuroZone;
    private String lowestPaidJobEuroZone;

    public void enterJobInformation(Scanner scanner) {
        System.out.print("Enter job title: ");
        String jobTitle = scanner.nextLine();
        System.out.print("Enter yearly salary for " + jobTitle + ": EUR");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Is this job in a Euro Zone country? (yes/no): ");
        String euroZoneResponse = scanner.nextLine().trim().toLowerCase();
        boolean inEuroZone = euroZoneResponse.equals("yes");

        // Required metrics calculations to be diplayed
        if (jobCount == 0 || salary > highestSalary) {
          highestSalary = salary;
            highestPaidJob = jobTitle;
            if (inEuroZone) {
               highestPaidJobEuroZone = jobTitle;
            }
        }
        if (jobCount == 0 || salary < lowestSalary) {
           lowestSalary = salary;
          lowestPaidJob = jobTitle;
            if (inEuroZone) {
               lowestPaidJobEuroZone = jobTitle;
            }
        }
        totalSalary += salary;
        jobCount++;
    }

    public void calculateMetrics() {
        if (jobCount == 0) {
            System.out.println("No jobs entered yet.");
            return;
        }
        double averageSalary = totalSalary / jobCount;
        System.out.println("Job with the highest salary: " + highestPaidJob + " (EUR" + highestSalary + ")");
        System.out.println("Job with the lowest salary: " + lowestPaidJob + " (EUR" + lowestSalary + ")");
        System.out.println("Average salary: EUR" + averageSalary);
        if (highestPaidJobEuroZone != null) {
          System.out.println("Job with highest salary in Euro Zone: " + highestPaidJobEuroZone);
        }
        if (lowestPaidJobEuroZone != null) {
          System.out.println("Job with lowest salary in Euro Zone: " + lowestPaidJobEuroZone);
        }
    }
}
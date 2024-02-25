import Plan.Plan;

    public class Main {
        public static void main(String[] args) {
            performOperations();
        }
        public static void performOperations() {
            // Healthplan örneği
            Healthplan healthplan;
            healthplan = new Healthplan(1, "Gold", new Plan("Doctor Visit", "Hospitalization", "Prescription Drugs"));
            System.out.println(healthplan.toString());

            // Employee örneği
            Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "password123");
            employee.addHealthplan(0, "Gold");
            System.out.println(employee.toString());

            // Company örneği
            Company company = new Company(1, "ABC Company", 10000);
            company.addEmployee(0, "Alice");
            System.out.println(company.toString());
        }
    }



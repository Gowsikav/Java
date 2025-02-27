public class CompanyInfo {
    public static void main(String[] args) {
        System.out.println("Employee Details:");
        System.out.println("ID: " + Employee.id);
        System.out.println("Name: " + Employee.name);
        System.out.println("Age: " + Employee.age);
        System.out.println("Salary: $" + Employee.salary);
        System.out.println("Department: " + Employee.department);
        System.out.println("Designation: " + Employee.designation);
        System.out.println("Email: " + Employee.email);
        System.out.println("Phone: " + Employee.phoneNumber);
        System.out.println("Permanent Employee: " + Employee.isPermanent);
        System.out.println("Grade: " + Employee.grade);

        System.out.println("\nDepartment Details:");
        System.out.println("Department ID: " + Department.deptId);
        System.out.println("Department Name: " + Department.deptName);
        System.out.println("Total Employees: " + Department.totalEmployees);
        System.out.println("Manager: " + Department.manager);
        System.out.println("Budget: $" + Department.budget);
        System.out.println("Location: " + Department.location);
        System.out.println("Established Date: " + Department.establishedDate);
        System.out.println("Is Active: " + Department.isActive);
        System.out.println("Number of Projects: " + Department.numProjects);
        System.out.println("Contact Email: " + Department.contactEmail);
    }
}
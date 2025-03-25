class PatientRunner 
{
    public static void main(String[] args) 
    {
        Patient patient = new Patient();
        System.out.println("Default name value: " + patient.name);
        System.out.println("Default age value: " + patient.age);
        System.out.println("Default isAdmitted value: " + patient.isAdmitted);
        System.out.println("Default disease value: " + patient.disease);

        patient.name = "John Doe";
        patient.age = 45;
        patient.isAdmitted = true;
        patient.disease = "Flu";

        System.out.println("Updated name value: " + patient.name);
        System.out.println("Updated age value: " + patient.age);
        System.out.println("Updated isAdmitted value: " + patient.isAdmitted);
        System.out.println("Updated disease value: " + patient.disease);
    }
}

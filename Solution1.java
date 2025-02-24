class Solution1
{
	public static void main(String[] args) {
		
		if (StaticVariables15.age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        if (StaticVariables15.temperature > 37.0) {
            System.out.println("Fever detected!");
        } else {
            System.out.println("Normal body temperature.");
        }

        if (StaticVariables15.marks >= 90) {
            System.out.println("Grade: A");
        } else if (StaticVariables15.marks >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        if (StaticVariables15.salary > 50000) {
            System.out.println("Eligible for premium benefits.");
        } else {
            System.out.println("Standard salary benefits.");
        }

        if (StaticVariables15.country.equals("India")) {
            System.out.println("Indian citizen.");
        } else {
            System.out.println("Foreigner.");
        }

        if (StaticVariables15.experience >= 5) {
            System.out.println("Eligible for senior-level position.");
        } else {
            System.out.println("Eligible for junior-level position.");
        }

        if (StaticVariables15.hasLicense) {
            System.out.println("Can drive a vehicle.");
        } else {
            System.out.println("Cannot drive a vehicle.");
        }

        if (StaticVariables15.workingHours > 8) {
            System.out.println("Overtime applied.");
        } else {
            System.out.println("Regular working hours.");
        }

        if (StaticVariables15.loanAmount > 100000) {
            System.out.println("High loan amount.");
        } else {
            System.out.println("Manageable loan amount.");
        }

        if (StaticVariables15.interestRate > 5.0) {
            System.out.println("High-interest loan.");
        } else {
            System.out.println("Low-interest loan.");
        }

        if (StaticVariables15.creditScore >= 750) {
            System.out.println("Eligible for best credit cards.");
        } else {
            System.out.println("Improve credit score for better offers.");
        }

        if (StaticVariables15.isVaccinated) {
            System.out.println("Fully vaccinated.");
        } else {
            System.out.println("Vaccination required.");
        }

        if (StaticVariables15.weather.equals("Rainy")) {
            System.out.println("Carry an umbrella!");
        } else {
            System.out.println("Weather is clear.");
        }

        if (StaticVariables15.distance > 10) {
            System.out.println("Use a vehicle for transport.");
        } else {
            System.out.println("Walking distance.");
        }

        if (StaticVariables15.isWeekend) {
            System.out.println("Enjoy your weekend!");
        } else {
            System.out.println("It's a weekday, keep working.");
        }
	}
}
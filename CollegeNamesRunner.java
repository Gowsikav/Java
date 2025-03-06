class CollegeNamesRunner
{
	public static void main(String[] args)
	{
		CollegeNames.saveCollege("IIT");
		CollegeNames.saveCollege("PSG");
		CollegeNames.saveCollege("Anna University");
		CollegeNames.saveCollege("Harvard University");
		CollegeNames.saveCollege("Oxford University");
		CollegeNames.saveCollege("Stanford University");
		CollegeNames.displayColleges();
		CollegeNames.searchCollege("Harvard University");
		CollegeNames.searchCollege("University Of Cambridge");
	
	}
	
}
public class CollegeNames 
{
    static String[] collegeList = {null, null, null, null, null};
    static int index = 0;

    static void saveCollege(String name)
    {
        if (index < collegeList.length)
         {
            collegeList[index] = name;
            System.out.println("College " + name + " successfully added.");
            index++;
        } 
        else {
            System.out.println("College list is full! Cannot add more.");
        }
    }

    static void displayColleges()
    {
        if(collegeList!=null)
        {
           System.out.println("College Names List:");
           for (String college : collegeList)
            {
                System.out.println(college);
            }
        }
        else
        {
            System.out.println("College List is Empty");
        }
    }

    static void searchCollege(String name)
     {
        for (int index=0;index<collegeList.length;index++)
         {
            if (collegeList[index].equalsIgnoreCase(name)) {
                System.out.println("College " + name + " is present.");
                break;
            }
            if(index==collegeList.length-1)
                System.out.println("College " + name + " is not present.");
        }
        
    }
}

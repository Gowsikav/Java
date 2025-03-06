public class CricketTeams
 {
    static String[] teamList = {null, null, null, null, null};
    static int index = 0;

    static void saveTeam(String name) 
    {
        if (index < teamList.length) 
        {
            teamList[index] = name;
            System.out.println("Team " + name + " successfully added.");
            index++;
        }
         else {
            System.out.println("Cricket Team list is full! Cannot add more.");
        }
    }

    static void displayTeams() 
    {
       if(teamList!=null)
       {
           System.out.println("Cricket Teams List:");
           for (String team : teamList)
           {
               System.out.println(team);
           }
       }
       else 
       {
          System.out.println("Team List is Empty");
        }

    }

    static void searchTeam(String name)
     {
        for (int index=0;index<teamList.length;index++)
         {
            if (teamList[index].equalsIgnoreCase(name))
             {
                System.out.println("Cricket Team " + name + " is present.");
                break;
            }
            if(index==teamList.length-1)
            System.out.println("Cricket Team " + name + " is not present.");
        }
        
    }
}

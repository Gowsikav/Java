class CricketTeamRunner
{
	public static void main(String[] args) 
	{
		CricketTeam.teamDetails("Monday","Virat","Dhoni","Sharma");
	    CricketTeam.teamDetails("Dhoni",10,120);
	    String[] names={"virat","dhoni","sharma"};
	    int[] scores={120,80,96};
	    int[] matches={10,8,7};
	    CricketTeam.teamDetails(names,scores,matches);

	}
}
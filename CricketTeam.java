class CricketTeam
{

	static void teamDetails(String day,String... playersName)
	{
		System.out.println("Players List");
		for(String name:playersName)
		{
			System.out.println(name);
		}
		System.out.println("Match on "+day);
	}

	static void teamDetails(String name,int noOfMatches,int totalRuns)
	{
		System.out.println("Average score: "+(totalRuns/noOfMatches));
	}	

	static void teamDetails(String[] names,int[] scores,int[] matches)
	{
		System.out.println("Players Average score");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]+" Average score is "+(scores[i]/matches[i]));
		}
	}
}
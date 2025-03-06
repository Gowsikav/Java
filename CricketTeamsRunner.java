class CricketTeamsRunner
{
	public static void main(String[] args) {

		CricketTeams.saveTeam("India");
		CricketTeams.saveTeam("Australia");
		CricketTeams.saveTeam("South Africa");
		CricketTeams.saveTeam("England");
		CricketTeams.saveTeam("New Zealand");
		CricketTeams.saveTeam("Pakistan");
		CricketTeams.displayTeams();
		CricketTeams.searchTeam("Australia");
		CricketTeams.searchTeam("U.S");
		
	}
}
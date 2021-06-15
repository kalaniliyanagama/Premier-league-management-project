

public class UniversityFootballClub extends FootballClub{
    private String uniName;

    public UniversityFootballClub(int registrationNumber, String sportClubName, int noOfClubWins, int noOfClubDraws, int noOfClubDefeat, int clubScore, int noOfClubGoalsScored, int noOfMatchesPlayed, int noOfClubGoalsReceived, String uniName) {
        super(registrationNumber, sportClubName, noOfClubWins, noOfClubDraws, noOfClubDefeat, clubScore, noOfClubGoalsScored, noOfClubGoalsReceived,noOfMatchesPlayed);
        this.uniName = uniName;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }
}

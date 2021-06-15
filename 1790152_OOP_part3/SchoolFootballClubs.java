

public class SchoolFootballClubs extends FootballClub {
    private String schoolName;

    public SchoolFootballClubs(int registrationNumber, String sportClubName, int noOfClubWins, int noOfClubDraws, int noOfClubDefeat, int clubScore, int noOfClubGoalsScored, int noOfMatchesPlayed, int noOfClubGoalsReceived, String schoolName) {
        super(registrationNumber, sportClubName, noOfClubWins, noOfClubDraws, noOfClubDefeat, clubScore, noOfClubGoalsScored, noOfClubGoalsReceived,  noOfMatchesPlayed);
        this.schoolName = schoolName;
    }



    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}

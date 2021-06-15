

public class FootballClub extends SportsClub{

    private int noOfClubWins;
    private int noOfClubDraws;
    private int noOfClubDefeat;
    private int clubScore;
    private int noOfClubGoalsScored;
    private int noOfClubGoalsReceived;
    private int noOfMatchesPlayed;

    public FootballClub(int registrationNumber, String sportClubName, int noOfClubWins, int noOfClubDraws, int noOfClubDefeat, int clubScore, int noOfClubGoalsScored, int noOfClubGoalsReceived, int noOfMatchesPlayed) {
        super(registrationNumber, sportClubName);
        this.noOfClubWins = noOfClubWins;
        this.noOfClubDraws = noOfClubDraws;
        this.noOfClubDefeat = noOfClubDefeat;
        this.clubScore = clubScore;
        this.noOfClubGoalsScored = noOfClubGoalsScored;
        this.noOfClubGoalsReceived = noOfClubGoalsReceived;
        this.noOfMatchesPlayed = noOfMatchesPlayed;
    }

    public int getNoOfClubWins() {
        return noOfClubWins;
    }

    public void setNoOfClubWins(int noOfClubWins) {
        this.noOfClubWins = noOfClubWins;
    }

    public int getNoOfClubDraws() {
        return noOfClubDraws;
    }

    public void setNoOfClubDraws(int noOfClubDraws) {
        this.noOfClubDraws = noOfClubDraws;
    }

    public int getNoOfClubDefeat() {
        return noOfClubDefeat;
    }

    public void setNoOfClubDefeat(int noOfClubDefeat) {
        this.noOfClubDefeat = noOfClubDefeat;
    }

    public int getClubScore() {
        return clubScore;
    }

    public void setClubScore(int clubScore) {
        this.clubScore = clubScore;
    }

    public int getNoOfClubGoalsScored() {
        return noOfClubGoalsScored;
    }

    public void setNoOfClubGoalsScored(int noOfClubGoalsScored) {
        this.noOfClubGoalsScored = noOfClubGoalsScored;
    }

    public int getNoOfClubGoalsReceived() {
        return noOfClubGoalsReceived;
    }

    public void setNoOfClubGoalsReceived(int noOfClubGoalsReceived) {
        this.noOfClubGoalsReceived = noOfClubGoalsReceived;
    }

    public int getNoOfMatchesPlayed() {
        return noOfMatchesPlayed;
    }

    public void setNoOfMatchesPlayed(int noOfMatchesPlayed) {
        this.noOfMatchesPlayed = noOfMatchesPlayed;
    }
}

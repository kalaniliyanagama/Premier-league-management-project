

public class SportsClub {
    private int registrationNumber;
    private String sportClubName;

    public SportsClub(int registrationNumber, String sportClubName) {
        this.registrationNumber = registrationNumber;
        this.sportClubName = sportClubName;

    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getSportClubName() {
        return sportClubName;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSportClubName(String sportClubName) {
        this.sportClubName = sportClubName;
    }
}

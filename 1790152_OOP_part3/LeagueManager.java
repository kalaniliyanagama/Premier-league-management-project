import java.io.IOException;

public interface LeagueManager {
    void createFootballClub(FootballClub footballClub);

    void deleteFootballClub(String clubName);

    void ClubStatistics(String clubName);

    void saveClub(FootballClub footballClub) throws IOException;

    void table();
}
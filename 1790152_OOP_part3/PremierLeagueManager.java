import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PremierLeagueManager implements LeagueManager {
    static List<FootballClub> clubList = new ArrayList<>();
    private int fSpace = TEAMS;
    public final static int TEAMS = 20;
    FootballClub fbC;

    @Override

    public void createFootballClub(FootballClub footballClub) {
        if (clubList.contains(footballClub)){
            System.out.println("This Football club already in the league ");

        }
        else if (fSpace == 0 ){
            System.out.println("\n");
            System.out.println("No free space Available for add club ");
            return;
        }

        else{
            clubList.add(footballClub);
            fSpace --;
            System.out.println("\n");
            System.out.println( fSpace > 0 ? ("Free space Remaining : " + fSpace): "No more space for a club " );


        }


    }

    @Override
    public void ClubStatistics(String clubName) {
        if (clubList.contains(clubName)){
            System.out.println("This Football club already in the league  :| ");
            for (FootballClub club : clubList){
                if(club.equals(clubName)){
                    System.out.println(club.toString());
                    break;
                }
            }
        }else {
            System.out.println("Club not found !");
        }
    }

    @Override
    public void saveClub(FootballClub footballClub) throws IOException {
        File file = new File("Club.txt");
        FileWriter fileWriter= null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            printWriter = new PrintWriter(fileWriter,true);
            printWriter.print(footballClub);
            printWriter.println(" ");
            System.out.println("Successfully saved.");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            fileWriter.close();
            printWriter.close();
        }

    }

    @Override
    public void table() {
        String leftAlignFormat = "| %-15s | %-4d | %-4d | %-4d | %-4d | %-4d | %-4d | %-4d | %-4d |%n";

        System.out.format("+-----------------+------+------+------+------+------+------+------+------+%n");
        System.out.format("| Club name       | MP   |  W   |  D   |  L   | pts  |  GS  |  GA  |  GD  |%n");
        System.out.format("+-----------------+------+------+------+------+------+------+------+------+%n");
        for (FootballClub fbC:clubList) {
            System.out.format(leftAlignFormat,fbC.getSportClubName(),fbC.getNoOfMatchesPlayed(),fbC.getNoOfClubWins(),fbC.getNoOfClubDraws(),fbC.getNoOfClubDefeat(),fbC.getClubScore(),fbC.getNoOfClubGoalsScored(),fbC.getNoOfClubGoalsReceived(),(fbC.getNoOfClubWins()-fbC.getNoOfClubDefeat()));
        }
        System.out.format("+-----------------+------+------+------+------+------+------+------+------+%n");

    }

    @Override
    public void deleteFootballClub(String clubName) {

        for (int i=0; i<clubList.size();i++) {
            if (clubName.equals(clubList.get(i).getSportClubName())) {
                clubList.remove(i);
                fSpace++;
            }
        }
        System.out.println("Successfully deleted the member  ! ");
        System.out.println();
        System.out.println();
    }
}

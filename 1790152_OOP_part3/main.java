import java.io.IOException;
import java.util.Scanner;

public class main {
    private static PremierLeagueManager leagueManager = new PremierLeagueManager();
    static Scanner sc = new Scanner(System.in);
    static FootballClub Club;

    public static void main(String[] args) throws IOException {
        do{

        System.out.println("\n");

        System.out.println("                             Premier League                               ");
        System.out.println(" | -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  | ");
        System.out.println("                                                                          ");
        System.out.println("         1.    Add football Club                                          ");
        System.out.println("         2.    Remove football Club                                       ");
        System.out.println("         3.    club Statistics                                            ");
        System.out.println("         4.    Premier League Table                                      ");
        System.out.println("         5.    Add Played Match Details                                   ");
        System.out.println("         6.    Save Updates                                               ");
        System.out.println("         7.    Quit Premier League Manager                                ");
        System.out.println("\n");
        System.out.println(" Enter you Choice :");
        int userC = sc.nextInt();
        switch (userC) {
            case 1:
                addClub();
                break;
            case 2:
                removeClub();
                break;
            case 3:
                displayClub();
                break;
            case 4:
                displayTable();
                break;
            case 5:
                // addMatch();
                break;
            case 6:
                 saveAllUpdates();
                break;
            case 7:
                //  quitFromManager();

                break;
            default:
                System.out.println("Invalid input. Please check the menu again.");
        }

    }while (true);
    }

    private static void displayTable() {
        leagueManager.table();
    }

    private static void saveAllUpdates() throws IOException {
        leagueManager.saveClub(Club);
    }

    private static void addClub() {
        String schoolName = null;
        String UniversityName = null;
        System.out.println("        -----          ADD football Club                 -----           ");
        System.out.println(" |       1. Add School Club                                             | ");
        System.out.println(" |       2. Add University Club                                         | ");

        System.out.println("\n");
        System.out.println(" Enter you Choice :");
        int uChoice = sc.nextInt();

        if (uChoice == 1) {

            System.out.print("School Name: ");
            schoolName = sc.next();
        } else if (uChoice == 2) {

            System.out.print("University Name: ");
            UniversityName = sc.next();
        } else {
            System.out.println("Error");
            return;
        }

        System.out.print("Club Register Number: ");
        int registerNum = sc.nextInt();

        System.out.print("Club Name: ");
        String clubName = sc.next();

        System.out.print("Club Location: ");
        String clubLocation = sc.next();

        System.out.print("Club Number of matches played: ");
        int pMatches = sc.nextInt();

        System.out.print("Club Number of Points: ");
        int noOfPoints = sc.nextInt();

        System.out.print("Club Number of Wins: ");
        int noWins = sc.nextInt();

        System.out.print("Club Number of Draws: ");
        int noDraws = sc.nextInt();

        System.out.print("Club Number of Defeats: ");
        int noDefeats = sc.nextInt();

        System.out.print("Club Number of Goals Received: ");
        int noGoalsRe = sc.nextInt();

        System.out.print("Club Number of Goals Scored: ");
        int noGoalsSc = sc.nextInt();

        switch (uChoice) {
            case 1:
                Club = new SchoolFootballClubs(registerNum, clubName, noWins, noDraws, noDefeats, noOfPoints,  noGoalsSc,pMatches, noGoalsRe,schoolName);
                leagueManager.createFootballClub(Club);
                break;

            case 2:
                Club = new UniversityFootballClub(registerNum, clubName, noWins, noDraws, noDefeats, noOfPoints,  noGoalsSc,pMatches, noGoalsRe,UniversityName);
                leagueManager.createFootballClub(Club);
                break;
        }

    }

    private static void removeClub() {
        System.out.println(" Remove football Club from  Premier League");
        System.out.println("  Enter Club name: ");
        String clubName = sc.next();
        leagueManager.deleteFootballClub(clubName);

    }
    private static void displayClub() {
        System.out.println("----------- Club Statics --------------");
        System.out.println("Enter club name : ");
        String userChoice = sc.next();
        leagueManager.ClubStatistics(userChoice);



    }
}

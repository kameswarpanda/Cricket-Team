package cricketteam;


import java.util.ArrayList;
import java.util.List;

public class CricketTeamApp {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        // Manually add players (this could be replaced with file reading logic)
        players.add(new Player("Rohit Sharma", "BT", true, false, false));
        players.add(new Player("Shubman Gill", "BT", false, true, false));
        players.add(new Player("Virat Kohli", "BT", false, false, false));
        players.add(new Player("KL Rahul", "BT", false, false, true));
        players.add(new Player("Rishabh Pant", "BT", false, false, true));
        players.add(new Player("Shreyas Iyer", "BT", false, false, false));
        players.add(new Player("Shivam Dube", "BT", false, false, false));
        players.add(new Player("Kuldeep Yadav", "BL", false, false, false));
        players.add(new Player("Mohd. Siraj", "BL", false, false, false));
        players.add(new Player("Washington Sundar", "BL", false, false, false));
        players.add(new Player("Arshdeep Singh", "BL", false, false, false));

        CricketTeam team = new CricketTeam();

        // Select players based on criteria
        for (Player player : players) {
            team.addPlayer(player);
        }

        // Display the selected team
        team.displayTeam();
    }
}


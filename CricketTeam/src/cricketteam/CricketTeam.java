package cricketteam;


import java.util.ArrayList;
import java.util.List;

public class CricketTeam {
    private List<Player> batsmen = new ArrayList<>();
    private List<Player> bowlers = new ArrayList<>();

    public void addPlayer(Player player) {
        if (player.getRole().equals("BT") && batsmen.size() < 7) {
            batsmen.add(player);
        } else if (player.getRole().equals("BL") && bowlers.size() < 4) {
            bowlers.add(player);
        }
    }

    public void displayTeam() {
        System.out.println("Selected Cricket Team:");
        System.out.println("Batsmen:");
        for (Player batsman : batsmen) {
            System.out.println("- " + batsman);
        }
        System.out.println("Bowlers:");
        for (Player bowler : bowlers) {
            System.out.println("- " + bowler);
        }
    }
}


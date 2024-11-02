package cricketteam;

public class Player {
    private String name;
    private String role; // BT for Batsman, BL for Bowler
    private boolean isCaptain;
    private boolean isViceCaptain;
    private boolean isWicketKeeper;

    public Player(String name, String role, boolean isCaptain, boolean isViceCaptain, boolean isWicketKeeper) {
        this.name = name;
        this.role = role;
        this.isCaptain = isCaptain;
        this.isViceCaptain = isViceCaptain;
        this.isWicketKeeper = isWicketKeeper;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public boolean isViceCaptain() {
        return isViceCaptain;
    }

    public boolean isWicketKeeper() {
        return isWicketKeeper;
    }

    @Override
    public String toString() {
        return name + " (" + role + (isCaptain ? ", C" : "") + (isViceCaptain ? ", VC" : "") + (isWicketKeeper ? ", WK" : "") + ")";
    }
}

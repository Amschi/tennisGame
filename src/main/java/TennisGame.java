public class TennisGame {


    public static final String SCORE_LABEL[] = {"Love", "Fifteen", "Thirty", "Forty"};
    public static final String J1_WINS_TEXT = "J1 WINS";
    public static final String J2_WINS_TEXT = "J2 WINS";
    public static final Integer NOMBRE_DE_POINTS_JEU = 4;
    public static final Integer NOMBRE_DE_POINTS_THIRTY = 4;

    Player P1 = new Player(1, 0);
    Player P2 = new Player(2, 0);


    public void scorePoint(Player player) {
        if (player.getNumero() == 1) {
            P1.setPointPlayer(P1.getPointPlayer() + 1);
        }
        if (player.getNumero() == 2) {
            P2.setPointPlayer(P2.getPointPlayer() + 1);
        }
    }

    public String getScore() {


        if (P1.getPointPlayer() == P2.getPointPlayer() && P1.getPointPlayer() > 0) {
            return "Deuce";
        } else if (P1.getPointPlayer() < SCORE_LABEL.length && P2.getPointPlayer() < SCORE_LABEL.length) {
            return SCORE_LABEL[P1.getPointPlayer()] + " - " + SCORE_LABEL[P2.getPointPlayer()];
        } else if (P1.getPointPlayer() == NOMBRE_DE_POINTS_JEU && P2.getPointPlayer() <= NOMBRE_DE_POINTS_THIRTY) {
            return J1_WINS_TEXT;
        } else if (P2.getPointPlayer() == NOMBRE_DE_POINTS_JEU && P1.getPointPlayer() <= NOMBRE_DE_POINTS_THIRTY) {
            return J2_WINS_TEXT;
        } else if (P1.getPointPlayer() - P2.getPointPlayer() > 0 || P2.getPointPlayer() - P1.getPointPlayer() > 0) {
            return "Advantage";
        }

        return "Love - Love";
    }
}




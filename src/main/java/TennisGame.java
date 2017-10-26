public class TennisGame {


    public static final String SCORE_LABEL[] = {"Love", "Fifteen", "Thirty", "Forty"};
    public static final String J1_WINS_TEXT = "J1 WINS";
    public static final String J2_WINS_TEXT = "J2 WINS";
    private Integer pointPlayer1 = 0;
    private Integer pointPlayer2 = 0;


    public void scorePoint(Player player) {
        if (player.getNumero() == 1) {
            pointPlayer1++;
        } else if (player.getNumero() == 2) {
            pointPlayer2++;
        }
    }

    public String getScore() {

        if (pointPlayer1 == 4 || pointPlayer2 == 4) {
            return "Advantage";
        } else if (pointPlayer1 == 3 && pointPlayer2 == 3) {
            return "Deuce";
        } else if (pointPlayer1 < SCORE_LABEL.length && pointPlayer2 < SCORE_LABEL.length) {
            return SCORE_LABEL[pointPlayer1] + " - " + SCORE_LABEL[pointPlayer2];
        }
        return "Love - Love";
    }
}

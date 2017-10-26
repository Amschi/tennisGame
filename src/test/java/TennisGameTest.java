import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class TennisGameTest {

    TennisGame tennisGame;
    Player player1;
    Player player2;

    @Before
    public void setUp() {
        tennisGame = new TennisGame();
        player1 = new Player(1, 0);
        player2 = new Player(2, 0);
    }

    @Test
    public void getScore_return_love_love_at_start() {
        // GIVEN
        String expected = "Love - Love";

        // WHEN

        // THEN
        assertThat(tennisGame.getScore()).isEqualTo(expected);
    }


    @Test
    public void scorePoint_return_fifteen_love_when_P1_wins_1_point() {
        // GIVEN
        String expected = "Fifteen - Love";

        // WHEN
        tennisGame.scorePoint(player1);

        // THEN
        assertThat(tennisGame.getScore()).isEqualTo(expected);
    }


    @Test
    public void scorePoint_return_thirty_love_when_P1_wins_2_points() {
        // GIVEN
        String expected = "Thirty - Love";

        // WHEN
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player1);

        // THEN
        assertThat(tennisGame.getScore()).isEqualTo(expected);
    }

    @Test
    public void scorePoint_return_forty_love_when_P1_wins_3_points() {
        // GIVEN
        String expected = "Forty - Love";

        // WHEN
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player1);

        // THEN
        assertThat(tennisGame.getScore()).isEqualTo(expected);
    }

    @Test
    public void scorePoint_return_forty_fifteen_when_P1_wins_0_point_P2_wins_1_point() {
        // GIVEN
        String expected = "Love - Fifteen";

        // WHEN
        tennisGame.scorePoint(player2);

        // THEN
        assertThat(tennisGame.getScore()).isEqualTo(expected);
    }

    @Test
    public void scorePoint_return_Deuce_when_P1_wins_3_points_P2_wins_3_points() {
        // GIVEN
        String expected = "Deuce";

        // WHEN
        tennisGame.scorePoint(player2);
        tennisGame.scorePoint(player2);
        tennisGame.scorePoint(player2);
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player1);


        // THEN
        assertThat(tennisGame.getScore()).isEqualTo(expected);
    }

    @Test
    public void scorePoint_return_Advantage_when_P1_wins_3_points_P2_wins_4_points() {
        // GIVEN
        String expected = "Advantage";

        // WHEN
        tennisGame.scorePoint(player2);
        tennisGame.scorePoint(player2);
        tennisGame.scorePoint(player2);
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player2);


        // THEN
        assertThat(tennisGame.getScore()).isEqualTo(expected);
    }

    @Test
    public void scorePoint_return_Deuce_when_P1_wins_4_points_P2_wins_5_points() {
        // GIVEN
        String expected = "Deuce";

        // WHEN
        tennisGame.scorePoint(player2);
        tennisGame.scorePoint(player2);
        tennisGame.scorePoint(player2);
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player1);
        tennisGame.scorePoint(player2);


        // THEN
        assertThat(tennisGame.getScore()).isEqualTo(expected);
    }
}

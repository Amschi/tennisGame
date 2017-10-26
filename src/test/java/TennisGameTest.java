import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class TennisGameTest {


    @Test
    public void score_should_be_love_love_at_start() {
        // GIVEN
        String expected = "Love - Love";
        TennisGame tennisGame = new TennisGame();

        // WHEN
       // String p1_score_a_point = tennisGame.scorePoint(0);

        // THEN
        assertThat(tennisGame.scorePoint()).isEqualTo(expected);
    }


    @Test
    public void scorePoint_return_fifteen_love_when_P1_wins_a_point() {
        // GIVEN
        String expected = "Fiftenn - Love";
        TennisGame tennisGame = new TennisGame();

        // WHEN
        String p1_score_a_point = tennisGame.scorePoint(1);

        // THEN
        assertThat(p1_score_a_point).isEqualTo(expected);
    }
}

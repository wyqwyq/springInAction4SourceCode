package nba;

import static com.google.common.truth.Truth.*;
import nba.Fans;
import nba.Game;
import nba.GameConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = GameConfig.class)
public class GameTest {
  @Autowired
  private Fans fans;

  @Autowired
  private Game g;

  @Test
  public void testFans() {
    assertThat(fans).isNotNull();
    assertThat(g).isNotNull();
    g.play();
  }
}

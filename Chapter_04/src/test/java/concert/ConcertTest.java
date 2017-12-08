package concert;

import static com.google.common.truth.Truth.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest extends AbstractJUnit4SpringContextTests {
  
  @Autowired
  private Audience a;
  
  @Autowired
  private Performance p;

  @Test
  public void testAudience() {
    p.perform();
    assertThat(a).isNotNull();
    Encoreable e = (Encoreable) p;
    e.performEncore();
  }
}

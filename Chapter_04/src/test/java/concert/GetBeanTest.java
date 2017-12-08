package concert;

import static com.google.common.truth.Truth.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class GetBeanTest implements ApplicationContextAware {

  private ApplicationContext ctx;
  
  @Autowired
  private Audience audience;
  
  @Autowired
  private Audience a2;

  @Override
  public void setApplicationContext(ApplicationContext ctx) throws BeansException {
    this.ctx = ctx;
  }
  
  @Test
  public void testAutowired() {
   assertThat(audience).isNotNull();
   assertThat(a2).isNotNull();
   assertThat(audience).isSameAs(a2);
  }

  @Test
  public void testGetBean() {
    Audience a = (Audience) ctx.getBean("audience");
    assertThat(a).isNotNull();
  }
}

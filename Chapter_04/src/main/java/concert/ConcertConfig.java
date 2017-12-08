package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig {
  @Bean
  public Audience audience() {
    return new Audience();
  }

  @Bean
  public Performance performance() {
    return new PerformanceImpl();
  }
  
  @Bean
  public EncoreableIntroducer encoreableIntroducer() {
    return new EncoreableIntroducer();
  }
}

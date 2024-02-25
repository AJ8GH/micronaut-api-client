package hello.micronaut.client;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Requires;

@ConfigurationProperties(FplConfig.PREFIX)
@Requires(property = FplConfig.PREFIX)
public record FplConfig(String bootstrapStatic) {

  public static final String PREFIX = "fpl";
}

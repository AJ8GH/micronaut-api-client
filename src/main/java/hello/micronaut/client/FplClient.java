package hello.micronaut.client;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import org.reactivestreams.Publisher;

@Singleton
@RequiredArgsConstructor
public class FplClient {

  @Client(id = FplConfig.PREFIX)
  private final HttpClient httpClient;
  private final FplConfig fplConfig;

  public Publisher<String> bootstrapStatic() {
    return httpClient.retrieve(fplConfig.bootstrapStatic());
  }
}

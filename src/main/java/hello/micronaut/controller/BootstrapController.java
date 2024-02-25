package hello.micronaut.controller;

import hello.micronaut.client.FplClient;
import hello.micronaut.client.FplClientDecl;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;
import org.reactivestreams.Publisher;

@RequiredArgsConstructor
@Controller("${client.endpoint.bootstrap-static}")
public class BootstrapController {

  private final FplClient client;
  private final FplClientDecl declClient;

  @Get(produces = MediaType.TEXT_PLAIN)
  public Publisher<String> bootstrapStatic() {
    //return client.bootstrapStatic();
    return declClient.bootstrapStatic();
  }
}

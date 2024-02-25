package hello.micronaut.controller;

import hello.micronaut.service.HelloService;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

  private final HelloService service;
  private final String word;

  public HelloController(
      HelloService service,
      @Value("${hello.service.word}") String word) {
    this.service = service;
    this.word = word;
  }

  @Get(produces = MediaType.TEXT_PLAIN)
  public String index() {
    return service.get(word);
  }
}

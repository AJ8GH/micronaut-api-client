package hello.micronaut.client;

import io.micronaut.core.async.annotation.SingleResult;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import org.reactivestreams.Publisher;

@Client(id = "fpl")
public interface FplClientDecl {

  @Get("/api/bootstrap-static/")
  @SingleResult
  Publisher<String> bootstrapStatic();
}

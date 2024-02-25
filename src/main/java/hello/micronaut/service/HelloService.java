package hello.micronaut.service;

import static java.lang.String.format;

import jakarta.inject.Singleton;

@Singleton
public class HelloService {

  public String get(String s) {
    return format("Hello, %s!", s);
  }
}

package io.pwii.repository;

import java.util.Random;
import javax.inject.Singleton;

@Singleton
public class FakeRepository {

  public boolean complexRequest() {
    Integer shouldBeEven = new Random().nextInt(10);
    System.out.println("Called the real method...");
    return (shouldBeEven % 2) == 0;
  }
  
}

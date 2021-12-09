package io.pwii.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import io.pwii.repository.FakeRepository;

@ApplicationScoped
public class FakeService {

  @Inject
  private FakeRepository fakeRepository;

  @CircuitBreaker(
    requestVolumeThreshold= 4,
    delay = 10000
  )
  public String amIWorking() {
    boolean isWorking = fakeRepository.complexRequest();

    if (!isWorking) {
      throw new RuntimeException("Request is not working!");
    }

    return "YES! Everything is running ok.";
  }
  
}

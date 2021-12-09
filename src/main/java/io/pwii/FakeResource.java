package io.pwii;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.pwii.service.FakeService;

@Path("/availability")
public class FakeResource {

  @Inject
  private FakeService fakeService;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String isWorking() {
    return fakeService.amIWorking();
  }
  
}

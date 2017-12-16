package platform.user.api;

import platform.user.model.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/user")
public interface UserServiceInterface {


    @Path("/users/creation")
    @Consumes(MediaType.APPLICATION_JSON)
    void addUser(User user);

    @GET
    @Path("/users")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Collection<User> getUsers();

}

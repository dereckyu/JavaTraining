package platform.user.api;

import platform.user.model.LoginRequest;
import platform.user.model.LoginResponse;
import platform.user.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/user")
public interface UserServiceInterface
{
    @POST
    @Path("/users")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    void createUser(User user);

    @GET
    @Path("/users")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    Collection<User> getUsers();


    @POST
    @Path("/users/login")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    LoginResponse login(LoginRequest loginRequest);
}

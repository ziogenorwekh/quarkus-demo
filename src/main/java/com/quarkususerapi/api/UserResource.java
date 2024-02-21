package com.quarkususerapi.api;

import com.quarkususerapi.dto.UserDTO;
import com.quarkususerapi.service.UserService;
import com.quarkususerapi.vo.UserRequest;
import com.quarkususerapi.vo.UserResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.hibernate.service.spi.InjectService;
import org.jboss.resteasy.reactive.RestPath;

@Path("/users")
public class UserResource {
    private final UserService userService;
    @Inject
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveUser(UserRequest userRequest) {
        userService.save(userRequest);
        return Response.status(HttpResponseStatus.CREATED.code()).build();
    }


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findUser(@PathParam("id") Long id) {
        UserDTO user = userService.findUser(id);
        UserResponse userResponse = new UserResponse(user);
        return Response.ok(userResponse).build();
    }
}

package com.javacodegeeks.rest.jersey.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.javacodegeeks.data.model.Post;


@Path("/data")
public class RestServer {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Post getPostRecord(){
		//create a student object and set some data
		Post post = new Post();
		post.setUserId("123");
		post.setTimestamp("timestamp");
		post.setPostId(12345);
		post.setParentId(34566);
		post.setLikecount(46677);
		return post;
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postRecord(Post post){
		String result = "Record entered: "+ post;
		return Response.status(201).entity(result).build();
	}
}

package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.TraineeService;

@Path("/classroom")
public class ClassroomEndpoint {
	
	@Inject
	private TraineeService service;
	
	@Path("/json/{id}")
	@GET
	@Produces({ "application/json" })
	public String getTraineesWithClasroomID(@PathParam("id") int classroomID) {
		return service.getTraineesWithClassroomID(classroomID);
	}
	
	@Path("/json")
	@PUT
	@Produces({ "application/json" })
	public String addTrainee(String trainee) {
		return service.addTrainee(trainee);
	}
	
	@Path("/json/{id}")
	@POST
	@Produces({ "application/json" })
	public String amendTrainee(@PathParam("id") Long id, String trainee) {
		return service.amendTrainee(id, trainee);
	}
	
	@Path("/json/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String removeTrainee(@PathParam("id") Long id) {
		return service.removeTrainee(id);
	}
	
	public void setService(TraineeService service) {
		this.service = service;
	}
	
}

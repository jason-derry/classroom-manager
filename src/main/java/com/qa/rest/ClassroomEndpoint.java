package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.ClassroomService;
import com.qa.business.service.TraineeService;

@Path("/classroom")
public class ClassroomEndpoint {
	
	@Inject
	private TraineeService tService;
	
	@Inject
	private ClassroomService cService;
	
	@Path("/all")
	@GET
	@Produces({ "application/json" })
	public String getAllClassrooms() {
		return cService.getAllClassrooms();
	}
	
	@Path("/json/{id}")
	@GET
	@Produces({ "application/json" })
	public String getTraineesWithClassroomID(@PathParam("id") int classroomID) {
		return tService.getTraineesWithClassroomID(classroomID);
	}
	
	@Path("/json")
	@PUT
	@Produces({ "application/json" })
	public String addTrainee(String trainee) {
		return tService.addTrainee(trainee);
	}
	
	@Path("/json/{id}")
	@POST
	@Produces({ "application/json" })
	public String amendTrainee(@PathParam("id") Long id, String trainee) {
		return tService.amendTrainee(id, trainee);
	}
	
	@Path("/json/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String removeTrainee(@PathParam("id") Long id) {
		return tService.removeTrainee(id);
	}
	
	public void setService(TraineeService service) {
		this.tService = service;
	}
	
}

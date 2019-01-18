package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.TraineeService;

@Path("/account")
public class TraineeEndpoint {
	
	@Inject
	private TraineeService service;
	
	@Path("/json/{id}")
	@GET
	@Produces({ "application/json" })
	public String getTraineesWithClasroomID(@PathParam("id") int classroomID) {
		return service.getTraineesWithClassroomID(classroomID);
	}

	public void setService(TraineeService service) {
		this.service = service;
	}
	
}

package com.qa.business.service;

public interface TraineeService {
	
	String getTraineesWithClassroomID(int classroomID);

	String addTrainee(String trainee);
	
	String amendTrainee(Long id, String trainee);

	String removeTrainee(Long id);

}

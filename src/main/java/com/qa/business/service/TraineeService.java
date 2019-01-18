package com.qa.business.service;

public interface TraineeService {
	
	String getTraineesWithClassromID(String classroomID);

	String addTrainee(String trainee);
	
	String amendTrainee(Long id, String trainee);

	String removeTrainee(Long id);

}
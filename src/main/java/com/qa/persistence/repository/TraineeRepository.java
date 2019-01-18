package com.qa.persistence.repository;

public interface TraineeRepository {
	
	String getTraineesWithClassroomID(String classroomID);

	String addTrainee(String trainee);
	
	String amendTrainee(Long id, String trainee);

	String removeTrainee(Long id);

}

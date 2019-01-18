package com.qa.persistence.repository;

public interface TraineeRepository {
	
	String getTraineesWithClassromID(String classroomID);

	String addTrainee(String trainee);
	
	String amendTrainee(Long id, String trainee);

	String deleteAccount(Long id);

}

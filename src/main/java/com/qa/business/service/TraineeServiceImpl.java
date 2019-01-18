package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.TraineeRepository;

public class TraineeServiceImpl implements TraineeService {
	
	@Inject
	private TraineeRepository repo;

	@Override
	public String getTraineesWithClassromID(String classroomID) {
		return repo.getTraineesWithClassromID(classroomID);
	}

	@Override
	public String addTrainee(String trainee) {
		return repo.addTrainee(trainee);
	}

	@Override
	public String amendTrainee(Long id, String trainee) {
		return repo.amendTrainee(id, trainee);
	}

	@Override
	public String removeTrainee(Long id) {
		return repo.removeTrainee(id);
	}
	
	public void setRepo(TraineeRepository repo) {
		this.repo = repo;
	}

}

package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService {
	
	@Inject
	private ClassroomRepository repo;

	@Override
	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}
	
	public void setRepo(ClassroomRepository repo) {
		this.repo = repo;
	}

}

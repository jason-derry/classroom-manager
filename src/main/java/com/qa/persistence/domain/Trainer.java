package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainer {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String classroomID;
	private String fullName;
	private List<Trainee> traineeList;
	
	public Trainer() {
		
	}
	
	public Trainer(String classroomID, String fullName, List<Trainee> traineeList) {
		this.classroomID = classroomID;
		this.fullName = fullName;
		this.traineeList = traineeList;
	}
	
	public String getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(String classroomID) {
		this.classroomID = classroomID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Trainee> getTraineeList() {
		return traineeList;
	}

	public void setTrainee(List<Trainee> traineeList) {
		this.traineeList = traineeList;
	}

}
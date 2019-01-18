package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String classroomID;
	private String traineeID;
	private String fullName;
	
	public Trainee() {
		
	}
	
	public Trainee(String classroomID, String traineeID, String fullName) {
		this.classroomID = classroomID;
		this.traineeID = traineeID;
		this.fullName = fullName;
	}
	
	public String getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(String classroomID) {
		this.classroomID = classroomID;
	}
	
	public String getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(String traineeID) {
		this.traineeID = traineeID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
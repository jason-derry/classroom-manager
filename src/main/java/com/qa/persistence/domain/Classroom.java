package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private int classroomID;
	private String trainerName;
	@OneToMany(mappedBy="classroom")
    private List<Trainee> trainees;
	
	public Classroom() {
		
	}
	
	public Classroom(int classroomID, String trainerName) {
		this.classroomID = classroomID;
		this.trainerName = trainerName;
	}
	
	public int getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(int classroomID) {
		this.classroomID = classroomID;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
}
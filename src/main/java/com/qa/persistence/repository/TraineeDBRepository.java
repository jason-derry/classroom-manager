package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TraineeDBRepository implements TraineeRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;

	@Override
	public String getTraineesWithClassroomID(int classroomID) {
		Query query = manager.createQuery("Select t FROM Trainee t WHERE t.classroomID = :classroomID");
		query.setParameter("classroomID", classroomID);
		Collection<Trainee> result = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(result);
	}

	@Override
	@Transactional(REQUIRED)
	public String addTrainee(String trainee) {
		Trainee newTrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(newTrainee);
		return "New Trainee: " + newTrainee.getFullName() + " added to classroom: " + newTrainee.getClassroomID();
	}

	@Override
	@Transactional(REQUIRED)
	public String amendTrainee(Long id, String trainee) {
		Trainee traineeInDB = findTrainee(id);
		if (traineeInDB != null) {
			manager.remove(traineeInDB);
		}
		manager.persist(util.getObjectForJSON(trainee, Trainee.class));
		return "Trainee successfully amended.";
	}

	@Override
	@Transactional(REQUIRED)
	public String removeTrainee(Long id) {
		Trainee traineeInDB = findTrainee(id);
		if (traineeInDB != null) {
			manager.remove(traineeInDB);
		}
		return traineeInDB.getFullName() + " successfully removed.";
	}
		
	public Trainee findTrainee(Long id) {
		return manager.find(Trainee.class, id);
	}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}
	
}

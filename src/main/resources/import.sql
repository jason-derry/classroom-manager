INSERT INTO TRAINEE (classroomID, traineeID, fullName) VALUES ('1', '1', 'Joe Bloggs')
INSERT INTO TRAINEE (classroomID, traineeID, fullName) VALUES ('1', '2', 'Jane Bloggs')
INSERT INTO TRAINEE (classroomID, traineeID, fullName) VALUES ('2', '3', 'David Bloggs')
INSERT INTO TRAINEE (classroomID, traineeID, fullName) VALUES ('2', '4', 'Ceri Bloggs')

INSERT INTO CLASSROOM (classroomID, trainerName) VALUES ('1', 'John Gordon')
INSERT INTO CLASSROOM (classroomID, trainerName) VALUES ('2', 'Matt Hunt')

SELECT c.classroomID, c.trainerName, t.traineeID, t.fullName FROM Classroom c JOIN Trainee t ON c.classroomID = t.classroomID
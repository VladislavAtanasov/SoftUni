INSERT INTO WorkHours(Date, Task, Comments, EmployeeID)
	VALUES(GETDATE(), 'Work on design', 'To be interactive', 121),
		  (GETDATE(), 'Work on backend', 'Everything must be secure', 13)

UPDATE WorkHours SET EmployeeID = 15 WHERE Task = 'Work on design'
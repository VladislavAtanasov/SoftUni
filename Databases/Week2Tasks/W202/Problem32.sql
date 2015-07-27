BEGIN TRAN
	DELETE FROM Employees 
	WHERE DepartmentID = 3 AND ManagerID = EmployeeID;
ROLLBACK TRAN

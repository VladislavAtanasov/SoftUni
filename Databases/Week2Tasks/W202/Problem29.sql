CREATE TABLE WorkHours(
	Id INT IDENTITY,
	Date DateTime,
	Task NVARCHAR(30),
	Comments NVARCHAR(50) NULL,
	EmployeeId INT,
	CONSTRAINT PK_WorkHours PRIMARY KEY(Id),
	CONSTRAINT FK_Employees_WorkHours FOREIGN KEY(EmployeeID) 
	REFERENCES Employees(EmployeeID)
	)
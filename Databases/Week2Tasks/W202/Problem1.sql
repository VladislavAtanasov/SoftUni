SELECT FirstName, LastName, Salary
FROM Employees
WHERE Salary = 
	(SELECT MIN(SALARY) FROM Employees)
SELECT FirstName, LastName, Salary
FROM Employees
WHERE Salary BETWEEN
	(SELECT MIN(SALARY) FROM Employees)
	AND 
	((SELECT MIN(SALARY) FROM Employees) + 
	(10 * (SELECT MIN(SALARY) FROM Employees) / 100))
ORDER BY Salary DESC
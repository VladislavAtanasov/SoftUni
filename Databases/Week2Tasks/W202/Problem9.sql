SELECT DISTINCT d.Name, 
		(SELECT AVG(Salary) FROM Employees
		WHERE DepartmentID = e.DepartmentID
		) AS 'Average Salary'
FROM Employees e
JOIN Departments d
ON e.DepartmentID = d.DepartmentID

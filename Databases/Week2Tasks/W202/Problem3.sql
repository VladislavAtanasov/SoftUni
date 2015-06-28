SELECT e.FirstName, 
	   e.LastName AS 'Full Name',
	   e.Salary,
	   d.Name AS 'DepartmentName'	   
FROM Employees e 
INNER JOIN Departments d
ON e.DepartmentID = d.DepartmentID
WHERE e.Salary = 
	   (SELECT MIN(Salary) FROM Employees
	   WHERE DepartmentID = e.DepartmentID
	   )
ORDER BY e.Salary 
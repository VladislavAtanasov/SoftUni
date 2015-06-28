SELECT AVG(e.Salary) AS 'Average Salary From Sales'
FROM Employees e
JOIN Departments d
ON e.DepartmentID = d.DepartmentID
WHERE d.Name = 'Sales'
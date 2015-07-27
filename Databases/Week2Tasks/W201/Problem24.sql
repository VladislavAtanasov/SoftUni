SELECT e.FirstName, 
	   e.LastName,
	   d.Name AS DepartmentName,
	   e.HireDate
FROM Employees e
INNER JOIN Departments d
ON e.DepartmentID = d.DepartmentID
WHERE e.HireDate BETWEEN '1-Jan-1995' AND '31-Dec-2005' 
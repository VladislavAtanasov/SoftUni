SELECT e.FirstName, e.LastName, m.FirstName AS ManagerName
FROM Employees m
RIGHT OUTER JOIN Employees e
ON e.ManagerID = m.EmployeeID
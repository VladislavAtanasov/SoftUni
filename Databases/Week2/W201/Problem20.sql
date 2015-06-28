SELECT e.FirstName, e.LastName, m.FirstName AS ManagerName FROM Employees e
INNER JOIN Employees m
ON e.ManagerID = m.EmployeeID
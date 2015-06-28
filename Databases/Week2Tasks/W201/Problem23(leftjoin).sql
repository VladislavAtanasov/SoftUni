SELECT e.FirstName, e.LastName, m.FirstName AS ManagerName
FROM Employees e
LEFT OUTER JOIN Employees m
ON e.ManagerID = m.EmployeeID
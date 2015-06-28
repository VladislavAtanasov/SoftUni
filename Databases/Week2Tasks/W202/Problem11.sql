SELECT m.FirstName, m.LastName, COUNT(e.EmployeeID) AS 'Employees Count'
FROM Employees e
JOIN Employees m
ON e.ManagerID = m.EmployeeID
GROUP BY m.FirstName, m.LastName
ORDER BY 'Employees Count' DESC


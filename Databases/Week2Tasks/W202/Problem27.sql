SELECT TOP 1 t.Name, COUNT(e.EmployeeID) AS Numbers 
FROM Employees e
JOIN Addresses a
ON e.AddressID = a.AddressID
JOIN Towns t
ON a.TownID = t.TownID
GROUP BY t.Name
ORDER BY 'Numbers' DESC
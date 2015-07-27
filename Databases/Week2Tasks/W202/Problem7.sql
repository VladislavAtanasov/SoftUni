SELECT COUNT(EmployeeID) AS 'Employees With Manager'
FROM Employees
WHERE ManagerID IS NOT NULL
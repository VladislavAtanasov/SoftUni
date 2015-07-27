SELECT COUNT(EmployeeID) AS 'Employees Without Manager'
FROM Employees
WHERE ManagerID IS NULL
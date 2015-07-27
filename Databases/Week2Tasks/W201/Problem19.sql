SELECT e.FirstName, e.LastName, a.AddressText Address
FROM Employees e
INNER JOIN Addresses a
ON e.AddressID = a.AddressID
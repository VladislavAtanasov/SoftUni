CREATE PROC usp_PeopleWithMoreMoney(@n int) AS
	SELECT p.FirstName + ' ' + p.LastName AS [Full Name],
		   a.Balance
	FROM Persons p
	JOIN Accounts a
	ON a.PersonID = p.Id
	WHERE a.Balance > @n
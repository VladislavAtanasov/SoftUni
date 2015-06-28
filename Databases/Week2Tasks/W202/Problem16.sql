CREATE VIEW [Users Today] AS
	SELECT FullName FROM Users
	WHERE LastTimeLogin = '28-Jun-2015'
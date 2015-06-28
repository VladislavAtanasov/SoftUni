INSERT INTO Users(Username, Password, FullName, LastTimeLogin, GroupID)
		(SELECT LOWER(FirstName + ' ' + LastName), FirstName + LastName + 'passw',
		FirstName + LastName,
		NULL,
		NULL
		FROM Employees)
		
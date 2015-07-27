CREATE TABLE Users(
	Id INT IDENTITY,
	Username nvarchar(20) NOT NULL,
	Password nvarchar(40) NOT NULL,
	FullName nvarchar(40) NOT NULL,
	LastTimeLogin DateTime NULL,
	CONSTRAINT PK_Users PRIMARY KEY(Id),
	CONSTRAINT Password CHECK (LEN(Password) > 5),
	CONSTRAINT AK_Username UNIQUE (Username)
	)
ALTER TABLE Users
	ADD GroupID INT
ALTER TABLE Users
	ADD CONSTRAINT FK_Users_Groups 
	FOREIGN KEY(GroupID) REFERENCES Groups(Id)
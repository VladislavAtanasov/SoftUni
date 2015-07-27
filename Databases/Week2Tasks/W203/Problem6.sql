ALTER TRIGGER tr_MakeLog ON Accounts FOR UPDATE AS

		BEGIN
			INSERT INTO Logs(AccountID, OldSum, Newsum)
			SELECT del.Id, del.Balance, ins.Balance
			FROM Accounts a
			JOIN deleted del ON a.Id = del.Id
			JOIN inserted ins ON a.Id = ins.Id
		END
GO
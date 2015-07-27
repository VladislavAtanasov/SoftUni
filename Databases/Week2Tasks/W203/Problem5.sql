CREATE PROC usp_WithdrawMoney(@AccountId int, @mon money) AS
	DECLARE @balance money;
	SET @balance = (SELECT Balance FROM Accounts WHERE PersonID = @AccountId);
	SET @balance = @balance - @mon;
	UPDATE Accounts SET Balance = @balance WHERE PersonID = @AccountId;
GO

CREATE PROC usp_DepositMoney(@AccountId int, @mon money) AS
	DECLARE @balance money;
	SET @balance = (SELECT Balance FROM Accounts WHERE PersonID = @AccountId);
	SET @balance = @balance + @mon;
	UPDATE Accounts SET Balance = @balance WHERE PersonID = @AccountId;
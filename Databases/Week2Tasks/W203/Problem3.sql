CREATE FUNCTION ufnCalculateSum(@sum int, @YIR int, @nm int)
RETURNS money
AS 
BEGIN
	DECLARE @newsum money;
	SET @newsum = @sum*@YIR*@nm;
	RETURN @newsum;
END;
GO

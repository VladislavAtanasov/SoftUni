CREATE PROC usp_StringLetters(
  @setOfLetters nvarchar(MAX) = '')
AS
DECLARE @tempTable TABLE(StringChecked nvarchar(35))
DECLARE @resultsTable TABLE(Match nvarchar(35))
DECLARE @currentRecord nvarchar(10),
@outerCount int = 0
INSERT INTO @tempTable
  SELECT FirstName
  FROM Employees
  UNION ALL
  SELECT LastName
  FROM Employees
  UNION All
  SELECT Name
  FROM Towns
DECLARE cursorName CURSOR
LOCAL SCROLL STATIC
FOR
SELECT StringChecked FROM @tempTable
OPEN cursorName
FETCH NEXT FROM cursorName
        INTO @currentRecord
WHILE @@FETCH_STATUS = 0
BEGIN
   FETCH NEXT FROM cursorName
   INTO @currentRecord
   SET @outerCount = LEN(@currentRecord)
   DECLARE @areDifferent int = 0
   WHILE (@outerCount > 0)
   BEGIN
      IF (CHARINDEX(SUBSTRING(@currentRecord, @outerCount, 1), @setOfLetters) = 0)
      BEGIN
             SET @areDifferent = 1  
      END
      SET @outerCount = @outerCount - 1
   END
   IF (@areDifferent = 0)
   INSERT INTO @resultsTable VALUES(@currentRecord)
END
CLOSE cursorName
DEALLOCATE cursorName
SELECT * FROM @resultsTable
GO
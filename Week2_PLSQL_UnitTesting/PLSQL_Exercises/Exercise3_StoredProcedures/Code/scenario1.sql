CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR rec IN (
    SELECT AccountID, Balance
    FROM Accounts
    WHERE AccountType = 'Savings'
  ) LOOP
    UPDATE Accounts
    SET Balance = Balance + (rec.Balance * 0.01)
    WHERE AccountID = rec.AccountID;

    DBMS_OUTPUT.PUT_LINE('Added 1% interest to AccountID: ' || rec.AccountID);
  END LOOP;

  COMMIT;
END;
/

BEGIN
  ProcessMonthlyInterest;
END;
/

BEGIN
  FOR rec IN (
    SELECT LoanID, InterestRate, l.CustomerID, DOB
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
  ) LOOP
    IF MONTHS_BETWEEN(SYSDATE, rec.DOB)/12 > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE LoanID = rec.LoanID;

      DBMS_OUTPUT.PUT_LINE('Discount applied to CustomerID: ' || rec.CustomerID || ', LoanID: ' || rec.LoanID);
    END IF;
  END LOOP;
  COMMIT;
END;
/

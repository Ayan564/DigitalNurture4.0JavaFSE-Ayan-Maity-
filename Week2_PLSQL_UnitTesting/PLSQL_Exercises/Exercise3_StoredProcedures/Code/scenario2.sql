CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  p_dept IN VARCHAR2,
  p_bonus_percent IN NUMBER
) IS
BEGIN
  FOR rec IN (
    SELECT EmployeeID, Salary
    FROM Employees
    WHERE Department = p_dept
  ) LOOP
    UPDATE Employees
    SET Salary = Salary + (rec.Salary * p_bonus_percent / 100)
    WHERE EmployeeID = rec.EmployeeID;

    DBMS_OUTPUT.PUT_LINE('Added ' || p_bonus_percent || '% bonus to EmployeeID: ' || rec.EmployeeID);
  END LOOP;

  COMMIT;
END;
/

BEGIN
  UpdateEmployeeBonus('IT', 10);
END;
/

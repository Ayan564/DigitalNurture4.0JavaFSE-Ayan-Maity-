CREATE OR REPLACE PROCEDURE TransferFunds(
  p_from_acc IN NUMBER,
  p_to_acc IN NUMBER,
  p_amount IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  -- Check source account balance
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = p_from_acc
  FOR UPDATE;

  IF v_balance < p_amount THEN
    DBMS_OUTPUT.PUT_LINE('Insufficient funds in AccountID ' || p_from_acc);
    RETURN;
  END IF;

  -- Perform transfer
  UPDATE Accounts
  SET Balance = Balance - p_amount
  WHERE AccountID = p_from_acc;

  UPDATE Accounts
  SET Balance = Balance + p_amount
  WHERE AccountID = p_to_acc;

  COMMIT;

  DBMS_OUTPUT.PUT_LINE('Transferred ₹' || p_amount || ' from AccountID ' || p_from_acc || ' to ' || p_to_acc);
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('One of the accounts does not exist.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/

BEGIN
  TransferFunds(102, 105, 2000); -- Transfer ₹2000 from 102 to 105
END;
/

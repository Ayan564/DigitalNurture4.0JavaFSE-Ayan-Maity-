import { useState } from "react";

function CurrencyConvertor() {
  const [inr, setInr] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = () => {
    const result = parseFloat(inr) / 90;
    if (!isNaN(result)) {
      setEuro(result.toFixed(2));
    }
  };

  return (
    <div style={{ marginTop: "20px" }}>
      <h3>Currency Converter (INR → Euro)</h3>
      <input
        type="number"
        placeholder="Enter INR"
        value={inr}
        onChange={(e) => setInr(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      <p>€ {euro}</p>
    </div>
  );
}

export default CurrencyConvertor;

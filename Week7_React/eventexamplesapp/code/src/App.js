import { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  const sayHello = () => alert("Hello! This is a static message.");
  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const decrement = () => setCount(count - 1);

  const sayWelcome = (msg) => alert(msg);

  const handleClick = (event) => {
    alert("I was clicked!");
  };

  return (
    <div>
      <h1>Event Handling in React</h1>
      <p>Counter: {count}</p>

      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>

      <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>
      <button onClick={handleClick}>Synthetic Event</button>

      <CurrencyConvertor />
    </div>
  );
}

export default App;

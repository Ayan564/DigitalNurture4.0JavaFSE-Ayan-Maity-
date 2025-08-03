import { useState } from "react";
import Guest from "./Guest";
import User from "./User";

function App() {
  const [loggedIn, setLoggedIn] = useState(false);

  return (
    <div>
      <h1>Ticket Booking App</h1>
      <button onClick={() => setLoggedIn(true)}>Login</button>
      <button onClick={() => setLoggedIn(false)}>Logout</button>

      {loggedIn ? <User /> : <Guest />}
    </div>
  );
}

export default App;

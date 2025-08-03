function App() {
  const officeList = [
    { name: "SpaceOne", rent: 55000, address: "Mumbai" },
    { name: "SpaceTwo", rent: 65000, address: "Delhi" },
    { name: "SpaceThree", rent: 50000, address: "Pune" },
  ];

  return (
    <div>
      <h1>Office Space Rental</h1>
      {officeList.map((o, i) => (
        <div key={i}>
          <h3>{o.name}</h3>
          <p style={{ color: o.rent < 60000 ? "red" : "green" }}>
            Rent: ₹{o.rent}
          </p>
          <p>Address: {o.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;

function ListofPlayers() {
  const players = [
    { name: "Virat", score: 85 },
    { name: "Rohit", score: 45 },
    { name: "Rahul", score: 77 },
    { name: "Jadeja", score: 65 },
    { name: "Bumrah", score: 92 },
    { name: "Gill", score: 59 },
    { name: "Kohli", score: 99 },
    { name: "Hardik", score: 55 },
    { name: "Pant", score: 48 },
    { name: "Ashwin", score: 75 },
    { name: "Shami", score: 68 },
  ];

  const highScorers = players.filter((p) => p.score >= 70);

  return (
    <div>
      <h2>Players with score ≥ 70</h2>
      <ul>
        {highScorers.map((p, idx) => (
          <li key={idx}>
            {p.name}: {p.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;

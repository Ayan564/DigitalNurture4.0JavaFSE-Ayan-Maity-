function IndianPlayers() {
  const t20 = ["Virat", "Rohit", "Surya"];
  const ranji = ["Rahane", "Pujara"];
  const allPlayers = [...t20, ...ranji];

  const [oddTeam, evenTeam] = [
    allPlayers.filter((_, i) => i % 2 !== 0),
    allPlayers.filter((_, i) => i % 2 === 0),
  ];

  return (
    <div>
      <h2>Even Team</h2>
      <ul>
        {evenTeam.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
      <h2>Odd Team</h2>
      <ul>
        {oddTeam.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;

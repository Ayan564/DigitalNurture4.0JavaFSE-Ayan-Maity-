import "../Stylesheets/mystyle.css";

function CalculateScore(props) {
  const average = props.total / props.goal;

  return (
    <div className="score-box">
      <h2>{props.name}</h2>
      <p>School: {props.school}</p>
      <p>Average Score: {average}</p>
    </div>
  );
}

export default CalculateScore;

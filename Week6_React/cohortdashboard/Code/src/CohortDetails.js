import styles from './CohortDetails.module.css';

function CohortDetails({ name, status }) {
  const color = status === 'ongoing' ? 'green' : 'blue';

  return (
    <div className={styles.box}>
      <h3 style={{ color }}>{name}</h3>
      <p>Status: {status}</p>
    </div>
  );
}

export default CohortDetails;
import './Carros.css';

function Carros(props) {
    let carros = props.carros
  return (
    <div className='carros-container'>
      <h2>{props.carros.id}</h2>
      <h2>{props.carros.modelo}</h2>
      <h2>{props.carros.ano}</h2>
      <h2>{props.carros.genero}</h2>
    </div>
  )
}

export default Carros

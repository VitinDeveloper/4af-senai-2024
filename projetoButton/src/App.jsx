import { useState } from 'react';
import './App.css'

function App() {
  const [contador, setContador] = useState(0);
  let cont = 0;

  function tratarClique() {
    cont++;
    alert('Cont:' + cont)
  }

  function incrementarState() {
    setContador(contador + 1)
  }

  return (
    <>
      <h1>Teste de Button</h1>
      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Architecto voluptates necessitatibus deserunt, quas adipisci quos numquam accusamus veritatis pariatur accusantium assumenda autem incidunt recusandae reprehenderit, quaerat esse commodi voluptatibus odit.</p>
      <button onClick={tratarClique}>Clique</button>
      <div>
        {cont}
      </div>
      <button onClick={incrementarState}>Incrementar State</button>
      <div>
        {contador}
      </div>
    </>
  )
}

export default App

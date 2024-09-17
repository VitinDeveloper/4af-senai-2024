import { useContext } from 'react'
import Navbar from '../components/Navbar'
import { GlobalConext } from '../contexts/GlobalConext'

function Home() {
  const { usuarioLogado, usuarios, setUsuarios } = useContext(GlobalConext)

  function adicionarUsuario() {
    let usuarioNovo = {
      id: Date.now(),
      nome: "Capitão Patria",
      email: "caps@email.com"
    }
    setUsuarios([...usuarios, usuarioNovo])
  }
  return (
    <div>
      <Navbar />
      <h1>Home</h1>
      <p>Olá {usuarioLogado}</p>
      <div>
        {
          usuarios.map((usuario) => (
            <div key={usuario.id}>
              <p>Nome: {usuario.nome}</p>
              <p>Email: {usuario.email}</p>
              <p>{usuario.id}</p>
            </div>
          ))
        }
      </div>
      <div>
        <button onClick={adicionarUsuario}>Adicionar usúario</button>
      </div>
      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ullam illo perspiciatis non sunt voluptatibus minima atque eius numquam facilis quam reprehenderit reiciendis a commodi cum natus autem, illum velit pariatur.</p>
    </div>
  )
}

export default Home

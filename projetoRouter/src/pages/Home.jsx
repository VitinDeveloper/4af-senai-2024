import { useContext } from 'react'
import Navbar from '../components/Navbar'
import { GlobalConext } from '../contexts/GlobalConext'

function Home() {
  const { usuarioLogado } = useContext(GlobalConext)
  return (
    <div>
      <Navbar />
      <h1>Home</h1>
      <p>Olá {usuarioLogado}</p>
      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ullam illo perspiciatis non sunt voluptatibus minima atque eius numquam facilis quam reprehenderit reiciendis a commodi cum natus autem, illum velit pariatur.</p>
    </div>
  )
}

export default Home

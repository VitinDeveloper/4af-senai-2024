import React from 'react'
import './Navbar.css'
import { Link } from 'react-router-dom'

function Navbar() {
  return (
    <div>
      <nav className='navbar'>
      <Link to="/">Home</Link>
      <Link to="/musicas">Músicas</Link>
      <Link to="/filmes">Filmes</Link>
      <Link to="/seriados">Seriados</Link>
    </nav>
    </div>
  )
}

export default Navbar

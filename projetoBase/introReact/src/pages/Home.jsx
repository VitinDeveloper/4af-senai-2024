import React from 'react'
import NavBar from '../components/NavBar'
import Conteudo from '../components/Conteudo'
import './Home.css'

function Home() {
  return (
    <div className='home-container'>
      <NavBar />
      <Conteudo />
    </div>
  )
}

export default Home

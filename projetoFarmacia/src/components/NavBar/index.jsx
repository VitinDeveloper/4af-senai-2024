import React from 'react'
import './index.css'

function NavBar() {
  return (
    <div className='navbar-container'>

      <div className='navbar-logo'>
        <img className='logopequena-navbar' src="./images/farmacia-logo-pq.png" alt="Logo pequena da farmácia" />
        <h1 className='farmacia-title'>Farmárcia</h1>
      </div>

      <div className='navbar-user'>
        <button className=''>Quero Ir</button>
      </div>

    </div>
  )
}

export default NavBar

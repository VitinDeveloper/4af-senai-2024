import React from 'react'
import './index.css'
import Logo from '../Logo/index'
import Title from '../Title/index'


function NavBar() {
  return (
    <div className='navbar-container'>

      <div className='navbar-left'>
        <Logo/>
        <Title/>
      </div>

      <div className='navbar-right'>
        
      </div>

    </div>
  )
}

export default NavBar

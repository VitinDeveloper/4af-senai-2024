import React from 'react'
import './Conteudo.css'
import { Duck } from './Duck'

function Conteudo() {
  return (
    <div className='conteudo-container'>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iusto fuga alias expedita repudiandae ipsam maxime suscipit impedit culpa tempora vero, iure laboriosam consequuntur iste numquam fugiat? Laborum quam dicta voluptatum!
      </p>
      <img className='imagem-conteudo' src='./images/kenyekawai.gif' alt='imagem do kenye west kawai em gif'/>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iusto fuga alias expedita repudiandae ipsam maxime suscipit impedit culpa tempora vero, iure laboriosam consequuntur iste numquam fugiat? Laborum quam dicta voluptatum!
      </p>
      <Duck />
    </div>
  )
}

export default Conteudo

import React from 'react'
import './index.css'
import Button from '../Button/index'

function Main() {
  return (
    <div className='main-container'>
      <div className='main-left'>
        <div className='main-titles-left'>
          <h1 className='main-title-left-top'>Nova Direção, Novos Cuidados: Sua Saúde em Boas Mãos!</h1>
          <p className='main-title-left'>É com grande satisfação que anunciamos a nova direção da nossa farmácia, trazendo um compromisso renovado com o seu bem-estar. Sob a nova liderança, estamos empenhados em oferecer um atendimento ainda mais personalizado, produtos de qualidade e serviços que fazem a diferença no seu dia a dia. Venha nos visitar e descubra como estamos prontos para cuidar de você e da sua família com toda a dedicação que você merece. Sua saúde é a nossa prioridade!</p>
        </div>
        <div className='main-image-left'>
          <img className='main-image' src="./images/farmacia-placa.png" alt="" />
        </div>
      </div>
      <div className='main-right'>
        <div className='main-titles'>
          <p className='main-title'>Inauguração Imperdível! Descontos Especiais</p>
          <p className='main-title'>e Brindes Exclusivos Esperam por Você na Nossa Nova Farmácia!</p>
        </div>
        <img className='main-image' src="./images/farmacia.png" alt="Imagem de duas mãos segurando um coração flutuante, e na parte de baixo escrito Farmárcia bem grande e como sub-title escrito Sob Nova Direção (Ex Farmário)" />
        <Button/>
      </div>
    </div>
  )
}

export default Main

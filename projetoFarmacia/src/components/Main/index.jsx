import React, { useState } from 'react'
import './index.css'
import Button from '../Button'
import ControllerPassword from '../ControllerPassword'

function Main() {
  const [displayText, setDisplayText] = useState('Espere ser Chamado!');
  const [fila, setFila] = useState([]);

  const atualizarDisplay = (text) => {
    setDisplayText(text);
  };

  const atualizarFila = (novaFila) => {
    setFila(novaFila);
  };

  const formatarFila = () => {
    if (fila.length === 0) {
      return <div className='main-fila-vazia'>A fila está vazia!</div>;
    }
    return fila.map((senha, index) => (
      <div key={index}>{`${senha.tipo} ${senha.numero}`}</div>
    ));
  };

  function queroParticipar() {
    alert("Quero Participar")
  }
  return (
    <div className='main-container'>
      <div className='main-left'>
        <div className='main-top-left'>
          <div className='main-titles-left'>
            <h1 className='main-title-left-top'>Nova Direção, Novos Cuidados: Sua Saúde em Boas Mãos!</h1>
            <p className='main-title-left-bottom'>É com grande satisfação que anunciamos a nova direção da nossa farmácia, trazendo um compromisso renovado com o seu bem-estar. Sob a nova liderança, estamos empenhados em oferecer um atendimento ainda mais personalizado, produtos de qualidade e serviços que fazem a diferença no seu dia a dia. Venha nos visitar e descubra como estamos prontos para cuidar de você e da sua família com toda a dedicação que você merece. Sua saúde é a nossa prioridade!</p>
          </div>
        </div>
        <div className='main-bottom-left'>
          <div className='main-bottom-display-left'>
            <div className='main-bottom-left-display-top'>
              <h1 className='main-display'>
                {displayText}
              </h1>
            </div>
            <div className='main-bottom-left-display-bottom'>
              <h1 className='main-display-list'>
                {formatarFila()}
              </h1>
            </div>
          </div>
          <div className='main-bottom-left-button'>
            <ControllerPassword atualizarDisplay={atualizarDisplay} atualizarFila={atualizarFila} />
          </div>
        </div>
      </div>
      <div className='main-right'>
        <div className='main-titles'>
          <p className='main-title'>Inauguração Imperdível! Descontos Especiais</p>
          <p className='main-title'>e Brindes Exclusivos Esperam por Você na Nossa Nova Farmácia!</p>
        </div>
        <img className='main-image' src="./images/farmacia.png" alt="Imagem de duas mãos segurando um coração flutuante, e na parte de baixo escrito Farmárcia bem grande e como sub-title escrito Sob Nova Direção (Ex Farmário)" />
        <Button text="Quero Participar" className="primary" onClick={queroParticipar} />
      </div>
    </div>
  )
}

export default Main

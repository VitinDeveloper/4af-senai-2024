import React from 'react'
import './index.css'

function Button({text, onClick, className}) {
  return (
    <div>
      <button className={`button ${className}`} onClick={onClick}>{text}</button>
    </div>
  )
}

export default Button

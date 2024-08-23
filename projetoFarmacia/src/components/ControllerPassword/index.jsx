import React, { useState, useEffect } from 'react'
import './index.css'
import Button from '../Button/index'

function ControllerPassword({ atualizarDisplay, atualizarFila }) {
    const [fila, setFila] = useState([]);

    const adicionarSenha = (tipo) => {
        const numero = fila.length + 1;
        const novaSenha = { tipo, numero };
        const novaFila = [...fila, novaSenha];
        setFila(novaFila);
    };

    const chamarButton = () => {
        if (fila.length === 0) {
            atualizarDisplay('Espere ser Chamado!');
            return;
        }

        let senhaChamada = null;
        const preferencial = fila.find(senha => senha.tipo === 'Preferencial');
        if (preferencial) {
            senhaChamada = preferencial;
            setFila(fila.filter(senha => senha !== preferencial));
        } else {
            const normal = fila.find(senha => senha.tipo === 'Normal');
            if (normal) {
                senhaChamada = normal;
                setFila(fila.filter(senha => senha !== normal));
            }
        }

        if (senhaChamada) {
            atualizarDisplay(`${senhaChamada.tipo}: ${senhaChamada.numero}`);
        }
    };

    useEffect(() => {
        atualizarFila(fila);
    }, [fila]);

    return (
        <div className='controller-password-container'>
            <Button text="Normal" className="secondary" onClick={() => adicionarSenha('Normal')} />
            <Button text="Preferencial" className="secondary" onClick={() => adicionarSenha('Preferencial')} />
            <Button text="Chamar" className="secondary" onClick={chamarButton} />
        </div>
    )
}

export default ControllerPassword

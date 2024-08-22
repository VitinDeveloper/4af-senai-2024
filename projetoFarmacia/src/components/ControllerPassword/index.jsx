import React, {useState} from 'react'
import './index.css'
import Button from '../Button/index'

function ControllerPassword({ atualizarDisplay }) {
    const [fila, setFila] = useState([]);

    const adicionarSenha = (tipo) => {
        const numero = fila.length + 1;
        const novaSenha = { tipo, numero };
        setFila([...fila, novaSenha]);
    };

    const chamarButton = () => {
        if (fila.length === 0) {
            atualizarDisplay('A fila está vazia!');
            return;
        }

        const preferencial = fila.find(senha => senha.tipo === 'Preferencial');
        if (preferencial) {
            setFila(fila.filter(senha => senha !== preferencial));
            atualizarDisplay(`${preferencial.tipo}: ${preferencial.numero}`);
            return;
        }

        const normal = fila.find(senha => senha.tipo === 'Normal');
        if (normal) {
            setFila(fila.filter(senha => senha !== normal));
            atualizarDisplay(`${normal.tipo}: ${normal.numero}`);
        }
    };
    return (
        <div className='controller-password-container'>
            <Button text="Normal" className="secondary" onClick={() => adicionarSenha('Normal')} />
            <Button text="Preferencial" className="secondary" onClick={() => adicionarSenha('Preferencial')} />
            <Button text="Chamar" className="secondary" onClick={chamarButton} />
        </div>
    )
}

export default ControllerPassword

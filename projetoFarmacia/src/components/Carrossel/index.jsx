import React, { useState, useEffect } from 'react';
import './index.css';

function Carrossel({ images }) {
    const [carrossel, setCarrossel] = useState(0);

    const proximoImage = () => {
        setCarrossel((anteriorImage) => (anteriorImage + 1) % images.length);
    };

    useEffect(() => {
        const intervalo = setInterval(proximoImage, 3000);

        return () => clearInterval(intervalo);
    }, [carrossel, images.length]);

    return (
        <div className='carrossel'>
            <img src={images[carrossel]} alt='' className='carrossel-image' />
        </div>
    );
}

export default Carrossel;
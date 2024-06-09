import React, { useState } from 'react';



export const Ejercicio4 = () => {
    const [color, setColor] = useState('#000000');
    const [intervalo, setIntervalo] = useState(0);

    const mouseOver = () => {
        const changeColor = () => {
            let r = Math.floor(Math.random() * 256).toString(16);
            r = r.length === 1 ? '0' + r : r;
            let g = Math.floor(Math.random() * 256).toString(16);
            g = g.length === 1 ? '0' + g : g;
            let b = Math.floor(Math.random() * 256).toString(16);
            b = b.length === 1 ? '0' + b : b;
            return setColor('#' + r + g + b)
        
        };        
        return setIntervalo(setInterval(changeColor, 300));
    };
    
    const stop = () => {
        return clearInterval(intervalo);
    };
    
    const clickDouble = () => {
        return clearInterval(intervalo);
    };

    return (
        <div id="square" onMouseOver={mouseOver} onMouseLeave={stop} onDoubleClick={clickDouble} style={{ width: '255px', height: '255px', backgroundColor: color, margin: 'auto' }}>
            {setColor}
        </div>
        );
    }
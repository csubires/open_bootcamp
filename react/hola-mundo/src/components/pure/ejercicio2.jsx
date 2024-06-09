import React, { useState, useEffect } from 'react';

export const Ejercicio2 = () => {
    const defaultState = {
        fecha: new Date(),
        edad: 0,
        nombre: 'Pepito',
        apellidos: 'Perez',
    };

    const [user, setUser] = useState(defaultState);

    useEffect(() => {
        const intervalAge = setInterval(() => {
            update();
        }, 1000);
        return () => {
            clearInterval(intervalAge);
        };
    });

    const update = () => {
        return setUser({
            fecha: user.fecha,
            edad: user.edad + 1,
            nombre: user.nombre,
            apellidos: user.apellidos,
            });
        };

    return (
        <div><h2>Hora Actual: {user.fecha.toLocaleTimeString()}</h2>
        <h3>{user.nombre} {user.apellidos}</h3>
        <h1>Edad: {user.edad}</h1>
        </div>
    );
};

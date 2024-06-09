import React from 'react';
import { Contacto } from "../../models/contacto.class"


export const showComponent = () => {

    const contacto = new Contacto('Pepe', 'Perez', 'pepe@perez.com', false);

    return (
        <div>
            Adios
            <rederContact contacto={contacto}></rederContact>
        </div>
    );

}
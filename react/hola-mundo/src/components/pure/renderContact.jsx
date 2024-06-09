import React from 'react';
import { Contacto } from "../../models/contacto.class"
import PropTypes from 'prop-types';


export const RenderContact = ({contacto, cambiar, eliminar}) => {
    return (
        <tr>
            <td>{contacto.nombre}</td>
            <td>{contacto.apellido}</td>
            <td>{contacto.email}</td>
            <td>{contacto.conectado ? 'Contacto En Línea': 'Contacto No Disponible'}</td>

            <td>
                <button style={{ backgroundColor: contacto.conectado ? 'green' : 'red' }} onClick={() => { cambiar(contacto); }}>{contacto.conectado ? 'Conectado' : 'Desconectado'}</button>
                <button className="remove-button" onClick={() => eliminar(contacto)}>Eliminar</button>
            </td>
        </tr>
    );

}

RenderContact.propTypes = {
    contacto: PropTypes.instanceOf(Contacto).isRequired,
    cambiar: PropTypes.func.isRequired,
    eliminar: PropTypes.func.isRequired,
};
import React, { useState } from 'react';
import { RenderContact } from './renderContact';
import { AddForm } from './forms/formAdd'

export const Ejercicio3 = () => {
    const defaultContact = [
        { nombre: 'pepe', apellido: 'perez', email: 'pepeperez@email.com', conectado: true },
        { nombre: 'sergio', apellido: 'lokesea', email: 'sergiolokesea@email.com', conectado: false },
    ];

    const [listaContactos, setlistaContactos] = useState(defaultContact);

    function cambiar(contacto) {
        const index = listaContactos.indexOf(contacto);
        const tempContact = [...listaContactos];

        tempContact[index].conectado = !tempContact[index].conectado;
        setlistaContactos(tempContact);
    }

    function eliminar(contacto) {
        const index = listaContactos.indexOf(contacto);
        const tempContact = [...listaContactos];
        tempContact.splice(index, 1);
        setlistaContactos(tempContact);
    }

    function addContact(contacto) {
        const tempContact = [...listaContactos];
        tempContact.push(contacto);
        setlistaContactos(tempContact);
    }

    return (
        <div>
            <table>
                <tr><th>Nombre</th><th>Apellidos</th><th>Email</th><th>Estado</th><th>Opciones</th></tr>
            {listaContactos.map((item, key) => {
                return (<RenderContact key={key} contacto={item} cambiar={cambiar} eliminar={eliminar}></RenderContact>);
            })}
            </table> 

            <AddForm onAddContact={addContact}></AddForm>
        </div>
    );
};

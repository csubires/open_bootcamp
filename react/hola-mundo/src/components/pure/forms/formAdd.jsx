import React, { useRef } from 'react';

export const AddForm = ({ onAddContact }) => {
  const nombre = useRef('');
  const apellido = useRef('');
  const email = useRef('');

  function addContact(e) {
    e.preventDefault();

    const newContact = { 
      nombre: nombre.current.value, 
      email: email.current.value, 
      apellido: apellido.current.value,
      conectado: true 
    };

    onAddContact(newContact);
    nombre.current.value = '';
    apellido.current.value = '';
    email.current.value = '';
  }

  return (
    <form onSubmit={addContact}>
      <label>Nombre</label>
      <input ref={nombre} name="nombre" placeholder="Nombre" />
      <label>Apellido</label>
      <input ref={apellido} name="apellido" placeholder="Apellido" />
      <label>Correo</label>
      <input ref={email} name="email" type="email" placeholder="Email" />
      <button onClick={addContact} type="submit" className="submit-button">Añadir</button>
    </form>
  );
};

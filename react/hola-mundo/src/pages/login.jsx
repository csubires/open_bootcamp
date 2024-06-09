import React, { useEffect, useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { LoginForm } from '../components/pure/forms/loginForm';

export const Login = () => {
    const [credentials, setCreadentials] = useState(null);
    const navigate = useNavigate();
    const user = localStorage.getItem('user') || null;

    useEffect(() => {
        if (user) {
        navigate('/opciones');
        }
    });
    useEffect(() => {
        if (credentials) {
        const c = JSON.stringify(credentials);
        localStorage.setItem('user', c);
        navigate('/opciones');
        }
    });

    return (
        <div>
        <LoginForm onSubmit={(e) => setCreadentials(e)} />
        <Link to="/registro">Registrarse</Link>
        </div>
    );
};

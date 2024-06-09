import React, { useEffect, useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import RegisterForm from '../components/pure/forms/registerForm';

export const Register = () => {
    const [credentials, setCredentials] = useState(null);
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
        <RegisterForm onSubmit={(e) => setCredentials(e)} />
        <Link to="/login">Login</Link>
        </div>
    );
};

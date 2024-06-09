import React, { useEffect, useState } from 'react';

import { getChucknorris } from '../../services/axiosService';

import CheckIcon from '@mui/icons-material/Check';
import ClearIcon from '@mui/icons-material/Clear';

import { Card, Button, Avatar } from '@mui/material/';



export const CardContainer = () => {
    const [chiste, setChiste] = useState();
    const [gusta, setGusta] = useState(0);
    const [disgusta, setDisgusta] = useState(0);

    useEffect(() => {});

    const obtainChussnorri = () => {
        getChucknorris()
            .then((response) => {
                setChiste(response.data);
            })
            .catch((error) => {
                alert(`Somethin went wrong: ${error}`);
            })
    }

    const onCount = (setCounter, counter) => {
        setCounter(counter + 1);
        obtainChussnorri();
    };

    return (
        <div
        style={{
            width: '100vw',
            height: '100vh',
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
        }}
        >
        {chiste ? (
            <Card 
            sx={{
                width: 400, height: 400, display: 'flex', flexDirection: 'column', justifyContent: 'center', alignItems: 'center', gap: '10px', padding: '20px', backgroundColor: "beige"
            }}
            variant="outlined"
            >
                <Avatar sx={{ width: 90, height: 90 }} alt="Remy Sharp" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.3hF-UuZD5L_Fw-WjOlFLdwHaHZ%26pid%3DApi&f=1&ipt=8737425a46a331983d935686ffb89abb9662aad8313160eee44d03dfb8147626&ipo=images" />
  
            {chiste.value}
            <div style={{ display: 'flex' }}>
                <div style={{ display: 'flex', flexDirection: 'column', margin: '5px', alignItems: 'center' }}>
                <CheckIcon color="success" onClick={() => onCount(setGusta, gusta)} />
                {gusta}
                </div>
                <div style={{ display: 'flex', flexDirection: 'column', margin: '5px', alignItems: 'center' }}>
                {' '}
                <ClearIcon color="error" onClick={() => onCount(setDisgusta, disgusta)} />
                {disgusta}
                </div>
            </div>
            </Card>
        ) : (
            <Button onClick={obtainChussnorri}>Obtener chiste</Button>
        )}
        </div>
    );
};

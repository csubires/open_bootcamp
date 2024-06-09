import React, { useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import { TaskListComponent } from '../components/container/task_list'

export const Taskdashboard = () => {
    const navigate = useNavigate();

    const user = localStorage.getItem('user') || null;

    useEffect(() => {
        if (!user) {
        navigate('/');
        }
    });

    return (
        <div className="App">
            <header className="App-header">
                <TaskListComponent></TaskListComponent>
            </header>
        </div>
    );
};

import React, { useReducer, useContext } from 'react';
import { Task } from '../../models/task.class'
import TaskComponent from '../pure/task';
import { LEVELS } from '../../models/levels.enum';

// Actions
const FIELD = 'FIELD';
const CREAR = 'CREAR';
const BORRAR  = 'BORRAR ';
const TODO = 'TODO';
const COMPLETAS = 'COMPLETAS';
const INCOMPLETAS = 'INCOMPLETAS';


const myContext = React.createContext(null); 



const Table = () => {
    const state = useContext(myContext);

    function completeTask(task){
        console.log('Complete this Task:', task);
        const index = state.tasks.indexOf(task);
        state.tasks[index].completed = !state.tasks[index].completed;
    }

    function deleteTask(task){
        console.log('Detele this Task:', task);
        const index = state.tasks.indexOf(task);
        state.tasks.splice(index,1);

    }

    return (
        <div>
            <table>
                <thead>
                    <tr>
                        <th scope='col'>Title</th>
                        <th scope='col'>Description</th>
                        <th scope='col'>Priority</th>
                        <th scope='col'>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    { state.tasks.map((task, index) => {
                        return (
                                <TaskComponent 
                                    key={index} 
                                    task={task}
                                    complete={completeTask}
                                    remove = {deleteTask}
                                >
                                </TaskComponent>
                            )
                        }
                    )}
                </tbody>
            </table>
        </div>
    )
}


export const Ejercicio9 = () => {

    const defaultTask1 = new Task('Example1', 'Description1', true, LEVELS.NORMAL);
    const defaultTask2 = new Task('Example2', 'Description 2', false, LEVELS.URGENT);
    const defaultTask3 = new Task('Example3', 'Description 3', false, LEVELS.BLOCKING);
    

    // INITIAL STATE
    const initialState = {
        name: '',
        description: '',
        completed: false,
        level: LEVELS.NORMAL,
        tasks: [defaultTask1, defaultTask2, defaultTask3],
        count: 3
    }
    // Reducer
    const taskReducer = (state, action) => {

        switch (action.type) {
            case CREAR:
                return {
                    ...state,
                    tasks: state.tasks.push(Task(
                        state.name, 
                        state.description,
                        state.completed,
                        state.level
                        )),
                    count: state.count + 1
                }
            case BORRAR:
                return {
                    ...state,
                    error: '',
                    isLoading: true
                }
            case TODO:
                return {
                    ...state,
                    error: '',
                    isLoading: false,
                    isLoggedIn: true
                }
            case COMPLETAS:
                return {
                    ...state,
                    error: 'Invalid nombre or descripcion',
                    isLoading: false,
                    isLoggedIn: false,
                    nombre:'',
                    descripcion:''
                }
            case INCOMPLETAS:
                return {
                    ...state,
                    isLoggedIn: false
                }
            default:
                break;
        }
    }

    const [state, dispatch] = useReducer(taskReducer, initialState);


    // Submit
    const submit = async (e) => {
        e.preventDefault();
        // Dispatch Action:
        dispatch({type:CREAR});
    }


    return (
        <myContext.Provider value={state}>
            <div>
            <Table></Table>

                <form onSubmit={submit}>

                    <input 
                        type='text'
                        placeholder='name'
                        onChange = {(e) => 
                            dispatch({
                                type: FIELD, 
                                fieldName:'name', 
                                payload: e.currentTarget.value
                                })
                        }
                    />

                    <input 
                        type='text'
                        placeholder='description'
                        onChange = {(e) => 
                            dispatch({
                                type: FIELD, 
                                fieldName:'description', 
                                payload: e.currentTarget.value
                                })
                        }
                    />
                    <button type='submit'>CREAR</button>
                </form>
            </div>
        </myContext.Provider>
    );
}

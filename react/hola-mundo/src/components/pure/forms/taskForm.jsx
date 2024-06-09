import React, {useRef} from 'react';
import PropTypes from 'prop-types';
import { LEVELS } from '../../../models/levels.enum';
import { Task } from '../../../models/task.class';

import { Formik, Field, Form } from 'formik';
import * as Yup from 'yup';

const Taskform = ({add, length}) => {

    const taskSchema = Yup.object().shape({
        name: Yup.string()
            .min(2, 'Too Short!')
            .max(50, 'Too Long!')
            .required('Required'),
        description: Yup.string()
            .min(2, 'Too Short!')
            .max(100, 'Too Long!')
            .required('Required'),
    });

    const initialValues = {
        name: '',
        description: '',
        level: LEVELS.URGENT,
        done: false,
    };



    const nameRef = useRef('');
    const descriptionRef = useRef('');
    const levelRef = useRef(LEVELS.NORMAL);

    function addTask(e){
        e.preventDefault();
        const newTask = new Task(
            nameRef.current.value,
            descriptionRef.current.value,
            false,
            levelRef.current.value
        );
        add(newTask);
    }

    function addTaskFormik(task){

        alert(task.name)
        const newTask = new Task(
            task.name,
            task.description,
            false,
            task.level
        );
        add(newTask);
    }

    return (
        <div>
            <h4>Add Task Formik</h4>
            <Formik
                initialValues = {initialValues}
                validationSchema = {taskSchema}

                onSubmit={async (values, actions) => {
                    addTaskFormik(values);
                    actions.resetForm({});
                    actions.setSubmitting(false);
                }}
                >
                {({ errors }) => (
                <Form>
                    <Field name="name" placeholder="Task Name" />
                    {errors && errors.name}
                    <Field name="description" placeholder="Task Description" />
                    {errors && errors.description}

                    <Field as="select" name="level">
                    <option value={LEVELS.NORMAL}>Normal</option>
                    <option value={LEVELS.URGENT}>Urgent</option>
                    <option value={LEVELS.BLOCKING}>Blocking</option>
                    </Field>
                    <button type="submit">Submit</button>
                </Form>
                )}
            </Formik>

            <form onSubmit={addTask}>
                    <label>Nombre</label>
                    <input ref={nameRef} id='inputName' type='text' required autoFocus placeholder='Task Name'/>
                    <label>Descripción</label>
                    <input ref={descriptionRef} id='inputDescription' type='text' required placeholder='Task description'/>
                    <label>Tipo</label>
                    <select ref={levelRef} defaultValue={LEVELS.NORMAL} id='selectLevel'>
                        <option value={LEVELS.NORMAL}>
                            Normal
                        </option>
                        <option value={LEVELS.URGENT}>
                            Urgent
                        </option>
                        <option value={LEVELS.BLOCKING}>
                            Blocking
                        </option>
                    </select>
                    <button type='submit'>
                        {length > 0 ? 'Add New Task' : 'Create your First Task'}
                    </button>
            </form>
        </div>
    );
}

Taskform.protoTypes = {
    add: PropTypes.func.isRequired,
    length: PropTypes.number.isRequired
}

export default Taskform;

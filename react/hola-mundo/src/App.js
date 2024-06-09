import './App.css';
// import { Ejercicio2 } from './components/pure/ejercicio2';
import { Ejercicio3 } from './components/pure/ejercicio3';
import { Ejercicio4 } from './components/pure/ejercicio4';
import { CardContainer } from './components/pure/ejercicio7';
import { TaskListComponent } from './components/container/task_list';

import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Taskdashboard } from './pages/opciones';
import { Login } from './pages/login';
import { Register } from './pages/registro';
import { Ejercicio9 } from './components/pure/ejercicio9';

function App() {
  return (
    <div>
      <h5>Ejercicio9</h5>
      <Ejercicio9></Ejercicio9>
    </div>

    /* <BrowserRouter>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/registro" element={<Register />} />
        <Route path="/opciones" element={<Taskdashboard />} />
      </Routes>
  </BrowserRouter> */
  );
}

export default App;

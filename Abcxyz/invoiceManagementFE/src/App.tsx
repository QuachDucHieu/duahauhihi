import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Home from './components/controls/Home/home';
import Expenses from './components/controls/ExpenseManagement/index';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/expenses" element={<Expenses />} />
      </Routes>
    </BrowserRouter>
  )
}

export default App;

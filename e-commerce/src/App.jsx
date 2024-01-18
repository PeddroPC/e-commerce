import { useEffect, useState } from 'react'
import './App.css'
import Home from './Components/Pages/Home'
import axios from 'axios'
import NavBar from './Components/Navbar/NavBar'

function App() {

  const [dados, setDados] = useState([])

  const addDados = (id, name, image, description, price) => {
    const newDados = [...dados, {
      id,
      name,
      image,
      description,
      price
    },];
    setDados(newDados); 
  }
  const fetchDados = async () => {
    try{
      const response = await axios.get("http://localhost:8080/products/list");
      setDados(response.data)
    } catch (error){
       console.error("Erro", error)
    }
  }
  useEffect(() => {
    fetchDados();
  }, [])

  return (
    <div>
      <NavBar/>
      <Home dados={dados}/>
    </div>
  )
}

export default App

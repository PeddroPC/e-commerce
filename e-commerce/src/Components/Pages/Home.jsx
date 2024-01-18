import React from 'react';
import './Home.css';

const Home = ({dados}) => {
  return (
    <div className='card'>
      {
        dados.map((dado) => (
          <div key={dado.id} className="container">
            <img src={dado.image} alt="Imagem de Comida" />
            <h1>{dado.name}</h1>
            <p>{dado.description}</p>
        </div>
        ))
      }
    </div>
  );
};

export default Home;

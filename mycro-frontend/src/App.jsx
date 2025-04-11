import React, { useState, useEffect } from 'react';
import axios from 'axios';
import ProductList from './components/ProductList';

function App() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/products')
      .then(response => {
        setProducts(response.data);
      })
      .catch(error => console.log(error));
  }, []);

  return (
    <div className="App">
      <h1>Bem-vindo ao MyCroMMerce</h1>
      <ProductList products={products} />
    </div>
  );
}

export default App;

import React, { useEffect, useState } from 'react';
import api from '../api';

const ProductList = () => {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    api.get('/products')
      .then((response) => {
        setProducts(response.data);
      })
      .catch((error) => {
        console.error("Erro ao buscar produtos:", error);
      });
  }, []);

  return (
    <div>
      <h2>Lista de Produtos</h2>
      {products.length > 0 ? (
        <ul>
          {products.map((product) => (
            <li key={product.id}>
              {product.name} - R${product.price}
            </li>
          ))}
        </ul>
      ) : (
        <p>Carregando produtos...</p>
      )}
    </div>
  );
};

export default ProductList;

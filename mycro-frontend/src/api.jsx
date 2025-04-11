import React from 'react';

function ProductList({ products }) {
  return (
    <div>
      {products.length > 0 ? (
        products.map(product => (
          <div key={product.id}>
            <h3>{product.name}</h3>
            <p>{product.description}</p>
            <p>Preço: {product.price}</p>
          </div>
        ))
      ) : (
        <p>Carregando produtos...</p>
      )}
    </div>
  );
}

export default ProductList;

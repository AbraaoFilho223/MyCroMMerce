import React, { useEffect, useState } from 'react';
import { getProducts } from './services/api';

const App = () => {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    const fetchProducts = async () => {
      const fetchedProducts = await getProducts();
      setProducts(fetchedProducts);
    };

    fetchProducts();
  }, []);

  return (
    <div className="bg-gray-100 min-h-screen flex justify-center items-center">
      <div className="bg-white p-8 rounded-xl shadow-lg w-full max-w-4xl">
        <h1 className="text-3xl font-semibold text-center text-blue-600">Welcome to MyCroMMerce</h1>
        <p className="text-gray-600 text-center mt-2">An awesome e-commerce experience</p>

        <div className="mt-6">
          <h2 className="text-2xl font-semibold text-gray-700">Products</h2>
          <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 gap-4 mt-4">
            {products.length > 0 ? (
              products.map((product) => (
                <div key={product.id} className="bg-white p-4 rounded-lg shadow-md">
                  <img src={product.imageUrl} alt={product.name} className="w-full h-48 object-cover rounded-lg" />
                  <h3 className="text-xl font-semibold mt-2">{product.name}</h3>
                  <p className="text-gray-600 mt-2">{product.description}</p>
                  <p className="text-blue-600 font-semibold mt-2">${product.price}</p>
                </div>
              ))
            ) : (
              <p>Loading products...</p>
            )}
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;

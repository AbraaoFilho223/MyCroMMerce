import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080/api/',
});

export const getProducts = async () => {
  try {
    const response = await api.get('products');
    return response.data;
  } catch (error) {
    console.error('Error fetching products:', error);
    return [];
  }
};

export const getOrderDetails = async (orderId) => {
  try {
    const response = await api.get(`orders/${orderId}`);
    return response.data;
  } catch (error) {
    console.error('Error fetching order details:', error);
    return null;
  }
};

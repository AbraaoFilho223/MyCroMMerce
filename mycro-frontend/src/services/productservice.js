// src/services/productService.js
import api from './api'

export const getAllProducts = () => api.get('/products')
export const getProductById = (productId) => api.get(`/products/${productId}`)
export const createProduct = (productData) => api.post('/products', productData)

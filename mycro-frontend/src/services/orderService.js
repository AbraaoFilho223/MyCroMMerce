// src/services/orderService.js
import api from './api'

export const createOrder = (orderData) => api.post('/orders', orderData)
export const getOrderById = (orderId) => api.get(`/orders/${orderId}`)
export const getAllOrders = () => api.get('/orders')

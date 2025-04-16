// src/services/paymentService.js
import api from './api'

export const createPayment = (paymentData) => api.post('/payments', paymentData)
export const getPaymentById = (paymentId) => api.get(`/payments/${paymentId}`)
export const getAllPayments = () => api.get('/payments')

// src/services/userService.js
import axios from 'axios'

const API = 'http://localhost:8080/api/users'

export const registerUser = (userData) => axios.post(`${API}/register`, userData)

export const loginUser = async (credentials) => {
  const response = await axios.post(`${API}/login`, credentials)
  const token = response.data.token
  localStorage.setItem('token', token)
  return response
}

export const getUserById = (userId) => axios.get(`${API}/${userId}`)

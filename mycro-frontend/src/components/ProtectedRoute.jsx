import React from 'react';
import { Navigate } from 'react-router-dom';

const ProtectedRoute = ({ children }) => {
  if (!localStorage.getItem('authToken')) {
    return <Navigate to="/login" />;
  }
  return children;
};

export default ProtectedRoute;

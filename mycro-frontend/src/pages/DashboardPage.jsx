import React, { useEffect, useState } from 'react';
import { Navigate } from 'react-router-dom';

const DashboardPage = () => {
  const [checkedAuth, setCheckedAuth] = useState(false);
  const [isAuthenticated, setIsAuthenticated] = useState(false);

  useEffect(() => {
    const token = localStorage.getItem('authToken');
    if (token) {
      setIsAuthenticated(true);
    }
    setCheckedAuth(true);
  }, []);

  if (!checkedAuth) {
    return <div>Loading...</div>;
  }

  if (!isAuthenticated) {
    return <Navigate to="/" replace />;
  }

  return (
    <div>
      <h1>Welcome to your Dashboard</h1>
      <p>Here are your available services:</p>
    </div>
  );
};

export default DashboardPage;

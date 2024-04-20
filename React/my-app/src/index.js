import React, { Suspense } from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
      <Suspense fallback="loading">
        <App />
      </Suspense>
  </React.StrictMode>
);

// <Suspense> lets you display a fallback until its children have finished loading.
// React.strictMode :- StrictMode is a tool for highlighting potential problems in an application

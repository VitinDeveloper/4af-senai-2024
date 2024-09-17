import { createRoot } from 'react-dom/client'
import './index.css'
import { ReactDOM } from 'react'
import { RouterProvider } from 'react-router-dom'
import router from './router/routes'
import { GlobalConextProvider } from './contexts/GlobalConext'

createRoot(document.getElementById('root')).render(
    <GlobalConextProvider>
        <RouterProvider router={router}>
        </RouterProvider>
    </GlobalConextProvider>
)

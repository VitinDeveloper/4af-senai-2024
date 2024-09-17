import { createContext } from "react";

export const GlobalConext = createContext()

export const GlobalConextProvider = ({children}) => {
    //informações globais
    let usuarioLogado = 'Melon musk'
    //informações globais
    return (
        <GlobalConext.Provider value={{usuarioLogado}}>
            {children}
        </GlobalConext.Provider>
    )
}
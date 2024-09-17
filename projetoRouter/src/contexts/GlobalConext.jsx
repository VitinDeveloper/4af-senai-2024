import { createContext, useState } from "react";

export const GlobalConext = createContext()

export const GlobalConextProvider = ({children}) => {
    //informações globais
    let usuarioLogado = 'Melon musk'
    const [usuarios, setUsuarios] = useState([
        {
            id: Date.now(),
            nome: "ET Bilu",
            email: "busquem@conhecimento.com.br"
        },
        {
            id: Date.now()+1,
            nome: "Mano Juca",
            email: "mj-vidaloka@email.com"
        },
        {
            id: Date.now()+2,
            nome: "Melon Musk",
            email: "melonMusk@spacex.com.br"
        }
    ])
    //informações globais
    return (
        <GlobalConext.Provider value={{usuarioLogado, usuarios, setUsuarios}}>
            {children}
        </GlobalConext.Provider>
    )
}
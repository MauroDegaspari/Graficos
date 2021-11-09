import { Vendedor } from "./vendedores"



export type Vendas ={
    id:number;
    vistas:number;
    negocios:number;
    quantidade:number;
    data:string;
    vendedor:Vendedor;
}

export type vendasPage ={
    content?: Vendas[];
    last:boolean;
    totalElements:number;
    number:number;
    totalPages:number;
    size?:number;
    first:boolean;
    numberOfElements?:number;
    empty?:boolean;
}


export type SomaVendas ={
    nomeVendedor: string;
    total: number;
}
 export type sucessoVendas = {
     nomeVendedor: string;
     visitas:number;
     negocios: number;
 } 

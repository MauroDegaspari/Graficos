import axios from "axios";
import { useEffect, useState } from "react";
import { vendasPage } from "types/vendas";

import { formatLocalDate } from "utils/js";
import { BASE_URL } from "utils/requests";


function DataTable(){

     const[page, setPage] = useState<vendasPage>({
        first:true,
        last:true, 
        number:0,
        totalElements:0,
        totalPages:0
     });

        useEffect(() => {
            axios.get(BASE_URL + '/vendas?page=0&size=20&sort=data,desc')
            .then(response => {
                setPage(response.data);
            });
        } , []);


    return(
        <div className="table-responsive">
    <table className="table table-striped table-sm">
        <thead>
            <tr> 
                <th>Data</th>
                <th>Vendedor</th>
                <th>Clientes visitados</th> 
                <th>Negócios fechados</th>
                <th>Valor</th>
            </tr>
        </thead>
        <tbody>
           {page.content?.map(item =>(
               <tr key={item.id}>
                   <td>{formatLocalDate(item.data,"dd/MM/yyyy")}</td>
                   <td>{item.vendedor}</td>
                   <td>{item.vistas}</td>
                   <td>{item.negocios}</td>
                   <td>{item.quantidade.toFixed(2)}</td>
               </tr>
           
           ))}
        </tbody>
    </table>
</div>
    )
}
export default DataTable;
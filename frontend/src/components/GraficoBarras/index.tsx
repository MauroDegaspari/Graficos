import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { sucessoVendas } from 'types/vendas';
import { round } from 'utils/arredonda';
import { BASE_URL } from 'utils/requests';

type SeriesData = {
    name: string;
    data: number[];
}

type ChartData = {
    labels:{
        categories: string[];
    };
    series: SeriesData[];
}

function GraficoBarras(){

    const [chartData, setChartData] = useState<ChartData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []                   
            }
        ]
    });

    useEffect(() => {

        // tratamento de dados
    axios.get(BASE_URL + '/vendas/vendas-vendedo')
    .then(response => { 
        const data = response.data as sucessoVendas[];
        const MeusLabels = data.map(x => x.nomeVendedor);
        const MeusSeries = data.map(x => round(100.0 * x.negocios/x.visitas , 1));

        setChartData({
            labels: {
                categories: MeusLabels
            },
            series: [
                {
                    name: "",
                    data: MeusSeries                   
                }
            ]
        })
        //console.log(response.data)
    });

    } , []);  

    

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };
    
    //const mockData = {
    //    labels: {
    //        categories: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    //    },
    //    series: [
    //        {
    //            name: "% Sucesso",
    //            data: [43.6, 67.1, 67.7, 45.6, 71.1]                   
    //       }
    //    ]
    //};
    
    return(
        <Chart
                options={{...options, xaxis: chartData.labels}}
                series={chartData.series}
                type="bar"
                height="240"

       />
    )
}

export default GraficoBarras;
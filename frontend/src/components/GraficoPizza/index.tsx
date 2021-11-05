import axios from 'axios';
import Chart from 'react-apexcharts';
import { BASE_URL } from 'utils/requests';
import { SomaVendas } from 'types/vendas';
import { useEffect, useState } from 'react';

type ChartData = {
    labels: string[];
    series: number[];
}

function GraficoPizza(){

    const [chartData, setChartData] = useState<ChartData>({labels: [], series: []})
  
    useEffect(() => {

        // tratamento de dados
    axios.get(BASE_URL + '/vendas/total-vendas')
    .then(response => { 
        const data = response.data as SomaVendas[];
        const MeusLabels = data.map(x => x.nomeVendedor);
        const MeusSeries = data.map(x => x.total);

        setChartData({labels: MeusLabels, series: MeusSeries})
        //console.log(response.data)
    });

    } , []);  
    
    
   // const mockData = {
   //   series: [477138, 499928, 444867, 220426, 473088],
   //    labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
   //}
    
    const options = {
        legend: {
            show: true
        }
    }
    
    return(
        <Chart
                options={{...options, labels: chartData.labels}}
                series={chartData.series}
                type="donut"
                height="240"

       />
    )
}

export default GraficoPizza;
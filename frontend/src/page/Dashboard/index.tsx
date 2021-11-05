import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import GraficoBarras from 'components/GraficoBarras';
import GraficoPizza from 'components/GraficoPizza';

function Dashboard() {
    return(
        <div>
            <>
  <NavBar/> 
  < div className="container">
      <h1 className="text-primary"> Dashboard</h1>

          <div className="row px-3">
            <div className="col-sm-6">
              <h5 className="text-center text-secondary">VendasBarras</h5>
              <GraficoBarras></GraficoBarras>
            </div>
          

           <div className="col-sm-6">
              <h5 className="text-center text-secondary">VendasPizza</h5>
              <GraficoPizza></GraficoPizza>
            </div>
       
           </div> 
      <DataTable/>
     
      </div>
    <Footer/>
  </>
        </div>
    )
}

export default Dashboard;
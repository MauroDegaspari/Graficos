import Dashboard from "page/Dashboard";
import Home from "page/Home";
import { BrowserRouter, Route, Routes } from "react-router-dom";

function Routers(){
    return(
       <BrowserRouter>
            <Routes>
               <Route path="/" element={<Home/>} />        
               <Route path="/Dashboard" element={<Dashboard/>} />    
            </Routes>

            
       </BrowserRouter>
    )
}

export default Routers;

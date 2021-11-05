import Footer from "components/Footer";
import NavBar from "components/NavBar";


function Home(){
    return(
        <div>
            <>
            <NavBar/>

                <div className="container">
                <div className="row">
                    <div className="col">
                        
                        <div className="jumbotron container">
                            <h1 className="display-4">Olá, mundo!</h1>
                            <p className="lead">Este é um simples componente jumbotron para chamar mais atenção a um determinado conteúdo ou informação.</p>
                            <hr className="my-4"/>
                            <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>           
                            <a className="btn btn-primary btn-lg" href="/Dashboard" role="button">Acesse Aqui</a>
                        </div>
                     </div>

                    <div className="col container">
                        <div className="card">
                        <img className="card-img-top" src="/src/img/eu.jpeg" alt="Imagem de capa do card"/>
                        <div className="card-body">
                        <h5 className="card-title">Meu GitHub</h5>
                        <p className="card-text">Acesse meu GitHub para poder ter mais conhecimento das minhas Skill e outros Repositorios.</p>
                        <a href="https://github.com/MauroDegaspari" className="btn btn-primary">Visitar</a>
                        </div>
                        </div>
                    </div>
                 </div>
                 </div>  
              <Footer/>
            </>
        </div>
        
    )
}

export default Home;
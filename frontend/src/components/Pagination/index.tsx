import { vendasPage } from "types/vendas";

type Props = {
  page: vendasPage;
}

function pagination({page}: Props) {
    return(
        <nav aria-label="Navegação de página exemplo">
        <ul className="pagination justify-content-center">
          <li className="page-item disabled">
            <a className="page-link" href="#">Anterior</a>
          </li>
          <li className="page-item disabled"><a className="page-link" href="#">1</a></li>
          <li className="page-item"><a className="page-link" href="#">2</a></li>
          <li className="page-item"><a className="page-link" href="#">3</a></li>
          <li className="page-item">
            <a className="page-link" href="#">Próximo</a>
          </li>
        </ul>
      </nav>
    )
}

export default pagination;
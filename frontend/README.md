# Criação do Frontend e configuração

- Criar projeto ReactJS com `create-react-app`:
```bash
npx create-react-app frontend --template typescript
```
##### Yarn
```bash
yarn -v
npm install --global yarn
```

- *Lembrete: excluir repositório Git do projeto ReactJS*

##### React Router DOM
```bash
yarn add react-router-dom

yarn add @types/react-router-dom -D
```
- Criar arquivo de rotas `Routes.tsx`

##### Axios
```bash
yarn add axios
```
- Definir BASE_URL
- Definir tipo SaleSum
- Definir tipo local ChartData em DonutChart
- Fazer a requisição e tratar os dados


### Adicionar Bootstrap e CSS ao projeto
- Bootstrap
```
yarn add bootstrap
```
```
(index.tsx) import 'bootstrap/dist/css/bootstrap.css';
```
###  Adicionar arquivo Netlify para Deploy
- Limpar projeto ReactJS / tsconfig.json
- Arquivo _redirects
```
/* /index.html 200
```

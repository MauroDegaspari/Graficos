# Criação do Frontend

- Criar projeto ReactJS com `create-react-app`:
```bash
npx create-react-app frontend --template typescript
```
- Conferir Yarn
```bash
yarn -v
npm install --global yarn
```

- *Lembrete: excluir repositório Git do projeto ReactJS*

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

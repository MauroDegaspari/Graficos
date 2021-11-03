# Backend
- Criar projeto Spring Boot no `Spring Initializr` com as seguintes dependências:
  - Web
  - JPA
  - H2
  - Postgres
  - Security

### criar as entidades e o seed do banco
#### Modelo conceitual
![Image](https://github.com/devsuperior/bds-assets/raw/main/sds/sds3-mc.png "Modelo conceitual")

#### application.properties
```
spring.jpa.open-in-view=false

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

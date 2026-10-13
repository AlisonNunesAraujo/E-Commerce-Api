# E-Commerce em Java

API REST de e-commerce em Spring Boot, com produtos, categorias, lojas, pedidos, vendedores, banners, carrinho e usuários, usando PostgreSQL.

## Tecnologias

- Java 17
- Spring Boot 4.1 (Web MVC, Data JPA, Security)
- PostgreSQL
- Flyway (migrations)
- Maven

## Como rodar

1. Crie um banco PostgreSQL chamado `product_id`.
2. Ajuste usuário e senha em `src/main/resources/application.properties`.
3. Execute:

```bash
./mvnw spring-boot:run
```

As tabelas são criadas automaticamente pelo Flyway (`src/main/resources/db/migration`).

## Endpoints

| Recurso | Rotas |
|---|---|
| Produtos | `GET /v1/get`, `GET /v1/{id}`, `POST /v1/list_products`, `PUT /v1/{id}`, `DELETE /v1/{id}` |
| Categorias | `GET /v1/list_categories`, `POST /v1/send_cat`, `DELETE /v1/categories/{id}` |
| Lojas | `GET /Lojas/list_lojas`, `POST /Lojas/send` |
| Pedidos | `GET /pedidos/list_pedidos`, `POST /pedidos/list` |
| Vendedores | `GET /sellers/list`, `POST /sellers/send` |
| Banners | `GET /banners/list`, `POST /banners/send`, `PUT /banners/{id}`, `DELETE /banners/{id}` |
| Carrinho | `GET /cart/list` |
| Login | `POST /login/user` |

## Status

🚧 Projeto em desenvolvimento. A autenticação está sendo implementada; por enquanto todas as rotas estão liberadas (`permitAll`) no `SecurityConfig`.

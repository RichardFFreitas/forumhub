# API Forum Hub

A Forum Hub API é um projeto desenvolvido para gerenciar perfis, cursos, tópicos, respostas e usuários. Suas funcionalidades incluem operações CRUD completas, autenticação e autorização baseada em JWT (JSON Web Token) e suporte à paginação em recursos que retornam todos os elementos cadastrados.
 

**URL Base do Servidor:** http://localhost:8080

## Técnicas Utilizadas

- Desenvolvido com Java 17+ usando Spring Initializr.  
- Versionamento no GitHub.  
- Banco de dados MySQL.  
- Manipulação de dados com Spring JPA.  
- API RESTful com Spring Boot, autenticação com Spring Security e JWT.  
- Documentação via Swagger/OpenAPI.  

## Como Configurar e Executar o Projeto

**Pré-requisitos:**  

- Java 17+  
- Maven  
- MySQL  

**Clonar o Repositório:**  

```bash
git clone https://github.com/richardffreitas/forum-hub.git
cd forum-hub
````

**Configurar o Banco de Dados:**

Crie um banco no MySQL e atualize o `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

ou utilize variáveis de ambiente:

```properties
spring.datasource.url=${DATABASE_URL}
spring.datasource.username=${DATABASE_USER}
spring.datasource.password=${DATABASE_PASSWORD}
```

**SecretKey JWT:**

```properties
api.security.token.secret=${Secretkey}
```

**Iniciar o Projeto:**

```bash
mvn spring-boot:run
```

**Acessar a Documentação:**

Abra [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

**8 - Login Inicial:**

Envie POST para `http://localhost:8080/login`:

```json
{
  "login": "admin@admin.com",
  "senha": "admin"
}
```

---

## Contatos

* **LinkedIn:** [https://www.linkedin.com/in/richard-freitas-dev/](https://www.linkedin.com/in/richard-freitas-dev/)
* **Portfólio:** [https://richardffreitas.vercel.app](https://richardffreitas.vercel.app)
* **E-mail:** [Richardfelipelives@gmail.com](mailto:Richardfelipelives@gmail.com)

---

## Endpoints Principais

### Autenticação

* **POST** `/login`

  * Autentica usuários.
  * **Corpo:**

    ```json
    {
      "login": "string",
      "senha": "string"
    }
    ```
  * **Resposta:** Token JWT para autenticação.

### Usuários

* **GET** `/usuarios` – Lista todos os usuários.
* **POST** `/usuarios` – Registra um novo usuário.
* **PUT** `/usuarios` – Atualiza um usuário existente.
* **GET** `/usuarios/{id}` – Recupera usuário pelo ID.
* **GET** `/usuarios/todos` – Lista usuários com paginação.

### Tópicos

* **GET** `/topicos` – Lista tópicos.
* **POST** `/topicos` – Cria tópico.
* **PUT** `/topicos` – Atualiza tópico.
* **GET** `/topicos/{id}` – Detalhes de tópico.
* **DELETE** `/topicos/{id}` – Remove tópico.

### Respostas

* **GET** `/respostas` – Lista respostas.
* **POST** `/respostas` – Cria resposta.
* **PUT** `/respostas` – Atualiza resposta.
* **GET** `/respostas/{id}` – Detalhes da resposta.
* **DELETE** `/respostas/{id}` – Remove resposta.

### Cursos

* **GET** `/cursos` – Lista cursos.
* **POST** `/cursos` – Cria curso.

### Perfis

* **GET** `/perfis` – Lista todos os perfis cadastrados.

---

## Segurança

Endpoints protegidos requerem JWT:

```
Authorization: Bearer {token}
```

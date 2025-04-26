# Persistencia de dados NOSQL
# 🎯 Objetivo
Desenvolver uma aplicação web para gerenciamento de tarefas baseada no modelo MVC, utilizando persistência de dados com H2, MariaDB e MongoDB. O projeto visa consolidar conhecimentos em arquitetura de software, integração com diferentes bancos de dados e uso do Spring Boot.

# 🗂️ Estrutura do Projeto
A aplicação será dividida nas seguintes camadas:

Model: Representa as entidades do domínio do sistema, como Tarefa, Usuario, etc.

Repository: Interfaces que acessam os dados diretamente nos bancos H2, MariaDB e MongoDB.

Service: Responsável pela lógica de negócio, validações e regras.

Controller: Exposição de endpoints REST para o frontend ou clientes externos.

# 🛠️ Criação e Configuração no VS Code
**1. Criação do Projeto** 
Utilize o Spring Initializr integrado ao VS Code:
> Project: Maven
> Language: Java
> Java: 17+
> Packaging: Jar
> Dependencies:
Spring Web
Spring Data JPA
Spring Data MongoDB
Validation
Lombok
Spring Boot DevTools
H2 Database
MariaDB Driver

**2. Preparação do Ambiente**
Certifique-se de que os seguintes plugins estão instalados no VS Code:

Extension Pack for Java

Spring Boot Extension Pack
*//java -version//*

## ⚙️ Configuração do application.properties
Configure a persistência com os diferentes bancos:

**Banco H2 (memória):**
*//spring.datasource.url=jdbc:h2:mem:db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true//*

**Banco MariaDB:**
*//spring.datasource.url=jdbc:mariadb://localhost:3306/gerenciador
spring.datasource.username=root
spring.datasource.password=senha
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update//*

**MongoDB:**
spring.data.mongodb.uri=mongodb://localhost:***/gerenciadorTarefas

## 🚀 Como Rodar

1. Clone o repositório:
*//git clone https://github.com/seu-usuario/nome-do-repo.git//* 

2. Abra no VS Code:
*//code nome-do-repo//*

3.Execute o projeto pelo botão “Run” ou pelo terminal:
*//./mvnw spring-boot:run//*

# 🧪 Testando
Acesse os endpoints via Postman ou navegador:
> H2 Console: http://localhost:8080/h2-console
> MongoDB: visualizar dados com ferramentas como MongoDB Compass
> REST Endpoints: http://localhost:8080/api/tarefas

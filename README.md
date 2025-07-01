# Sistema de Cadastro de Ninjas

Bem-vindo ao **Sistema de Cadastro de Ninjas**!

Este projeto é uma aplicação em arquitetura em camadas desenvolvida com **Spring Boot**, projetada para cadastrar ninjas e suas respectivas missões. Utiliza um banco de dados em memória **H2**, com migrações gerenciadas pelo **Flyway**, e segue boas práticas de desenvolvimento, como controle de versão com **Git** e hospedagem no **GitHub**.

Este projeto foi realizado no **Java 10X** junto ao **FIASCO**, como parte de um processo de aprendizado e aplicação prática.

---

## Visão Geral do Projeto

O sistema gerencia ninjas e suas missões com as seguintes características:

- Cadastro de ninjas com informações como nome, idade, email e rank.
- Atribuição de uma missão para cada ninja.
- Gerenciamento das missões e dos ninjas associados a elas.

**Relacionamento entre entidades:**

- Um ninja pode estar vinculado a apenas uma missão.
- Uma missão pode ter vários ninjas atribuídos.

---

## Tecnologias Utilizadas

- **Spring Boot** - Framework para desenvolvimento da aplicação web.
- **Banco de Dados H2** - Banco em memória para desenvolvimento e testes.
- **Flyway** - Controle e versionamento das migrações do banco de dados.
- **JPA (Java Persistence API)** - Mapeamento objeto-relacional (ORM).
- **Spring Data JPA** - Facilita a interação com o banco de dados.
- **Maven** - Gerenciamento de dependências e build do projeto.
- **SQL** - Manipulação e estruturação do banco de dados.
- **Git** - Controle de versão do código-fonte.
- **GitHub** - Hospedagem do repositório.


---

## Design do Banco de Dados

- **Ninja**  
  Atributos: `id`, `nome`, `idade`, `email`, `rank`

- **Missão**  
  Atributos: `id`, `título`, `descrição`

**Relação:**  
Cada ninja possui uma missão (1:1), enquanto uma missão pode estar associada a múltiplos ninjas (1:N).

---

## Como Executar o Projeto

1. Clone o repositório:  
   ```bash
   git clone https://github.com/Carlos-Henrique93/CadastrodeNinjas.git

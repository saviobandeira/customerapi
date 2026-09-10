<h1>API REST para gerenciamento de clientes, desenvolvida com Spring Boot, utilizando Maven e H2.</h1>

<h2> Especificação </h2>

Você deverá entregar um projeto Spring Boot contendo um CRUD completo de web services REST para
acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:
- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar
Maven como gerenciador de dependência, e Java como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da
entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no
diagrama):

<h2>Diagrama</h2>

[![](https://img.plantuml.biz/plantuml/svg/SoWkIImgAStDuKhEIImkLd3syNJr2r6evb800bs5p1G5AmMV_Bnq1HkRWcmxEwXmNc9kAb0YkAGeCoyTAfPSa8Okb9cNd0zMw99VcfIJ2XLDoYmgoN19B4a56vsSc0DYmmp9oCn9AKhD0qfvvfMafgSMSTLoEQJcfG1T2000)](https://editor.plantuml.com/uml/SoWkIImgAStDuKhEIImkLd3syNJr2r6evb800bs5p1G5AmMV_Bnq1HkRWcmxEwXmNc9kAb0YkAGeCoyTAfPSa8Okb9cNd0zMw99VcfIJ2XLDoYmgoN19B4a56vsSc0DYmmp9oCn9AKhD0qfvvfMafgSMSTLoEQJcfG1T2000)

<h2>Tecnologias</h2>

- Java 17+
- Spring Boot 4.1.1
- Maven
- H2 Database

<h2>API Endpoints</h2>

<h3>GET /clients/{id}</h3>
<h3>GET /clients?page={int}&size={int}&sort={str}</h3>
<h3>POST /clients</h3>

**REQUEST**

```json
{
    "name": "Maria Silva",
    "cpf": "12345678901",
    "income": 6500.0,
    "birthDate": "1994-07-20",
    "children": 2
}
```

<h3>PUT /clients/{id}</h3>

**REQUEST**

```json
{
    "name": "Maria Silva",
    "cpf": "12345678901",
    "income": 6500.0,
    "birthDate": "1994-07-20",
    "children": 2
}
```

<h3>DELETE /clients/{id}</h3>
# Sistema de Gerenciamento de Departamento, Curso e Aluno

Este projeto em Java implementa um sistema simples de gerenciamento de departamentos, cursos e alunos, utilizando conceitos de agregação e composição entre classes. Ele permite a criação e manipulação de objetos de alunos, cursos e departamentos e exibe essas informações de forma estruturada.

## Funcionalidades

- **Aluno**
  - Criar um aluno com nome e matrícula.
  - Métodos para acessar e modificar os dados do aluno.
  
- **Curso**
  - Criar um curso com nome e código.
  - Associar múltiplos alunos a um curso.
  - Métodos para acessar e modificar as informações do curso.
  - Exibir uma lista de alunos matriculados no curso.
  
- **Departamento**
  - Criar um departamento com nome.
  - Associar um curso ao departamento (composição).
  - Métodos para acessar e modificar as informações do departamento.
  - Exibir os cursos e seus alunos associados ao departamento.
 
- Saída esperada

![image](https://github.com/user-attachments/assets/1fc4e237-c95d-4adb-a9c2-a5edd2ce5e2b)

## Estrutura de Pastas

```bash
src/
│
├── classes/
│   ├── aluno/
│   │   └── Aluno.java
│   ├── curso/
│   │   └── Curso.java
│   └── departamento/
│       └── Departamento.java
│
└── Main.java


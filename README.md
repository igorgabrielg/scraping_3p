<h4 align="center"> 
	CRUD REST com Quarkus
</h4>
<p align="center">
  <a>
  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/igorgabrielg/scraping_3p?color=green">
  </a>
  
  <a>
  <img alt="GitHub repo size" src="https://img.shields.io/github/repo-size/igorgabrielg/scraping_3p?color=green">
  </a>
  
  <a href="https://www.linkedin.com/in/igorgabrielg/">
    <img alt="Made by Igor Gabriel" src="https://img.shields.io/badge/made%20by-Igor Gabriel-%2304D361?color=green">
  </a>

  <a href="https://github.com/igorgabrielg/scraping_3p/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/igorgabrielg/scraping_3p?color=green">
  </a>

  <a>
  <img alt="License" src="https://img.shields.io/badge/license-MIT-bright?color=green">
  </a>
</p>
<p align="center">
  <a href="#-project">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#rocket-Tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-ferramentas">Ferramentas</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-compilar">Compilar</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-como-contribuir">Como contribuir</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-licensa">Licensa</a>
</p>

<br>

## 💻 Project

Este projeto foi desenvolvido para testar a implementação e eficiência do Quarkus além servir como exemplo de um CRUD REST.

## :rocket: Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- [Java](https://docs.oracle.com/en/java/)
- [Quarkus](https://quarkus.io/) 
- [Docker](https://docs.docker.com)
- [Postgresql](https://www.postgresql.org/docs/)

## :rocket: Ferramentas

- [insomnia](https://insomnia.rest/download/)


## Compilar

* Compila e executa o projeto
```
mvnw compile quarkus:dev
```
* Executa o jar que está no diretório 
```
java -jar rest-quarkus-1.0-SNAPSHOT-native-image-source-jar
```
* Compila o projeto para uma imagem nativa Docker
```
./mvnw package -Pnative -Dquarkus.native.container-runtime=docker
```

## 🤔 Como contribuir

- Faça um fork desse repositório;
- Cria uma branch com a sua feature: `git checkout -b minha-feature`;
- Faça commit das suas alterações: `git commit -m 'feat: Minha nova feature'`;
- Faça push para a sua branch: `git push origin minha-feature`.

Depois que o merge da sua pull request for feito, você pode deletar a sua branch.

## :memo: Licensa

Este projeto está sob a licensa MIT. Veja o [LICENSE](LICENSE.md) para mais detalhes.

---

Desenvolvido por Igor Gabriel :wave: [Entrar em contato!](https://www.linkedin.com/in/igorgabrielg/)

# Santader Dev Week 2023
Java RESTful API criada para o Santander Dev Week.

## Diagrama de Classes

```mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }
  
  class Account {
    - number: String
    - agency: String
    - balance: String
    - limit: String
  }

  class Feature {
    - icons: String
    - description: String
  }

  class Card {
    - number: String
    - limit: String
  }

  class News {
    - icons: String
    - description: String
  }

  User "1" * -- "1" Account
  User * -- "N" Card
  User * -- "1" Feature
  User * -- "N" News
```
## Publicando API REST na Nuvem Usando Spring Boot, Java 17 e Railway

* Criação e Versionamento da API com Spring Initializr e Github
* Abstração e Modelagem do Domínio Figma, GhatGPT (Mermaid) e JPA
* Implementação do Backend Spring Boot e Java 17
* Deploy e Monitoramento Railway (PostgreSQL e CI/CD da API

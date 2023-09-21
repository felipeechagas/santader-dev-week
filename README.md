# Santader Dev Week 2023
Java RESTful API criada para o Santander Deev Week.

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

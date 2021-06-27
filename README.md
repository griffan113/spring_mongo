<div align="center">
  <a href="http://nestjs.com/" target="blank"><img src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" width="320" alt="Nest Logo" /></a>
</div>

<div align="center">
    <h2>MongoDB + Kotlin basic CRUD.</h2>
</div>

## Routing:

### Account Controller:

| Route               | Job                                       | Method |
| ------------------- | ------------------------------------------| ------ |
| /account            | Retrieve all user accounts                | GET    |
| /account            | Create a new account                      | POST   |
| /account/:id        | Retrieve an unique account by id          | GET    |
| /account/:id        | Delete an unique account by id            | DELETE |
| /account/:id/       | Update a account status by document id    | PUT    |
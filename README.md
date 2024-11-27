# WegenTCG

WegenTCG is an in development Trading card game by Dominik Mathias Banach

## ClassDiagramm
![BanachCardGame](https://github.com/user-attachments/assets/67332af0-9e0e-46df-b988-bbd530c95a57)

## Github Repository

https://github.com/DominikB-FH/wegen-tcg/tree/develop

## Structure

### Controller
Are needed for the handling of user interactions. Receives Data from User, transfers it to the Application and returns data as a response

### Service
Core Buisness logic, is the bridge between the Controller and Repositiories. Services are processing the Users Input and making sure they are Valid, if not returns error messages.

### Repositories
Is responsible for the managment of saved data (planned to add Database connection down the line for proper CRUD operation handling)

### Entities
The parts of the Programm that are changed by the Operator inputs (includes Cards, User Accounts, Decks etc...)

# Technical Details

Port: 10001

Methods:

### POST

localhost:10001/users

json needed to create new user
```json{
body:
{
  "userName": "",
  "password": ""
}
```

### GET
localhost:10001/users

Retruns all Saved users

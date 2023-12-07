# JavaFX Account Manager

## Overview

This JavaFX application serves as an account manager, implementing basic CRUD operations for customers and their bank accounts. It follows Object-Oriented Programming (OOP) principles, utilizing the Singleton pattern to manage application state and adhering to SOLID principles.

## Features

- Create and manage customer accounts.
- Add bank accounts for customers.
- Deposit and withdraw funds from customer bank accounts.

## Design Patterns

**Singleton Pattern:**
The application employs the Singleton pattern to ensure a single point of control for managing the application state.

## Principles

**SOLID Principles:**
The application adheres to SOLID principles to enhance maintainability and extensibility.

## How to Run

### Requirements

- Java 8 or higher
- Apache Maven

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/londonbbylondon/javafx-account-manager.git
   ```

2. Navigae to the project directory:

   ```bash
   cd javafx-account-manager
   ```

3. Build the project with maven:

   ```bash
    mvn clean install
   ```

4. Run the application:

   ```bash
    mvn clean javafx:run
   ```

## Usage

### Create a Customer

1. Click the **Create Customer** button.
2. Enter the customer's first name, last name, and email address.
3. Click the **Save** button.

### Create a Bank Account

1. Select a customer from the **Customers** table.
2. Click the **Create Bank Account** button.
3. Enter the bank account's name and balance.
4. Click the **Save** button.

### Deposit Funds

1. Select a bank account from the **Bank Accounts** table.
2. Enter the amount to deposit.
3. Click the **Deposit** button.

### Withdraw Funds

1. Select a bank account from the **Bank Accounts** table.
2. Enter the amount to withdraw.
3. Click the **Withdraw** button.

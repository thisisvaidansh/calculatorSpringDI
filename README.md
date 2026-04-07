SPRING DI CALCULATOR

## Overview

This project is a simple calculator application built using the **Spring Framework**.
It demonstrates the concept of **Dependency Injection (DI)** and **Inversion of Control (IoC)** without any manual object creation.

---

## Features

* Supports **Addition** and **Subtraction**
* Uses **Spring Dependency Injection**
* Dynamic service selection using **Map-based injection**
* No XML configuration (annotation-based setup)

---

## Concepts Used

* Dependency Injection (DI)
* Inversion of Control (IoC)
* `@Component`
* `@Autowired`
* `@Configuration`
* `@ComponentScan`
* Collection-based injection (`Map<String, Service>`)

---

## Technologies

* Java
* Spring Core

---

## Project Structure

```
src/main/java/com/example/calc/
 ├── AdditionService.java
 ├── SubtractionService.java
 ├── OperationService.java
 ├── UserService.java
 ├── AppConfig.java
 └── MainCalc.java
```

---

## How to Run

1. Clone the repository
2. Open in your IDE (IntelliJ / Eclipse)
3. Run `MainCalc.java`

---

## Sample Output

```
Result: 15
Result: 5
```

---

## Key Learning

This project shows how Spring manages object creation and dependency injection automatically using annotations, eliminating the need for manual object creation.

---

## 📌 Author

* Your Name

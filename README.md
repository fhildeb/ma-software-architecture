# ma-software-architecture

MA Software Architecture Course from the University of Applied Science Mittweida that took place in 2020.

> **_NOTE:_** Code commentary might appear in German

## Course Contents

This repo features projects from a course about Architecture of Complex Software Systems. The course focused on understanding software architecture, design patterns, and best practices. It laid out the benefit and needs of software architecture, and architects, as well as explaining key terms and concepts. The course covered design, documentation, and evaluation of software architectures, along with architecture styles and model-driven software development. General procedures for producing software on an architecture blueprint were discussed, as well as programming templates and design principles. Architectural styles such as batch-sequential, pipes and filters, layers, ports and adapters, repositories, blackboards, object orientation, and more were covered in depth.

### Core Features

- Design Patterns (GoF)
- Java Programming Examples
- Software Architect's Role and Tasks
- Design and Documentation of Software Architectures
- Architecture Styles & Patterns
- Evaluation of Software Architectures (ATAM)
- Model-Driven Software Development (MDSD)
- General Procedure for Software Architecture Production
- Solution Templates and Design Principles
- Architectural Styles Overview

## Repository Contents

Throughout the course, Docker and Docker Compose were taught to create and manage containers, streamlining the development process and ensuring consistency across environments. MongoDB was introduced as a flexible NoSQL database, while NodeJS and ExpressJS were utilized to build a scalable and efficient backend.

There were a number of practical applications that fell into two categories: 8 programms applying various pattern techniques in Java and a separate web app combining patterns with a backend and a VueJS application written in TypeScript.

### Pattern Techniques

1. Singleton Observer Slider Sync
2. Composite Manufacturer Tree
3. Structual Design Patterns
   - Proxy Calculator
   - Mediator Chat
4. Command and Memento Graphics Editor
5. Creational Patterns
   - Vehicle Builder Shop
   - Template Beverage Preparation

### Survey App

VueJS-powered survey management application offering an interactive platform for users to engage with various surveys.

The app is split into 3 parts:

- `docker-setup`: Starts off by setup up the plain backend infrastructure with MongoDB on Docker and building it using Docker Compose.
- `restful-survey`: Connects the Docker backend to a custom REST API running on NodeJS while handling authentication, database setups, and enabling various Postman API calls.
- `vue-platform`: The final part not only integrates the REST API into an Graphical User Interface using VueJS, but also automates the build completely using Dockerfiles in subdirectories. The whole setup and connection is done using communication across containers, allowing for an easy integration without the need to manually and separately maintaining software instances.

#### Features

- Browse available surveys
- Access detailed information about each survey
- Participate in surveys
- Real-time response statistics
- Review surveys

## Tools

- [Eclipse](https://www.eclipse.org)
- [JavaFX](https://openjfx.io/)
- [VueJS](https://vuejs.org/)
- [ExpressJS](https://expressjs.com/de/)
- [mongoDB](https://www.mongodb.com/)
- [Docker](https://docs.docker.com/)
- [Postman](https://www.postman.com/downloads/)

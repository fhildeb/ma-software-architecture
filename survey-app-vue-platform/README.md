# Interactive Survey Platform with VueJS

## Vue Introduction

VueJS is a progressive JavaScript framework for building user interfaces. It is lightweight, flexible, and easy to integrate into various projects. In this project, we have created an interactive survey platform using VueJS to manage and display surveys with a seamless user experience.

## Survey Platform

The survey app enables users to view a list of available surveys, access survey details, and vote on their preferred options. It is implemented as a responsive web interface utilizing VueJS components, such as router links, dynamic class assignments, and event handling. Additionally, the platform fetches data from a REST API, allowing seamless integration with a MongoDB backend.

#### List all Surveys

![List all Surveys](/img/survey-app-01.png)

#### View a Survey

![View a Survey](/img/survey-app-02.png)

#### Vote on Surveys

![Vote on Surveys](/img/survey-app-03.png)

## Development

### Start the App

Install [Docker](https://www.docker.com/get-started), [Docker Compose](https://docs.docker.com/compose/install/), and [Postman](https://www.postman.com/downloads/)

```bash
# Start the Database
docker-compose up -d
```

![Docker Image View](/img/survey-app-docker.png)

- Run Postman API Calls to: `http://0.0.0.0:1499/`
- Check MongoDB Entries at: `http://localhost:8081`
- Database Name: `surveys`
- Access the App on `http://localhost/`

### Develop on the App

Install and run the codebase

```bash
# Navigate into the VueJS folder
cd vuejs

# Install Vue
npm install -g @vue/cli

# Install dependencies
npm install

# Run the app
npm run serve
```

### Develop on the REST API

1. Install [Node.js](https://nodejs.org/) Version 16 and [Postman](https://www.postman.com/downloads/)
2. Install and run the codebase

```bash
# Install dependencies
cd express && npm install

# Start the Database on Port 27017
# Read 01-app-docker-setup for more details
cd .. && docker-compose up -d

# Run the project
cd express && npm start
```

# Interactive Survey Platform with VueJS

## Vue Introduction

VueJS is a progressive JavaScript framework for building user interfaces. It is lightweight, flexible, and easy to integrate into various projects. In this project, we have created an interactive survey platform using VueJS to manage and display surveys with a seamless user experience.

## Survey Platform

The survey app enables users to view a list of available surveys, access survey details, and vote on their preferred options. It is implemented as a responsive web interface utilizing VueJS components, such as router links, dynamic class assignments, and event handling. Additionally, the platform fetches data from a REST API, allowing seamless integration with a MongoDB backend.

## Development

### Run Backend

2. Install [Docker](https://www.docker.com/get-started) and [Docker Compose](https://docs.docker.com/compose/install/)

```bash
# Start the Database
docker-compose up -d
```

Access the backend in your browser at `http://localhost:80`

### Connect Vue App

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

Access the application in your browser at `http://localhost:8080`

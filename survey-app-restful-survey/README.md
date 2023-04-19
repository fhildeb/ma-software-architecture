# RESTful Survey Management System

# REST Introduction

Representational State Transfer (REST) is an architectural style used for designing networked applications. It relies on a stateless, client-server communication protocol, typically using HTTP for requests and responses. RESTful services use standard HTTP methodsto perform operations on resources, which are identified by unique URIs.

# Implementation

This project is a RESTful Survey Management System that allows users to create, manage, and analyze surveys. The system is built using Node.js and Express framework, with data stored in a MongoDB database. The RESTful API provides endpoints for adding new surveys, retrieving survey details, voting on survey options, and fetching survey response statistics. The project is containerized using Docker, enabling easy deployment and integration with other services. This powerful and versatile system simplifies the process of conducting surveys and analyzing the results.

## Development

### Getting started

1. Install [Node.js](https://nodejs.org/) Version 16 and [Postman](https://www.postman.com/downloads/)
2. Install [Docker](https://www.docker.com/get-started) and [Docker Compose](https://docs.docker.com/compose/install/)
3. Install and run the codebase

```bash
# Install dependencies
cd express && npm install

# Start the Database on Port 27017
# Read 01-app-docker-setup for more details
cd .. && docker-compose up -d

# Run the project
cd express && npm start
```

### Testing

To test the RESTful API endpoints open Postman and create a new survey using the POST method and the `/surveys` endpoint. Check if the newly created survey is listed when you send a `GET` request to the `/surveys` endpoint. Also, try listing the surveys using your web browser by navigating to the appropriate URL. Continue with other methods described in the controller file.

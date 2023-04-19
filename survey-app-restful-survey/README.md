# Survey Management System

# REST Introduction

Representational State Transfer (REST) is an architectural style used for designing networked applications. It relies on a stateless, client-server communication protocol, typically using HTTP for requests and responses. RESTful services use standard HTTP methodsto perform operations on resources, which are identified by unique URIs.

# Implementation

This project is a RESTful Survey Management System that allows users to create, manage, and analyze surveys. The system is built using Node.js and Express framework, with data stored in a MongoDB database. The RESTful API provides endpoints for adding new surveys, retrieving survey details, voting on survey options, and fetching survey response statistics. The project is containerized using Docker, enabling easy deployment and integration with other services. This powerful and versatile system simplifies the process of conducting surveys and analyzing the results.

### Testing

> Full Postman Collection within [`testful`](./testful/) directory

To test the RESTful API endpoints open Postman and create a new survey using the POST method and the endpoint. Check if the newly created survey is listed when you send a `GET` request to the endpoint.

> List of API calls can be found below.

#### Create new Surveys

![Postman Survey Creation](/img/survey-postman-01.png)

#### List all Surveys

![Postman Survey Listing](/img/survey-postman-02.png)

#### Vote on Surveys

![Postman Survey Voting](/img/survey-postman-03.png)

### API Calls

```
paths:
  /addUmfrage:
    post:
      description: Add a new survey
      consumes:
        - application/json
      produces:
        - application/json
      parameters:
        - name: body
          in: body
          description: Survey object to add
          required: true
          schema:
            $ref: '#/definitions/Survey'
      responses:
        '201':
          description: Survey created successfully
        '400':
          description: Invalid survey object

  /listUmfragen:
    get:
      description: List all surveys
      produces:
        - application/json
      responses:
        '200':
          description: List of surveys
          schema:
            type: array
            items:
              $ref: '#/definitions/Survey'

  /getUmfrage/{id}:
    get:
      description: Get a survey by ID
      produces:
        - application/json
      parameters:
        - name: id
          in: path
          description: ID of the survey to retrieve
          required: true
          type: string
      responses:
        '200':
          description: Survey retrieved successfully
          schema:
            $ref: '#/definitions/Survey'
        '404':
          description: Survey not found

  /vote/{id}/{nr}:
    post:
      description: Register a vote for a specific survey and answer
      consumes:
        - application/json
      produces:
        - application/json
      parameters:
        - name: id
          in: path
          description: ID of the survey to vote on
          required: true
          type: string
        - name: nr
          in: path
          description: Index of the answer to vote for
          required: true
          type: integer
      responses:
        '200':
          description: Vote counted successfully
        '404':
          description: Survey not found
        '406':
          description: Invalid vote index

  /getStatistic/{id}:
    get:
      description: Get the statistics for a survey
      produces:
        - application/json
      parameters:
        - name: id
          in: path
          description: ID of the survey to get statistics for
          required: true
          type: string
      responses:
        '200':
          description: Statistics retrieved successfully
          schema:
            $ref: '#/definitions/Statistic'
        '404':
          description: Survey not found

definitions:
  Survey:
    type: object
    properties:
      titel:
        type: string
        description: Title of the survey
      frage1:
        type: string
        description: First question in the survey
      antworten1:
        type: array
        items:
          type: string
        description: Possible answers to the first question
    required:
      - titel
      - frage1

  Statistic:
    type: object
    properties:
      umfrage:
        type: string
        description: ID of the survey
      antworten:
        type: array
        items:
          type: object
          properties:
            antwort:
              type: string
              description: Answer to the survey question
            count:
              type: integer
              description: Number of votes for the answer
        description: Results of the survey
    required:
      - umfrage
      - antworten

```

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

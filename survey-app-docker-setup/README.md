# Docker-based MongoDB Admin Interface

## Docker Introduction

Docker is an open-source platform designed to simplify the process of developing, deploying, and managing applications within containers. Containers package software with all its dependencies, enabling consistent execution across different environments. This technology enhances collaboration, accelerates development, and improves the portability of applications.

## MongoDB Introduction

MongoDB is a popular open-source NoSQL database that uses a flexible, document-based data model. It is designed to handle large amounts of data, scale horizontally, and provide high performance.

## Admin Interface

The project sets up a Docker-based environment to manage MongoDB databases using an admin interface called Mongo-Express. By leveraging Docker and Docker-Compose, the project automates the process of starting, stopping, and coordinating MongoDB and Mongo-Express containers.

Additionally, the project integrates data persistence through the use of Docker volumes, which allows users to store MongoDB data outside of the container. This ensures that the data remains available even after shutting down the system, resulting in a more reliable and efficient workflow.

## Development

Install [Docker](https://www.docker.com/get-started) and [Docker Compose](https://docs.docker.com/compose/install/)

```bash
# Start docker compose containers
docker-compose up

## Stop docker compose containers
docker-compose down
```

Open `http://localhost:8081` to access the admin interface.

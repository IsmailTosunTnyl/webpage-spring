# Spring REST API for Personal Website Backend

Welcome to the repository for the Spring REST API, a robust and versatile backend solution for your personal website. This API connects to a MySQL database, uses JPA repositories for efficient data handling, and includes GitHub Actions integration for automated testing and deployment. 🚀

## Features

- **Spring Boot**: Utilizes the power of Spring Boot to create a robust and scalable REST API.
- **MySQL Database**: Connects seamlessly to a MySQL database for storing and retrieving data.
- **JPA Repository**: Uses JPA (Java Persistence API) repositories to simplify database operations.
- **GitHub Actions**: Automated testing and deployment pipelines are set up using GitHub Actions.
- **Local Deployment**: Automatically deploys to a local machine when tests pass.
- **AWS Server Deployment**: Automatically deploys to an AWS server for production use when tests pass.
- **Docker**: Deploys app on both server in a docker container.

## Prerequisites

Before using this API, make sure you have the following tools and technologies installed:

- Java 11 or higher
- MySQL database
- Maven
- Git
- AWS credentials (for production deployment)

## Getting Started

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/your-username/your-api-repo.git
   ```

2. Configure the `application.properties` file to point to your MySQL database.

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Run the API locally:

   ```bash
   mvn spring-boot:run
   ```

The API will be accessible at `http://localhost:8081`.

## GitHub Actions

This repository is configured with GitHub Actions to automate testing and deployment.

- When you push changes to the `main` branch, GitHub Actions will automatically run tests.
- If the tests pass, the API will be automatically deployed to a local machine.
- If you're ready to deploy to a production server, create pull request on `production` branch thats build a docker container and deploy in selected runner.

## Deployment

### Local Deployment

For local deployment, setup a runner on your machine and use yml files in workflow.

### AWS Server Deployment

For production deployment, setup a runner on your machine and use yml files in workflow.


# SKCC KMS AI - RA-JAVA-API-GATEWAY

## Introduction

Welcome to [RA-JAVA-API-GATEWAY] This project document will guide you through setting up the project, so you can get started quickly.
This project is used to check as if gateway is working or not.

## Prerequisites

- JDK 17 or higher
- Lombok
- Docker and Docker Compose
- Gradle 8.3 (or use the included Gradle wrapper)

## Project Structure

The project consists of the module:

- `api-gateway` - Check activity status of gateway, shutdown gateway service.

## Setup & Installation

1. Clone the repository:

```bash
git clone <repository-url>
cd api-gateway
```

2. Build the project:

```bash
./gradlew clean build
```
## Running the Application

1. Start the service:

```bash
./gradlew :api-gateway:bootRun
```

2. Gateway health:

- Check health: http://localhost:9102/api/v1/gw/health/check

![health check](docs/imgs/gateway-up.png)

- Turn down gateway: http://localhost:9102/api/v1/gw/health/down

![shutdown gateway](docs/imgs/gateway-down.png)

## Troubleshooting

- Check debug.log for detailed error messages



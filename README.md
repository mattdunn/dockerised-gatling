# Gatling in a docker container

Inside the docker container, this repositories files are shared under /app

## Dependencies

### If using Docker container (optional)

- docker
- docker-compose

## How to

- start docker daemon

  eval "$(docker-machine env default)"

- run interactive shell inside Docker container

  `docker-compose run app bash`

- run Gatling inside container

  `gatling.sh -sf /app -rf /app/results`

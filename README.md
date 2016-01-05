# Gatling in a docker container

Inside the docker container, this repositories files are shared under /app

Gatling will write its reports to the /app/results folder which is then accessible from the host

## Dependencies

- docker-machine
- docker-compose

## How to

- start docker daemon

  eval "$(docker-machine env default)"

- run interactive shell inside Docker container

  `docker-compose run app bash`

- run Gatling inside container

  `gatling.sh -sf /app -rf /app/results`

- [other useful command line options](http://gatling.io/docs/1.5.6/user_documentation/reference/configuration.html#command-line-options) for Gatling, particularly -sf for changing where to look for simulations

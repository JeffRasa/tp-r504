#!/bin/bash
docker stop
docker rm
docker network prune -f
docker volume prune -f
docker system prune -af


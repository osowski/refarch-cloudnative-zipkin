#!/bin/bash

IMAGE_NAME=zipkin

while getopts "d" ARG; do
  case ${ARG} in
    d)
      DO_DOCKER='yes'
      ;;
  esac
done

wget -O zipkin.jar 'https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec'

if [[ ${DO_DOCKER} == 'yes' ]]; then
  cp zipkin.jar docker/app.jar
  cd docker/
  docker build -t ${IMAGE_NAME} .
fi

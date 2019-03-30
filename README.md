#!/bin/bash

useradd jenkins -m
docker run \
  -u jenkins \
  --rm \
  -p 50000:50000 \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v /home/jenkins:/var/jenkins_home \
  jenkins/jenkins:lts
cat /home/jenkins/secrets/initialAdminPassword

© 2019 GitHub, Inc.

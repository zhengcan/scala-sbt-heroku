#!/bin/bash

TAGS=scala-sbt-heroku:alpha
docker build -t $TAGS . && docker run -it --rm $TAGS && docker rmi $TAGS

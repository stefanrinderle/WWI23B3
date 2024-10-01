FROM ubuntu:latest
LABEL authors="dansa"

ENTRYPOINT ["top", "-b"]
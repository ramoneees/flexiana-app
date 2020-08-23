# flexiana-app
Flexiana app challange


This is my attempt to resolve the challange for flexiana.

## Running using docker

To run both projects using docker, first build both.

In /flexiana-backend,using a commandline tool type `lein uberjar`.

In /flexiana-frontend, also with a commandline tool, type `lein release`

After building our code and generate our build artifatcs, in the flexiana-app folder type:

`docker-compose up`

It will build the docker images for both projetcs. You can access the frontend using `http://localhost` and `http://localhost:8080` for the backend


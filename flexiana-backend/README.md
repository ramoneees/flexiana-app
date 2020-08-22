# flexiana-backend

FIXME

## Running the app

1. Start the application: `lein run`
2. Go to [localhost:8080](http://localhost:8080/) to see: `Hello World!`
3. Read your app's source code at src/flexiana_backend/service.clj. Explore the docs of functions
   that define routes and responses.
4. Run your app's tests with `lein test`. Read the tests at test/flexiana_backend/service_test.clj.
5. Learn more! See the [Links section below](#links).

### Bulding and image with docker.

1. Build an uberjar of your service: `lein uberjar`
2. Build a Docker image: `sudo docker build -t flexiana-backend .`
3. Run your Docker image: `docker run -p 8080:8080 flexiana-backend`
FROM node:16 AS build

ARG REST_HOST
ARG REST_PORT

WORKDIR /home/node

COPY . ./

RUN echo VUE_APP_REST_HOST=$REST_HOST>.env
RUN echo VUE_APP_REST_PORT=$REST_PORT>>.env

RUN npm install
RUN npm run build

FROM nginx
COPY --from=build /home/node/dist /usr/share/nginx/html
FROM openjdk:8
EXPOSE 8080
ADD target/movie-info-service.jar movie-info-service.jar
ENTRYPOINT [ "java","-jar","/movie-info-service.jar" ]
FROM java:8
EXPOSE 8080
COPY target/demo.jar app.jar
#ADD target/*.jar app.jar
#RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","app.jar"]



#to build - MacBook-Pro-Andrii-2:GasControl andrii$ docker build -t demo .
#to run - docker run -it -p 8080:8080 -t demo  /bin/sh

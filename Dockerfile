FROM java:8
EXPOSE 8080
COPY target/demo.jar app.jar
#ADD target/*.jar app.jar
#RUN sh -c 'touch /app.jar'
#ENTRYPOINT ["java","-jar","app.jar"]

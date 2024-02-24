
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

#FROM alpine:latest

#CMD ["/bin/sh"]



#Define base docker image 
FROM maven:3.8.5-openjdk-17
WORKDIR /EmaiLFormUser
COPY target/EmailFomUser-0.0.1-SNAPSHOT.jar springboot-docker1.jar
ENTRYPOINT ["java", "-jar", "springboot-docker1.jar"]

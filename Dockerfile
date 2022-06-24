FROM openjdk:16
COPY build/ /tmp/
WORKDIR /tmp
#ENTRYPOINT ["java","HelloWorld"]
FROM alpine/java:21.0.3-jdk
VOLUME /tmp
EXPOSE 8080
ARG SECRET-VARIABLE
ENV MY-SUPER-VARIABLE=SECRET-VARIABLE
ARG JAR_FILE=target/BarcodesGen.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
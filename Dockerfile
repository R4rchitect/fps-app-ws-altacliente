#De la imagen que partimos
FROM openjdk:8-jre-alpine

#Zona horaria
RUN apk add --no-cache tzdata
ENV TZ='America/Lima'
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

#Directorio de trabajo
WORKDIR /app

#Copiamos el uber-jar en el directorio de trabajo
COPY target/fps-app-ws-altacliente-0.0.1-SNAPSHOT.jar /app

#Exponemos el puerto 8081
EXPOSE 8081

#Comando que se ejecutará una vez ejecutemos el contendor
CMD ["java","-jar","fps-app-ws-altacliente-0.0.1-SNAPSHOT.jar"]
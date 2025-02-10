# Usa una imagen base de Maven para compilar la aplicación
FROM maven:3.9.2-eclipse-temurin-17 AS builder

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia los archivos del proyecto al contenedor
COPY pom.xml ./
COPY src ./src

# Compila el proyecto y construye el JAR
RUN mvn clean package -DskipTests

# Usa una imagen base ligera para correr la aplicación
FROM eclipse-temurin:17-jdk-jammy

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el JAR compilado desde la fase anterior
COPY --from=builder /app/target/*.jar app.jar

# Expone el puerto que usa la aplicación Spring Boot (generalmente 8081)
EXPOSE 8081

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

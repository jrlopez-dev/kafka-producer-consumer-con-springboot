# Spring Boot + Kafka + Docker 🐳

Este proyecto es un ejemplo de cómo configurar un **Productor y Consumidor en Kafka** utilizando **Spring Boot** y **Docker Compose**.
Tomar en cuenta que debes tener instalado en tu PC docker y tener libre los puertos: 8080, 8081 y 9092. Ya que los contenedores se levantaran en esos puertos.

## 🚀 Tecnologías utilizadas
- **Spring Boot**
- **Apache Kafka**
- **Docker & Docker Compose**
- **H2 Database**
- **Java 17**
- **Maven**

## 📌 Configuración y Ejecución

### 1️⃣ Clonar el repositorio
```sh
git clone https://github.com/tu-usuario/spring-kafka-docker-example.git
cd kafka-producer-consumer-con-springboot

### 2️⃣ Levantar los contenedores
docker-compose up -d

### 3️⃣ Verificar que Kafka está corriendo
docker logs kafka

### 4️⃣ Acceder a la interfaz de Swagger de ambos servicios para interactuar

url de servicio producer: http://localhost:8080/documentacion.html

url de servicio consumer: localhos](http://localhost:8081/documentacion.html


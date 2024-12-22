FROM openjdk:17-jdk-slim
WORKDIR /app
COPY FourDigitNumber.java .
RUN javac FourDigitNumber.java
CMD ["java", "FourDigitNumber"]

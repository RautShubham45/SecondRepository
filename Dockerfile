FROM openjdk:11
COPY . /myapp
WORKDIR /myapp
RUN javac ReverseDigits.java
CMD ["java", "ReverseDigits"]
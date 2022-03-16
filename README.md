
# Dockerize java Application Example
Real example of Dockerize java application. 

### Docker commands 
```sh
FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp/src
RUN javac Main.java
CMD ["java", "Main"]
```
### Build Image 
```sh
docker build -t java-img1 
```
### Run Container 
```sh
docker run --name java-app1 --rm -i  java-img1
```
### YouTube Explaination
 https://youtu.be/vHCP4dANMpo
    
  


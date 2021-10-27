# Timo Redirect

Eine Spring Boot Java Anwendung, die Company Login Anfragen an den Timo24 Server weiterleitet.
Wird für die App verwendet, die Probleme hatte, den Companyserver vom Timo24 zu erhalten (lange Ladezeiten).

 ### Aufbau

Es gibt nur einen Controller (RedirectController.java), der einen HttpClient aufbaut, der die Anfrage an Timo24 weiterleitet


### How to build manually

1. Get Source Code from git 
            
            https://github.com/kadirid/timoRedirect


2. Get Maven Dependencies and run following code from **same directory like pom.xml**

            .\mvnw install

3. After getting all the dependencies, run following code to build a war file

            .\mvnw package

The war file can be deployed in ``tomcat/webapps``
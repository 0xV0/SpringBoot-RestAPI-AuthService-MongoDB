![License: MIT](https://img.shields.io/github/license/MartinExecutionMedia/SpringBoot-RestAPI-AuthService-MongoDB)
![Forks](https://img.shields.io/github/forks/MartinExecutionMedia/SpringBoot-RestAPI-AuthService-MongoDB)
![Stars](https://img.shields.io/github/stars/MartinExecutionMedia/SpringBoot-RestAPI-AuthService-MongoDB?color=fff000)
![Watchers](https://img.shields.io/github/watchers/MartinExecutionMedia/SpringBoot-RestAPI-AuthService-MongoDB?color=%23ff8080)
![Languages](https://img.shields.io/github/languages/count/MartinExecutionMedia/SpringBoot-RestAPI-AuthService-MongoDB)

<br />
<p align="center">
  <h3 align="center">SpringBoot-RestAPI-AuthService-MongoDB</h3>
  <p align="center">
    Ein einfacher Service für die Authentifikation von Nutzern mit JWTs & MongoDB
    <br />
  </p>
</p>

## Start

Ordner anlegen
```
mkdir SpringBoot-RestAPI-AuthService-MongoDB
```
In den Ordner navigieren
```
cd SpringBoot-RestAPI-AuthService-MongoDB
```
Projekt in den Ordner kopieren
```
git clone https://github.com/MartinExecutionMedia/SpringBoot-RestAPI-AuthService-MongoDB/
```

Die **application.properties** Datei solltest du vor dem Start bearbeiten.<br>
Nun kannst du den Ordner (am besten) mit einer IDE öffnen und die **`Application.java`** Datei als **`Java Application`** starten.

## Attention

The system is not yet ready to be used publicly. If you still want to use it, you should test it extensively and fix any errors yourself. You should also change the basic login data in the Application.class file and change the "KEY" to a secure one in JwtUtil.class. I do not assume any liability for the security and functionality of the system.

## Erster Test

Anfrage mit den in der **Application.class** festgelegten Login Daten.

![howtoauth](https://user-images.githubusercontent.com/68571510/129479685-02a43ec2-8c09-46ee-a705-a2bdf6069115.PNG)

Rückgabe des Tokens.

![howtogetjwt](https://user-images.githubusercontent.com/68571510/129479691-e45ca0b4-815c-4636-a715-4e885e1a727d.PNG)

Übergabe des Tokens an den "/helloworld" Endpoint. 

![howtousejwt](https://user-images.githubusercontent.com/68571510/129479692-2d545bd9-93f5-4d03-9e82-d5b3219e7775.PNG)

Antwort vom System.

![howtogethelloworld](https://user-images.githubusercontent.com/68571510/129479695-aec1fa52-9065-4c94-904f-56c6fd784d6c.PNG)


## Im Projekt verwendet

* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Boot Security](https://spring.io/guides/gs/securing-web/)
* [MongoDB](https://www.mongodb.com/)
* [JWT](https://jwt.io/)
* [Gradle](https://gradle.org/)
* [Slf4j](http://www.slf4j.org/)

## ToDo

* Docker hinzufügen 
* Refresh Tokens hinzufügen
* Frontend entwickeln

## Lizenz

Dieses Programm ist mit der `MIT Lizenz` lizenziert.

## Kontakt

Du kannst mich auf DC unter `!Martin#2309` erreichen.


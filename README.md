# BarcodesGen - Back-End with Spring 📷 <img src="https://img.icons8.com/material-outlined/24/000000/barcode.png" alt="JavaScript Logo" width="70" height="30">

This repository serves as back-end for the barcode generation application

## What's inside :
 This README includes the tools, requirements, installing, and how to use the project.

# Table of Contents 🔍
- [Development Tools](#tools) 🛠️
- [Requirements](#requirements) 📦
- [Installation](#installation) 🔄
- [How to use](#utilisation) 📝


# Tools
There are 2 major technologies that we used during the developpement of this app:
* Maven : used as dependency management
* Spring boot : used to create all the functionnalities of the actual app

# Requirements :
If you want to use this app, either change some functionnalities or add new ones, you will need to install java first </br>
Go to this link [JDK 18](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) and install it to run the code

# Installation :
Import the project directory to your IDE and it should download all the necessary dependencies if you are using IntelliJ IDEA, otherwise you will need to go the maven central repository and take everything dependencies there. </br>
Here is the link for the repository : [Maven](https://mvnrepository.com/)

# Utilisation :
If you want to run the application locally, you can run it manually using this command :
   ```sh
   mvn spring-boot:run
   ```
Or you can also just click the run button if you use IntelliJ IDEA as an IDE.

If you want to build an image from it, use the buildpack integrated in spring boot:
   ```sh
   mvn spring-boot:build-image -D spring-boot.build-image.imageName=BarcodesGen
   ```
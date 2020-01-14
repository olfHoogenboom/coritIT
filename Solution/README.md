INSTALLATIE INSTRUCTIE. 

1. DIT PROJECT HEEFT EEN DOCKER DATABASE NODIG!
- installeer docker, en gebruik de volgende command in cmd.
-- docker container run --name coritdb -e POSTGRES_PASSWORD=Secure2Corit -d -p 5432:5432 postgres:alpine
-- docker exec -it coritdb bash
-- psql -U postgres
-- CREATE DATABASE "coritdata";
-- \c coritdata
Klaar!
2. Open de pom als project(voor de zekerheid met Intellij, daar is deze app in gebouwd).
3. zorg dat Intellij java JDK 11 gebruikt.
4. build en ga naar http://localhost:8080/

Je kunt nu naar register navigeren en een account aanmaken.
Daarna naar inloggen met het aangemaakte account.


# DevOps Bootcamp példa alkalmazás

Teljesen minimális, Java-ban írt, Mavennel fordítható Spring Boot (2.7.1) alkalmazás, amivel a Kubernetes onboarding feladatokat tudjuk demonstrálni.

2 REST API végponttal rendelkezik:
* /hello - visszaköszön a _name_ query paraméterben megadott névnek
* /secret - ellenőrzi, hogy a titkos értéket sikerült-e megadni a _secret_ query paraméterben

REST API teszteléséhez mellékelve van egy Postman kollekció is a _test_ mappában, de böngészőből is meghívható.

Konténerizálása már megtörtént az alkalmazásnak, a Dockerfile-ban látható, ez hogyan ment végbe. 
Image build futtatásának előfeltétele, hogy a Maven build végre lett hajtva (*mvn package*).

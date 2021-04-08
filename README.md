(1) Microservicio persist-employee-service 
(2) Microservicio validator-employee-service

En cada carpeta existe un jar, se deben ejecutar ambos en una misma máquina.
El servicio (1) usa el puerto 8080
El servicio (2) usa el puerto 8081

Se requiere un servidor de datos mysql 8+ corriendo en la misma máquina.

Ejemplo de consumo de los microservicios: 

curl --location --request POST 'localhost:8081/employee' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "name",
    "surname": "surname",
    "documentType": "documentType",
    "documentNumber": "documentNumber3",
    "birthdate": "2020-02-01",
    "bondingDate": "2020-02-01",
    "charge": "charge",
    "salary": 15000000
}'



Autor: Gersain Castañeda Muñoz
email: black.gersain@gmail.com
celular: +57 310 218 4276

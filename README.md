# Tasks
1. Udělat abstraktní třídu Vehicle. Ta bude mít jedne atribut "wheels" a bude mít jednu metodu "getWheels", která atribut "wheels" vrátí. Vytvořit abstraktní metodu "washWheels".

2. Udělat třídu "Car", která bude dědit od třídy Vehicle. Správně překreje metodu "washWheels", která bude vypisovat "Car cleaned".

3. Doplnit do třídy Car jeden defaultní konstruktor, který nastaví licensePlate na "Unknown" a počet kol na 0, a jeden konstruktor, který přijme String a int, nastaví "licensePlate" na hodnotu předaného stringu a počet kol na předaný int. Napsat metodu getLicenseplate, která vrátí atribut licensePlate.

4. Vytvořit třídu Motorcycle, která bdue dědit od Vehicle, bude mít dvě kola, překrje abstraktní metody.

5. Implementuj rozhraní MotorCar, které bude mít metodu showMotor()

6. Vytvořit třídy BMW, AUDI, Porsche, které dědí od Car, do třídy Car doplnit rozhraní MotorCar, a mají atribut motor, který vypíšou pomocí showMotor.

7. Vytvoř třídu AutoSalon, která bude mít seznam aut. Ty se načtou ze souboru cars.txt pomocí metody loadCars(String fileName). Každý auto je popsáno 4 řádky, první je typ auta(AUDI, BMW, ..), poznávací značka, počet kol a motor.

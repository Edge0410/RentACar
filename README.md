# Rent-A-Car Web Application using Spring Boot

#### Nume Student: Sandu Eduard Alexandru 
#### Grupa: BDTS - 405

## Descrierea aplicatiei

In aceasta aplicatie Spring Boot vom realiza partea de backend pentru un website de inchiriat masini.
Astfel, utilizatorii autorizati din cadrul acestui business pot vizualiza masinile puse la dispozitie pentru inchiriere, ce vor fi filtrate in functie de disponibilitatea pentru un interval exact de timp (spre exemplu, vrem sa inchiriem unui client o masina in intervalul 23.05.2024-25.05.2024).

## Business requirements

1. Sistemul trebuie sa gestioneze datele despre automobile in functie de marca, model, kilometraj, tip combustibil, pret inchiriere etc.
2. Sistemul trebuie sa gestioneze date despre clientii noi si existenti in functie de nume, prenume, cnp, email, telefon, etc.
3. Utilizatorul trebuie sa poata administra rezervarile (creare, anulare, vizualizare, modificare, filtrare).
4. Utilizatorul trebuie sa poata administra masinile (creare, anulare, vizualizare, modificare, filtrare).
5. Utilizatorii trebuie sa poata vizualiza lista tuturor masinilor disponibile date spre inchiriere.
6. Utilizatorul trebuie sa poata realiza o rezervare a unei masini pe o anumita perioada doar daca masina este disponibila, clientul exista in baza de date si nu are mai mult de 5 masini inchiriate la activ.
7. Sistemul trebuie sa calculeze costul total de rezervare pe baza masinii si al timpului total de inchiriere.
8. Sistemul trebuie sa prevada un audit in format CSV pentru actiunile realizate de utilizator.
9. Utilizatorul trebuie sa poata gestiona o rezervare in derulare (vizualizare, anulare).
10. Utilizatorul trebuie sa poata interoga sistemul cu privire la rezervarile realizate de o persoana anume sau asupra unei masini anume.

### MVP Phase features

- Gestionarea datelor despre masini (CRUD)
- Gestionarea datelor despre rezervari (CRUD)
- Calcularea automata a costului de inchiriere
- Filtrarea caracteristicilor masinilor sau a interactiunii clientelei
- Autorizarea rezervarilor doar pentru masini disponibile si clienti care nu au mai mult de 5 masini inchiriate simultan.

## Baza de date a aplicatiei

![image](https://github.com/user-attachments/assets/ec713199-545c-4e52-8f0f-1b9ea1fddf43)

Se pot observa urmatoarele:

- Tabelele de entitati **users**, **bookings**, **cars**, **payments**, **manufacturers**
- Tabela de **audit**
- Relatiile sunt one to many in mare parte, mai putin intre **bookings** si **cars**, unde acel many-to-many a fost rezolvat printr-o tabela de legatura numita **booked_cars**

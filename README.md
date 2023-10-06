## Events Manager
> This repository is the backend for a Events Manager application.

## Installing

Down below there is a step by step tutorial for the installation of the backend.

### Install project dependencies:

- [Java Development Kit](https://www.oracle.com/br/java/technologies/downloads/#java17)
  - Recommended and stable version is JDK 17.
- [Visual Studio Code](https://code.visualstudio.com/)
  - Recommended.
- [Insomnia](https://insomnia.rest/download)
- [PostgreSQL](https://www.postgresql.org/)
- [pgAdmin](https://www.postgresql.org/)

### Initial Configuration:

It's recommended that you download the Front-End of this project for optimal use of the API funcionalities and program interface.
- [Frontend](https://github.com/steniodocarmo00/frontend-gestaoevento.git)

1. Open the Visual Studio Code cmd and type the following code:
   - git clone https://github.com/joaolira00/Events-Manager-Backend.git

2. Open the Maven dependencies at the bottom left of Visual Studio Code:
   - Click in "Demo".
   - Click in "Lifecyle".
   - Wait for the conclusion of the process, and then click in "Install".

3. Open your pgAdmin, create a database called "events" and connect it to the API in the "application.properties" file.
   - Change the URL, user and password to the ones from your database details. 

4. Open Insomnia:
   - Open "Local Scratch Pad".
   - Create the HTTP requests "GET", "POST" and "PUT" at Insomnia menu.
   - Write "localhost:8080/event" at the URL of the methods.
   - Test your methods at the Insomnia interface.
  
### Connecting to the Frontend:

- The tutorial to connect the API to the Frontend of this application is avaiable [here](https://github.com/steniodocarmo00/frontend-gestaoevento.git).


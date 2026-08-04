¿Cuál es la diferencia entre git merge y git rebase?
 
Merge combina los cambios de dos ramas creando un commit adicional llamado "merge commit". Este commit tiene dos padres: el último commit de la rama actual y el último commit de la rama que se está fusionando.
 
Rebase, por otro lado, reescribe el historial de commits al mover los commits de una rama sobre otra, creando una línea de tiempo lineal. Esto elimina los commits adicionales y hace que el historial sea más limpio y fácil de seguir.
 
¿Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?
Habra un problema de conflicto, el cual toca solucionar, una manera de abortar el merge en el caso que se considere es con git merge –abort. En muchos casos aparecen signos como <<<< === << indicando el problema en relación con las mismas líneas de codigo y las diferencias
 
¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
Git log --grapgh
Explica la diferencia entre un commit y un push.
Guarda los cambios en el repositorio local y el git push nos sirve para subir los cambios al repositorio reomoto
 
¿Para qué sirven git stash y git stash pop?
Git stash lleva los cambios que no han sido guardos en una especie de caja temporal,
Git stash pop para sacarlos nuevamente
 
¿Qué diferencia hay entre HashMap y HashTable?
Un HashMap es no sincronizado, mas rápido en entornos de un solo hilo
Un HashTable es sincronizado, bueno para entornos de varios hilos, permite valors y claves null

07 ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
Lo primero y uno de las cosas importartes del curso es que se reducen las lineas de codigo, yaa comparacion deun bucle tradicional y tambien el Collectors.toMap() se encarga de transformer una coleccion de objetos en un map de manera sencilla .

08 Si usas List con objetos y aplicas stream().map(), ¿qué tipo de operación estás haciendo?
Lo que se esta hacienda en este caso es una trasformacion de de  streams y la salida da otro streams

09 ¿Qué hace stream().filter() y qué retorna?
Lo que esta hacienda es filtrat una lista de obejetos por alguna caracteristica que le definamos en filter

10 Describe el paso a paso para crear una rama desde develop para una funcionalidad nueva.
Si quiero crear una nueva rama debo primeor estar parado en la rama develop, ¿como lo puedo comprobar?, vas a colocar en la consola el comando “git branch” y el devolvera el nombre de la rama en la que estas si estas en develop continuamos, de no ser asi vas a saltar a esa rama con el comando git checkout <nombre de la rama (en este caso develop)>, ahora vamos a escribir git checkout -b <nombre de la nueva rama que queremos crear> y asi creamos una nueva rama desde develop

11 ¿Cuál es la diferencia entre git branch y git checkout -b?
git branch nos dice en que rama estamos y git checkout -b crea una nueva rama desde la rama donde estemos parados

12 ¿Por qué se recomienda usar ramas feature/ en lugar de trabajar directamente en main?
Para evitar conflictos a la hora de hacer merge y porque no es una buena practica porque es la rama por defecto de github, los cambios finales deberian estar en develop

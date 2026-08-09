<h2> Reto #01 culminado </h2>
<p alingn = “center”>
    <div align= “justify”>
        Se subió la solución del reto #1, se adjunta imagen de la salida esperada, con los 
        con los datos de los integrantes.
    </div>
</p>

![Texto alternativo](https://github.com/JoseMartinez883/DOSW-Lab1-2026-INT-JoseMartinez-DanielBarrera/blob/4b0f78c6a2dc1f35aeb91201c264e986cb8ad0d7/Images/evidenciaEjercicio1.png)

<h2> Reto #02 culminado </h2>
<p alingn = “center”>
    <div align= “justify”>
        Se subió la solución del reto #2, se adjunta imagen de la salida esperada.
    </div>
</p>

![Texto alternativo](https://github.com/JoseMartinez883/DOSW-Lab1-2026-INT-JoseMartinez-DanielBarrera/blob/5ab97262b3495466f24a9c59d2a76dc449c780af/Images/evidenciaReto02.png)

<h2> Reto #03 culminado </h2>
<p alingn = “center”>
    <div align= “justify”>
        Se subió la solución del reto #03, se adjunta imagen de la salida esperada.
    </div>
</p>

![Texto alternativo](https://github.com/JoseMartinez883/DOSW-Lab1-2026-INT-JoseMartinez-DanielBarrera/blob/744875e60a358d2d06bf1f6bd5cce9c260e0d425/Images/evidenciaReto03.png)


<h2> Reto #04 culminado </h2>
<p alingn = “center”>
    <div align= “justify”>
        Se subió la solución del reto #04, se adjunta imagen de la salida esperada.
    </div>
</p>

![Texto alternativo](https://github.com/JoseMartinez883/DOSW-Lab1-2026-INT-JoseMartinez-DanielBarrera/blob/44bc28bfad8627fe3afebe008e9242b0a8d327f8/Images/evidenciaReto04.png)


<h2> Reto #05 culminado </h2>
<p alingn = “center”>
    <div align= “justify”>
        Se subió la solución del reto #05, se adjunta imagen de la salida esperada.
    </div>
</p>

![Texto alternativo](https://github.com/JoseMartinez883/DOSW-Lab1-2026-INT-JoseMartinez-DanielBarrera/blob/5491b6fbbe9c3e1421ad5485394252946064306f/Images/evidenciaReto05.png)


<h2> Reto #06 culminado </h2>
<p alingn = “center”>
    <div align= “justify”>
        Se subió la solución del reto #06, se adjunta imagen de la salida esperada.
    </div>
</p>

![Texto alternativo](https://github.com/JoseMartinez883/DOSW-Lab1-2026-INT-JoseMartinez-DanielBarrera/blob/36499c5ca21016a3bcdc8838d3b5d6da3895c175/Images/evidenciaReto06.png)



# Respuestas al cuestionario teorico

## 1. ¿Cuál es la diferencia entre `git merge` y `git rebase`?

**Respuesta:**

`git merge` combina los cambios de dos ramas creando un commit adicional llamado *merge commit*. Este commit tiene dos padres: el último commit de la rama actual y el último commit de la rama que se está fusionando.

`git rebase`, por otro lado, reescribe el historial de commits al mover los commits de una rama sobre otra, creando una línea de tiempo lineal. Esto evita los commits adicionales y hace que el historial sea más limpio y fácil de seguir.

| `git merge` | `git rebase` |
|---|---|
| Combina los cambios de dos ramas. | Reescribe el historial de commits. |
| Puede crear un *merge commit*. | Crea una línea de tiempo lineal. |
| Conserva el historial de las ramas. | Modifica la base de los commits. |

---

## 2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer `merge`?

**Respuesta:**

Se produce un conflicto de merge, el cual debe solucionarse manualmente.

En caso de que se considere necesario cancelar el proceso de merge, se puede utilizar:

    git merge --abort

Durante un conflicto, Git muestra marcas similares a las siguientes:

    <<<<<<<
    =======
    >>>>>>>

Estas marcas permiten identificar las diferencias entre las modificaciones realizadas en las diferentes ramas y determinar qué código debe conservarse.

---

## 3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

**Respuesta:**

Se puede utilizar el siguiente comando:

    git log --graph

Este comando permite visualizar gráficamente el historial de commits y las ramificaciones del proyecto.

---

## 4. Explica la diferencia entre un `commit` y un `push`.

**Respuesta:**

Un `commit` guarda los cambios realizados en el repositorio local.

Por otro lado, `git push` permite subir los cambios del repositorio local al repositorio remoto, por ejemplo, GitHub.

El flujo básico sería:

    Cambios
       |
       v
    git commit
       |
       v
    Repositorio local
       |
       v
    git push
       |
       v
    Repositorio remoto

---

## 5. ¿Para qué sirven `git stash` y `git stash pop`?

**Respuesta:**

`git stash` permite guardar temporalmente los cambios que todavía no han sido guardados mediante un commit.

Posteriormente, `git stash pop` permite recuperar nuevamente esos cambios.

    git stash

Para recuperar los cambios:

    git stash pop

---

## 6. ¿Qué diferencia hay entre `HashMap` y `Hashtable`?

**Respuesta:**

Un `HashMap` no es sincronizado, por lo que generalmente presenta un mejor rendimiento cuando se trabaja en entornos de un solo hilo.

Un `Hashtable`, por otro lado, es sincronizado y puede utilizarse en determinados escenarios donde se requiere acceso sincronizado entre varios hilos.

| Característica | `HashMap` | `Hashtable` |
|---|---|---|
| Sincronización | No | Sí |
| Rendimiento | Generalmente mayor | Generalmente menor |
| Claves `null` | Permite | No permite |
| Valores `null` | Permite | No permite |

---

## 7. ¿Qué ventajas tiene `Collectors.toMap()` frente a un bucle tradicional para llenar un mapa?

**Respuesta:**

Una de las principales ventajas de `Collectors.toMap()` es que permite reducir la cantidad de líneas de código en comparación con un bucle tradicional.

Además, permite transformar una colección de objetos en un `Map` utilizando Java Streams.

Por ejemplo:

    lista.stream()
         .collect(Collectors.toMap(
             objeto -> objeto.getId(),
             objeto -> objeto.getNombre()
         ));

De esta manera, la transformación de una colección a un mapa se realiza de forma declarativa y concisa.

---

## 8. Si usas `List` con objetos y aplicas `stream().map()`, ¿qué tipo de operación estás haciendo?

**Respuesta:**

Se está realizando una operación de transformación.

El método `map()` transforma cada elemento del `Stream` y genera como resultado otro `Stream` con los elementos transformados.

Por ejemplo:

    lista.stream()
         .map(objeto -> objeto.getNombre());

En este caso, cada objeto de la lista se transforma en su nombre.

---

## 9. ¿Qué hace `stream().filter()` y qué retorna?

**Respuesta:**

`filter()` permite filtrar una colección de objetos según una característica o condición determinada.

El resultado de `filter()` es otro `Stream` que contiene únicamente los elementos que cumplen la condición.

Por ejemplo:

    lista.stream()
         .filter(objeto -> objeto.getEdad() >= 18);

En este caso, únicamente pasan al siguiente paso del `Stream` los objetos cuya edad sea mayor o igual a 18.

---

## 10. Describe el paso a paso para crear una rama desde `develop` para una funcionalidad nueva.

**Respuesta:**

Primero se debe comprobar que se está trabajando sobre la rama correcta.

    git branch

Este comando muestra las ramas existentes y señala con `*` la rama en la que se encuentra actualmente el usuario.

Si no se está trabajando en `develop`, se debe cambiar a dicha rama:

    git checkout develop

Una vez ubicados en `develop`, se puede crear la nueva rama y cambiar automáticamente a ella:

    git checkout -b feature/nueva-funcionalidad

El flujo completo sería:

    git branch
    git checkout develop
    git checkout -b feature/nueva-funcionalidad

De esta manera, la nueva rama se crea tomando como punto de partida la rama `develop`.

---

## 11. ¿Cuál es la diferencia entre `git branch` y `git checkout -b`?

**Respuesta:**

`git branch` permite consultar las ramas existentes y comprobar en cuál se está trabajando actualmente.

`git checkout -b` permite crear una nueva rama desde la rama actual y cambiar automáticamente a ella.

| Comando | Función |
|---|---|
| `git branch` | Muestra las ramas existentes y la rama actual. |
| `git checkout -b nombre-rama` | Crea una nueva rama y cambia a ella. |

---

## 12. ¿Por qué se recomienda usar ramas `feature/` en lugar de trabajar directamente en `main`?

**Respuesta:**

Se recomienda utilizar ramas `feature/` para evitar conflictos y mantener una mejor organización del proyecto.

Trabajar directamente sobre `main` no suele ser una buena práctica, ya que esta rama normalmente representa la versión principal y estable del proyecto.

Por esta razón, las nuevas funcionalidades pueden desarrollarse en ramas independientes, por ejemplo:

    feature/login
    feature/gestion-usuarios
    feature/reportes

Una estructura común del proyecto puede ser:

    main
     |
     +-- develop
          |
          +-- feature/login
          |
          +-- feature/gestion-usuarios
          |
          +-- feature/reportes

Esto permite mantener `main` estable y separar el desarrollo de las nuevas funcionalidades.

# Programación Visual - tp5

**Objetivos de aprendizaje:**

* Uso de Git para versionar el código.
* Creación y gestión de repositorios en GitHub
* Uso Git Repositories en STS
* Uso de branchs
* Git Pull, git push, git commit, merge

**Integrantes del grupo RCGS1**

| Nombre y apellido:       | LU   | Usuario GitHub |
| ------------------------ | ---- | -------------- |
| Benicio Roxana           | 3215 |      @3215U         |
| Rojas Rafael Sebastian   | 4292 |      @sebasr41          |
| Mamani Gabriel Alejandro | 4148 |      @gam98          |
| Michel Orlando Cristian  | 4155 |      @mike47k          |

1. Si no posee cuenta en GitHub, cree una nueva cuenta: 

   [github.com](https://github.com	"GitHub")

2. Luego de loguearse al sitio cree un nuevo **repositorio** con el siguiente nombre:

   * repo-nombreGrupo
   * Ejemplo: **repo-GrupoABC1**

   *La creación del repositorio lo debe hacer el responsable del equipo.*

3. En Spring tool suite, en el explorador de proyectos mantenga disponible el Proyecto del **trabajo práctico N° 4.**

4. Habilitar la perspectiva **Git Repositories** (Menú Window - > Show view -> Other -> Git -> Git
   Repositories), luego clone el repositorio creado en GitHub utilizando la opción **Clone a Git repository and add the clone to this view**

5. Haciendo clic derecho en el nombre del proyecto del tp 4 utilice la opción Team -> Share Project y seleccione el repositorio que acaba de clonar

6. Haciendo clic derecho en el nombre del proyecto, opción Team -> Commit, realice el primer commit sobre la rama **main**.

7. El responsable del equipo desde github agregará como colaboradores al resto del equipo.

8. El equipo deberá clonar el repositorio donde se encuentra el proyecto, usando la opción Clone a **Git repository and import existing Maven projects**

9. Luego el responsable del equipo creará desde github un proyecto de tipo template: Basic Kanban. A partir de ese proyecto comenzar a crear issues para los diferentes colaboradores.

10. Cada integrante del equipo deberá crear su correspondiente rama (branch) para poder realizar su tarea.

    Por ejemplo: Crear una rama nueva denominada **req1-model**, ubicado en esa rama comience a realizar modificaciones en el proyecto.

    Agregue la nueva clase en el paquete **model:**

    | **Nombre de clase** |    **atributos**    |
    | :-----------------: | :-----------------: |
    |       Compra        |      id (int)       |
    |                     | producto (Producto) |
    |                     |   cantidad (int)    |
    |                     |   total (double)    |

11. Luego realice el commit para actualizar el repositorio remoto con la nueva rama.

12. Desde el repositorio de GitHub realice el **merge** de la rama **req1-model** a **main.**

13. Luego del merge actualice su repositorio local ubicándose en la rama main y realizando un **pull**

14. Algunas tareas que pueden representar diferentes ramas:

    * **Crear la clase controller para compra**
    * **Crear la interface en service y crear la clase implementadora**
    * **Crear un arrayList para guardar los objetos compras.**
    * **Crear el template para visualizar el formulario de compra.**

    Por cada rama completa realice el merge a main.




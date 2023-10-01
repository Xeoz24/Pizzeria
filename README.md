
# Pizzeria Lalo's

Mini proyecto de la materia de Estructura de Datos en el que se hace la implementacion de varias estructuras de datos (pilas, listas, colas).




## ¿Como funciona?.

Nuestro proyecto se basa en la implementación de las estructura de datos para resolver algún problema de la vida real. Escogimos en este caso, el problema de una pizzaeria, que no tiene como manejar los pedidos hechos por los consumidores en una plataforma digital, y tampoco tiene como buscar las cuentas de sus usarios en dicha plataforma.
## Modo de uso.
- Abrir NetBeans:
- Inicia NetBeans desde tu computadora.
- Abre el proyecto que contiene los paquetes. Asegúrate de tener el proyecto adecuado en NetBeans.
- En el explorador de proyectos de NetBeans, busca el paquete llamado "GUI".
- Haz clic derecho en el archivo "AdministradorGUI.java" que se encuentra dentro del paquete "GUI".
- Selecciona la opción "Ejecutar Archivo" (o "Run File" en inglés).Esto abrirá el formulario "AdministradorGUI" en una ventana separada, el cual administrará la simulación.
- En el formulario "AdministradorGUI", verás diversos campos y componentes gráficos (etiquetas, cuadros de texto, botones, etc.).Completa los campos según las instrucciones o necesidades de tu simulación. 

## Implementación de una lista.

Hemos implementado una funcionalidad que permite la creación y gestión de cuentas en nuestra plataforma mediante una base de datos local. A través de una interfaz gráfica, el usuario tiene la opción de ingresar su correo electrónico o número de teléfono junto con su contraseña para acceder a la plataforma y realizar pedidos. En caso de que el usuario no disponga de una cuenta, se le brinda la opción de crear una nueva.

El proceso de creación de cuenta se lleva a cabo a través de otra interfaz donde se solicitan los datos necesarios para registrar una cuenta. Una vez que se completa este proceso, la cuenta recién creada se almacena en una lista, lo que nos permite mantener un registro de todas las cuentas registradas en la plataforma.

Además, esta lista nos proporciona la capacidad de detectar si alguien intenta crear una cuenta utilizando datos que ya se encuentran registrados en otra cuenta existente. Esto se logra mediante un escaneo exhaustivo de la lista para identificar coincidencias y evitar la duplicación de información de cuentas.

## Implementación de una cola.

Se ha implementado una cola con el propósito de proporcionar a los usuarios una forma de verificar el estado de sus pedidos al momento de realizarlos. Cuando un usuario realiza un pedido, este se coloca en la cola, lo que garantiza que los pedidos se atiendan en orden de llegada. 

El pedido permanecerá en la cola durante un período determinado, tras el cual se contactará al usuario para confirmar si ha recibido su pedido. Si el usuario aún no ha recibido su pedido en ese momento, este no será liberado de la cola hasta que se obtenga una confirmación de entrega por parte del usuario.
## Autores

- [@Ramon Cruz Emanuel](https://github.com/RamonCruzEmanuel)
- [@Naal Eduardo Javier](https://github.com/EduardoNaal)
- [@Rodriguez Torres Fernando Gamaliel](https://github.com/Xeoz24)

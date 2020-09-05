# Procesos de Desarrollo de Software
## Desarrollo Dirigido por Pruebas + DIP + DI + Contenedores Livianos

### Parte I
> * Clonamos el proyecto e implementamos los cascarones del modelo indicado 
> ![image](https://user-images.githubusercontent.com/59893804/92268076-5d456700-eea7-11ea-8e02-6933f17d1e78.png)
> * Implementamos los métodos a partir de las especificaciones generales dadas y hacemos un primer commit. _"especificacion metodos"_

> ![image](https://user-images.githubusercontent.com/59893804/92268423-f6747d80-eea7-11ea-8122-83ec3356f2e6.png)
> 

> * Actualizamos el archivo ```pom.xml``` e incluimos las dependencias y propiedades indicadas.

![image](https://user-images.githubusercontent.com/59893804/92268893-ced1e500-eea8-11ea-9438-bde567fe5106.png)
>
> * Para dichas especificaciones especificamos las clases de equivalencia y condiciones de frontera.
![image](https://user-images.githubusercontent.com/59893804/92273836-b9ad8400-eeb1-11ea-98ae-11842b7653a2.png)
>
> * Para cada clase de equivalencia y condición de frontera implementamos pruebas.
![image](https://user-images.githubusercontent.com/59893804/92274021-1dd04800-eeb2-11ea-85fa-e88332ac1e1e.png)

> * Hacemos el commit respectivo _"implementación pruebas"_
![image](https://user-images.githubusercontent.com/59893804/92269482-dcd43580-eea9-11ea-9217-219785df1fb3.png)
>
> * Finalizamos con el commit _"implementación del modelo"_
![image](https://user-images.githubusercontent.com/59893804/92273979-05f8c400-eeb2-11ea-8b79-c8d7143ab6f3.png)
>


### Parte II
> * Incorporamos el Contenedor Liviano ```GoogleGuice``` el cual soporta la inyección de dependencias. 
![image](https://user-images.githubusercontent.com/59893804/92294232-ef715d80-eeef-11ea-9d0a-7335229dd815.png)
>

> * Modificamos la inyección de dependencias utilizando guice en lugar del método fábrica
![image](https://user-images.githubusercontent.com/59893804/92294347-095f7000-eef1-11ea-9b5a-379e6a4f5532.png)
>

> * Mediante la configuración de la Inyección de Dependencias cambiamos el comportamiento.
![image](https://user-images.githubusercontent.com/59893804/92294429-ceaa0780-eef1-11ea-9f32-1533e6bc78b7.png)
>

> * Finalmente vemos la ejecucion grafica del juego 
![image](https://user-images.githubusercontent.com/59893804/92294465-1e88ce80-eef2-11ea-9bfe-d886e05f1b63.png)
![image](https://user-images.githubusercontent.com/59893804/92294477-32343500-eef2-11ea-9f23-717570e86a56.png)
![image](https://user-images.githubusercontent.com/59893804/92294642-6a3b7800-eef2-11ea-94a5-a8ab6e68064c.png)
>

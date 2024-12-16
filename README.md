# Trabajo Estadisticas NBA 🏀

_El repositorio consiste en una aplicación que sirve para recoger y mostrar
estadísticas sobre partidos de la NBA de distintas formas._

## Datos del proyecto 📋

__El programa está siendo desarrollado en NetBeans:__
> Project: Java With Maven -> Java Aplication

__Las dependencias hay que añadirlas al archivo pom.xml__

```
<dependencies>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi</artifactId>
        <version>4.1.2</version>
    </dependency>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>4.1.2</version>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.6.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>com.itextpdf</groupId>
        <artifactId>itextpdf</artifactId>
        <version>5.5.13.3</version>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-params</artifactId>
        <version>5.6.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.6.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.netbeans.external</groupId>
        <artifactId>AbsoluteLayout</artifactId>
        <version>RELEASE190</version>
    </dependency>
    <dependency>
        <groupId>org.jfree</groupId>
        <artifactId>jfreechart</artifactId>
        <version>1.5.3</version>
    </dependency>
</dependencies>
```


## Versión 1.0:
  Interfaz que calcula el %FG y el %eFG de un jugador y va rellenando en un Excel cada uno de los cálculos realizados.
  https://unaneuronaparacadadeporte.com/2015/07/19/estadisticas-nba-fg-vs-efg/

## Versión 1.5: 
  También calculará el %TS, para lo que nos harán falta los tiros libres. En la hoja de cálculo generada habrá una última fila en la que pondrá las medias.

## Versión 2.0: 
  Calcula también la valoración para lo que tendremos que añadir los datos necesarios. Como sugerencia, se recomienda el uso de tabbed panes, con el fin de agrupar datos.

## Versión 3.0: 
  Cambia el programa para que se puedan añadir las estadísticas para cinco jugadores diferente de dos equipos diferentes. 
  Para esto se recomienda listas desplegables dinámicas o menús dinámicos. Tiene que haber un archivo por cada equipo y una hoja por cada jugador. 
  También tiene que haber una hoja final con las medias de todos los jugadores.

## Versión 4.0: 
  Poned un botón que sea  para crear un gráfico de barra con los puntos del jugador seleccionado, siendo cada una de las barras uno de sus partidos. 
  Dad formato al gráfico y haced que se sobrescriba si se genera varias veces para el mismo jugador.

## Versión 4.5: 
  Haced también una gráfica de líneas para los rebotes y añadid a la de los puntos una de líneas donde salga la media de los puntos de ese jugador. 
  Meted las gráficas en una carpeta que se llame "gráficas" y que dentro tenga una carpeta para cada jugador.

## Versión 5.0: 
  Tiene que generar un PDF para el jugador seleccionado. En este, tiene que salir el nombre del jugador y del equipo, así como los gráficos para puntos, rebotes y 
  asistencias de la misma forma que hicimos la de puntos en la versión 4.5. Para acabar, hay que poner una sección que ponga "Otras estadísticas" en la que salgan en 
  texto sus medias de triples metidos por partido, de %FG, de %eFG y de %TS, saliendo colocados en dos líneas (como si fuesen dos columnas pero sin las líneas de tabla). 
  Todo tiene que coger en una hoja y la ventana de la aplicación no se podrá hacer más pequeña que el tamaño mínimo para recoger todos los componentes.

## Muchas gracias por tomar el tiempo de leer esto 🎁
-    Comenta a otros sobre este proyecto 📢
-    Con ❤️ por [marcosplaza0](https://github.com/marcosplaza0)

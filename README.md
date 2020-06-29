# PracticaDeLaboratorio05-GestionDeTickets-Parqueadero
En esta practica se desarrollo una aplicación que permita el registro de Tickets en un parqueadero de vehículos.

### Lenguaje

+ Java = JDK 1.8
+ IDE = NetBeans Apache 11.3

### Librerias

+ java.awt.Button ;
+ java.awt.Frame;
+ java.awt.Label;
+ java.awt.Panel;
+ java.awt.Color;
+ java.util.Locale;
+ java.util.ResourceBundle;
+ java.time.LocalDateTime;
+ javax.swing.JOptionPane;
+ javax.swing.JTextField;
+ javax.swing.table.DefaultTableModel;
+ javax.swing.table.TableColumnModel;
+ java.util.Collection;
+ java.util.HashMap;
+ java.util.Map;

## Realizacion de la practica

+ Para desarrollar esta práctica implementamos los patrones de diseño MVC y DAO usando la interfaz gráfica Swing de Java.

•	En el paquete modelo creamos las clases Vehículo, Cliente y ticket.

        Cliente (en la cual implementamos una lista de vehículos):

        Vehículo (Agregamos un atributo Cliente):

        Ticket (Agregamos un Atributo fracciones):

+ En el paquete idao implementamos las interfaces IDAO para cada clase (Vehículo, Cliente, Ticket) y creamos las clases DAO que implementan cada IDAO.

+	Para almacenar los datos usamos un diccionario para cada clase (Vehículo, Cliente, Ticket).

+	En el paquete controlador creamos una clase controlador para cada una de las clases (Vehículo, Cliente, Ticket) en las cuales se instancia el DAO y se crean los métodos crear, buscar y actualizar.

+	En el paquete vista se crearon las ventanas con la interfaz gráfica Swing de java

![image](https://user-images.githubusercontent.com/65028395/85976647-97beef00-b9a0-11ea-9661-747c93100158.png)

+ Diseñamos la interfaz gráfica:

+ Ventana Principal
En esta ventana creamos un menú usando el JMenuBar y tres botones los cuales nos servirán para registrar la Entrada de un vehículo a través de un ticket, la salida de un vehículo y otro para listar dichos tickets


![image](https://user-images.githubusercontent.com/65028395/85976741-c89f2400-b9a0-11ea-9e4c-e34b09223be2.png)


+ Ventana Registrar Entrada
Esta ventana nos servirá para crear un ticket y además creamos un botón para crear un vehículo y una tabla en la que se visualizará los vehículos creados anteriormente

![image](https://user-images.githubusercontent.com/65028395/85976796-e40a2f00-b9a0-11ea-8b58-e71ff3baf84d.png)

+ Ventana Crear vehículo:
Esta ventana nos servirá para crear un vehículo y además creamos un botón para crear un cliente y una tabla en la que se visualizará los clientes creados anteriormente

![image](https://user-images.githubusercontent.com/65028395/85976826-f7b59580-b9a0-11ea-8249-1a774ba72277.png)

+ Ventana Crear Cliente
Esta ventana nos servirá para crear un Cliente

![image](https://user-images.githubusercontent.com/65028395/85976865-0ac86580-b9a1-11ea-97de-cc2773facedd.png)


+ Diseñamos la interfaz gráfica para el momento de la salida de un vehículo.
Para la cual el usuario deberá ingresar el número de ticket y se mostrará toda la información de ese ticket


![image](https://user-images.githubusercontent.com/65028395/85976891-216ebc80-b9a1-11ea-9e5c-debfbc37bfc3.png)

Una vez ingrese el número de ticket se muestran todos los datos y se calcula el total a pagar:


![image](https://user-images.githubusercontent.com/65028395/85976934-36e3e680-b9a1-11ea-8a18-928944837cc7.png)

+ Creamos la interfaz grafica para listar los tickets:
En la cual al momento de seleccionar un ticket de la tabla se mostrará los datos relacionados con dicho ticket


![image](https://user-images.githubusercontent.com/65028395/85976973-4ebb6a80-b9a1-11ea-986c-dd804a7f20d9.png)

+ En el menú principal creamos una opción para cambiar el idioma y otra para cambiar el color de fondo

![image](https://user-images.githubusercontent.com/65028395/85977033-6692ee80-b9a1-11ea-90ba-eff709268591.png)

![image](https://user-images.githubusercontent.com/65028395/85977074-7ad6eb80-b9a1-11ea-8525-d402c1bd22fc.png)








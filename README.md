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

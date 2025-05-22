# Talento_tech_Java - Melany Ascencio 
¡Bienvenido a mi Proyecto para el curso de Talento Tech Java! 
Esta es mi pre-entrega donde aplico los conceptos fundamentales de Java para construir una aplicación de gestión de productos y pedidos.

Requerimientos técnicos:

Tipos de datos y variables. 
Colecciones (Arrays, Listas). 
POO y Colaboración de Clases.
Herencia/Polimorfismo (opcional para extender). 
Paquetes/módulos (organización de código). 
Excepciones: Manejar errores con try/catch. 



💡 Ejemplo de flujo de uso (escenario) 

Inicio de la Aplicación: Al ejecutar el programa, se presentará el siguiente menú principal:

1) Agregar Producto

2) Listar Productos

3) Buscar/Actualizar Producto

4) Eliminar Producto

5) Crear Pedido

6) Listar Pedidos

7) Salir

Selecciona “1” para Agregar Producto. El programa pregunta el nombre, precio, stock. Se crea un objeto Producto y se agrega a la lista.

Selecciona “2” para Listar Productos, y el sistema muestra todos los productos con su id, nombre, precio, stock.

Selecciona “5” para Crear Pedido. El sistema pregunta cuántos productos va a agregar, pide ID de producto y cantidad. Verifica stock; si no hay suficiente, lanza StockInsuficienteException o un mensaje apropiado. Si se confirma, descuenta stock y crea el pedido en la colección de pedidos.

Selecciona “7” para Salir. El programa finaliza.

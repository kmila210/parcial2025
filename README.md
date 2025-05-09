Examen Parcial - Programación III
Parte 1: Diagrama de Clases (40 minutos)
Elaborar un diagrama de clases simplificado en base al siguiente enunciado:
Una Inmobiliaria gestiona diferentes tipos de Inmuebles. Los inmuebles pueden ser Casa o
Departamento (ambos heredan de Inmueble). A su vez, la clase Casa puede especializarse en
CasaRural y CasaUrbana.
Toda clase Inmueble tiene un precio, dirección y un método para calcular el impuesto de venta
(polimórfico).
La clase Agente es responsable de vender los inmuebles y debe implementar la interfaz
IVendible, la cual declara el método vender().
Un Agente puede vender múltiples inmuebles, pero cada inmueble sólo puede estar asociado a
un agente a la vez.
Relaciones:
La interfaz IVendible es implementada por la clase Agente.
Las clases Casa y Departamento heredan de Inmueble.
Las clases CasaRural y CasaUrbana heredan de Casa.
Existe una asociación 1:N entre Agente e Inmueble.
1/2
Examen Final - Programación III - 3er Año
08/05/2025
Facultad de Ingeniería - Licenciatura / Ingeniería en Informática
Parte 2: Implementación en Java (2 horas 20 minutos)
1. Implementa todas las clases y la interfaz siguiendo el diagrama de clases proporcionado.
2. Aplica encapsulamiento: atributos privados y acceso mediante getters/setters.
3. Implementa el método calcularImpuesto() de manera polimórfica en las subclases de
Inmueble. Ejemplo: la CasaRural puede tener un impuesto del 5% y el Departamento un
8%.
a. ¿Es necesario utilizar el operador instanceOf? ¿Por qué?
4. La clase Agente debe implementar la interfaz IVendible y en el método vender() debe
mostrar en consola los detalles del inmueble vendido.
5. Asocia inmuebles a un agente usando una colección apropiada.
6. Crea un método main donde:
a. Crear al menos un agente.
b. Crear al menos un inmueble de cada tipo (CasaRural, CasaUrbana,
Departamento).
c. Asociar los inmuebles al agente.
d. Llamar al método vender() mostrando detalles de cada venta y el impuesto
aplicado.
7. ¿Alguna clase es o puede ser abstracta? justificar.

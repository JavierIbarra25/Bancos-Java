Ejercicio: Sistema de Gestión de Vehículos
Implementa en Java una aplicación que simule el funcionamiento de un concesionario de vehículos según los siguientes requisitos:

Clase base abstracta: Vehiculo
Atributos:

matricula (String): Identificador único del vehículo

kilometros (double): Kilómetros recorridos

Atributo común constante IVA (valor 21%)

Métodos:

Consultar atributos (getters)

añadirKilometros(double km): Añade kilómetros (positivos o negativos)

realizarViaje(double km): Añade kilómetros solo si son positivos

reducirKilometros(double km): Reduce kilómetros solo si son positivos

Método abstracto calcularMantenimiento()

toString() para mostrar datos del vehículo

Subclases:
Coche:

Calcula mantenimiento: 0.10€ por km + IVA

Camion:

Atributo constante final KM_MINIMO (valor 50,000 km)

Calcula mantenimiento:

Si km < KM_MINIMO: 0.15€ por km + IVA

Si km >= KM_MINIMO: 0.25€ por km + IVA

Requisitos adicionales:
Implementa el método toString() en todas las clases

Crea una clase principal con método main() para probar:

Crea varios vehículos de cada tipo

Realiza viajes y ajustes de kilometraje

Calcula costes de mantenimiento

Muestra los datos como en el ejemplo:
--- 
### Vehículos creados  
**Coche**  
- Matrícula: `1234ABC`  
- Kilómetros: `0.0`  

**Camión**  
- Matrícula: `5678DEF`  
- Kilómetros: `0.0`  

---  
### Después de viajes  
**Coche**  
- Matrícula: `1234ABC`  
- Kilómetros: `1500.0`  

**Camión**  
- Matrícula: `5678DEF`  
- Kilómetros: `52000.0`  

---  
### Costes de mantenimiento  
| Vehículo  | Matrícula | Coste       |
|-----------|-----------|-------------|
| Coche     | 1234ABC   | **181.5€**  |
| Camión    | 5678DEF   | **15730.0€**|

¿Para qué sirve el método toString() en este contexto?

Estructura similar al ejercicio del banco:
Clase abstracta base con atributos comunes

Método abstracto para cálculo específico

Subclases con implementaciones diferentes

Atributo constante común

Operaciones básicas compartidas

Método para representación textual

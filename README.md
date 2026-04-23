
# Examen Herencia y ArrayList

## Gestión de Vehículos de Alquiler
### Control de coches y motos en una empresa de alquiler
#### Escenario

Una empresa de alquiler de vehículos desea gestionar su flota. Dispone de distintos tipos de vehículos, como coches y motos, que comparten información común como matrícula, marca y kilómetros recorridos.

Sin embargo, la empresa quiere calcular los kilómetros acumulados de forma diferente según el tipo de vehículo:

    En los coches, los kilómetros se contabilizan de forma directa (relación 1:1).
    En las motos, los kilómetros se ajustan aplicando un factor de 1.5 (relación 1:1.5).

Para gestionar todos los vehículos, la empresa utiliza una clase gestora que almacena todos los objetos en una colección común. Esta clase permitirá añadir, buscar, eliminar vehículos y calcular el total de kilómetros acumulados aplicando el comportamiento específico de cada tipo.


### Instrucciones


- Crear una clase padre abstracta Vehiculo con los atributos:
  - matricula
  - marca
  - kilometros
  - Definir:
    - Constructor
    - Getters necesarios
    - Método double calcularKilometros()
  - Método toString()
- Crear las clases hijas:
  - Coche
  - Moto 
  - En ambas clases hijas:
    - Llamar al constructor del padre mediante super().
    - Sobrescribir el método calcularKilometros():
      - Coche → devuelve los kilómetros tal cual.
      - Moto → devuelve kilómetros × 1.5.
    - Sobrescribir toString() reutilizando el del padre.
- Crear una clase gestora EmpresaAlquiler con:
  - Un ArrayList<Vehiculo>
  - Implementar los siguientes métodos:
    - void agregarVehiculo(Vehiculo v)
    - Vehiculo buscarVehiculo(String matricula)
    - boolean eliminarVehiculo(String matricula)
    - double calcularKilometrosTotales() → debe recorrer la lista y usar calcularKilometros()

| Apartado | Puntos | 
| --- | --- |
| Clase padre | 2 |
| Clases hijas | 3 |
| Clase gestora | 3 |
| Polimorfismo | 1 |
| Main | 0,5 | 
| Claridad | 0,5 | 
| TOTAL | 10 |


## Ejecución y salida

Desde la clase principal:
- Crear un objeto EmpresaAlquiler.
- Añadir al menos 3 vehículos (mezclando coches y motos).
- Buscar un vehículo por matrícula.
- Eliminar un vehículo.
- Mostrar el total de kilómetros acumulados.

La salida debe mostrar información de los vehículos y el resultado del cálculo total, comprobando que se aplica correctamente el comportamiento polimórfico.

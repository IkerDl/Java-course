# Resumen de Conceptos de Java

Este documento contiene un repaso de los principales conceptos de **Java** enfocados en la programación orientada a objetos (POO), estructuras de control, tipos de datos y herramientas útiles. Está diseñado como material de estudio para repasar antes de un examen.

## Tabla de Contenidos
1. [Tipos de Datos en Java](#1-tipos-de-datos-en-java)
2. [API de Java y JDK](#2-api-de-java-y-jdk)
3. [Programación Orientada a Objetos (POO)](#3-programación-orientada-a-objetos-poo)
4. [Polimorfismo y Herencia](#4-polimorfismo-y-herencia)
5. [Estructuras de Control](#5-estructuras-de-control)
6. [Clases y Métodos](#6-clases-y-métodos)
7. [Mutabilidad](#7-mutabilidad)
8. [Casteo y Boxing](#8-casteo-y-boxing)
9. [Clases Abstractas](#9-clases-abstractas)
10. [Polimorfismo de Asignación](#10-polimorfismo-de-asignación)
11. [Interfaces](#11-interfaces)
12. [Enumeradores](#12-enumeradores)
13. [Diferencia entre Arrays y ArrayList](#13-diferencia-entre-arrays-y-arraylist)
14. [JOptionPane](#14-joptionpane)
15. [Métodos Estáticos](#15-métodos-estáticos)
16. [Herramientas](#16-herramientas)
17. [Firma del Método](#17-firma-del-método)
18. [Sobreescritura y Sobrecarga](#18-sobreescritura-y-sobrecarga)
19. [Clases Abstractas y Métodos Abstractos](#19-clases-abstractas-y-métodos-abstractos)

## 1. Tipos de Datos en Java

### Tipos Primitivos
- **Enteros**: `byte`, `short`, `int`, `long`
- **Punto Flotante**: `float`, `double`
- **Booleano**: `boolean` (true o false)
- **Caracteres**: `char` (carácter Unicode)

### Objetos
Los objetos (como `String` o `ArrayList`) se almacenan en el **heap** y son referenciados desde el **stack**.

---

## 2. API de Java y JDK

- **API**: Conjunto de clases y métodos disponibles en Java (ej: `Math`, `String`).
- **JDK (Java Development Kit)**: Herramientas de desarrollo como el compilador y otras utilidades (`javac`, `jar`).

---

## 3. Programación Orientada a Objetos (POO)

### Constructores
Métodos para inicializar objetos al momento de su creación.

### Modificadores de Acceso
- `public`, `private`, `protected`

### Getters y Setters
Permiten acceder y modificar atributos privados de una clase de manera controlada.

### Sobreescritura (@Override)
Modifica el comportamiento de un método heredado de una clase padre.

---

## 4. Polimorfismo y Herencia

### Herencia
Permite que una clase hija herede atributos y métodos de una clase padre.

### Polimorfismo
Un objeto puede comportarse de múltiples formas según su contexto.

### Sobrecarga de Métodos
Definir varios métodos con el mismo nombre, pero con diferentes parámetros.

---

## 5. Estructuras de Control

- **`for`**: Iteración con un número determinado de repeticiones.
- **`for-each`**: Iteración sobre colecciones.
- **`do-while`**: Ejecuta al menos una vez antes de verificar la condición.

---

## 6. Clases y Métodos

### Métodos Estáticos
Métodos que pertenecen a la clase, no a una instancia. Ejemplo: `Math.sqrt(25)`.

### Equals y HashCode
Importante sobrescribir estos métodos al trabajar con colecciones que usan hash (ej: `HashMap`).

---

## 7. Mutabilidad

- **Objetos Inmutables**: No cambian después de ser creados (ej: `String`).
- **Objetos Mutables**: Pueden modificar su estado después de ser creados (ej: `ArrayList`).

---

## 8. Casteo y Boxing

### Casteo
Convertir un tipo de dato a otro:
double d = 9.7;
int i = (int) d;  // Casteo de double a int

Boxing y Unboxing
Conversión entre tipos primitivos y sus equivalentes en clases envolventes (ej: int y Integer).


## 9. Clases Abstractas
No se pueden instanciar. Pueden contener métodos abstractos que deben ser implementados por las subclases.

## 10. Polimorfismo de Asignación
Permite que una variable de tipo padre apunte a un objeto de tipo hijo y se comporte como el hijo.

Código
Animal animal = new Perro();
animal.emitirSonido();  // Ladrido

## 11. Interfaces
Definen métodos abstractos que deben ser implementados por las clases. Una clase puede implementar múltiples interfaces.

## 12. Enumeradores
Definen un conjunto de valores constantes predefinidos:
Código: 
public enum Dias { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES }

## 13. Diferencia entre Arrays y ArrayList
Array: Tamaño fijo, tipos homogéneos.
ArrayList: Tamaño dinámico, permite agregar/eliminar elementos.

## 14. JOptionPane
Utilizado para crear cuadros de diálogo.
Código:
String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
JOptionPane.showMessageDialog(null, "Hola " + nombre);

## 15. Métodos Estáticos
Solo pueden acceder a otros métodos o propiedades estáticas dentro de la clase. No requieren de una instancia para ser llamados.

## 16. Herramientas
Polypane: Visualización de interfaces en diferentes resoluciones.
Figma to Code: Convierte diseños de Figma a código.
Insomnia: Cliente para probar APIs.
Sentry: Monitoreo de errores en producción.
Emmet: Atajos para escribir HTML/CSS de manera rápida.

## 17. Firma del Método
La firma de un método incluye su nombre y parámetros. Ejemplo:
Código: 
public void miMetodo(int a, String b) { ... }

## 18. Sobreescritura y Sobrecarga
Sobreescritura (@Override): Modifica un método heredado.
Sobrecarga: Definir múltiples métodos con el mismo nombre, pero diferentes parámetros.

## 19. Clases Abstractas y Métodos Abstractos
Las clases abstractas no se pueden instanciar y pueden tener métodos abstractos. Los métodos abstractos deben ser implementados por las subclases.


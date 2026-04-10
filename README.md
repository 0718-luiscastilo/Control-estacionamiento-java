# Control-estacionamiento-java
# 🚗 Sistema de Control de Estacionamiento en Java

## Descripción

Este proyecto es una aplicación de consola desarrollada en **Java** que simula el funcionamiento básico de un sistema de estacionamiento.

Permite registrar múltiples vehículos, calcular el tiempo de estancia y determinar el costo a pagar en función de una tarifa por hora. Además, implementa validaciones y reglas de negocio como descuentos según el tiempo de uso.

Este proyecto está enfocado en reforzar conceptos fundamentales de programación mediante un caso práctico del mundo real.

---

## ⚙️ Funcionalidades

* Registro de múltiples vehículos
* Ingreso de hora de entrada y salida
* Validación de datos (la hora de salida debe ser mayor a la de entrada)
* Cálculo automático de horas estacionadas
* Aplicación de tarifa por hora
* Aplicación de descuentos:

  * 20% de descuento si el tiempo es mayor a 5 horas
  * Tarifa mínima para estancias cortas
* Cálculo del total por vehículo
* Cálculo del total general acumulado

## 🧠 Conceptos aplicados

* Variables y tipos de datos
* Operadores aritméticos
* Estructuras de decisión (`if`, `else`)
* Bucles (`while`)
* Entrada y salida de datos (`Scanner`)
* Validación de datos
* Acumuladores



## 📊 Ejemplo de uso

Ingrese el numero de vehiculos: 1
Ingrese la Hora de entrada de Vehiculo 1: 10
Ingrese la Hora de Salida de Vehiculo 1: 16

Horas estacionado: 6
Costo sin descuento: 300
Descuento aplicado: 20%
Total a pagar: 240

## 🎯 Objetivo del proyecto

Este proyecto forma parte de un proceso de aprendizaje en desarrollo de software, con el objetivo de:

* Aplicar lógica de programación en problemas reales
* Comprender el flujo de datos en aplicaciones
* Desarrollar buenas prácticas desde etapas iniciales

## 🚀 Mejoras futuras

* Uso de funciones/métodos para modularizar el código
* Implementación de arreglos o listas
* Interfaz gráfica (GUI)
* Persistencia de datos (archivos o base de datos)
* Manejo de fechas y horas reales

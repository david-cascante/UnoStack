# 🚀 UnoStack

<p align="center">
  <b>El gestor de entornos de desarrollo local simple, moderno y open source.</b>
</p>

<p align="center">
  Administra tus servicios de desarrollo desde un solo lugar: bases de datos, servidores web, runtimes y herramientas necesarias para construir software.
</p>

---

## 📌 ¿Qué es UnoStack?

UnoStack es una herramienta open source diseñada para simplificar la creación y administración de entornos de desarrollo locales.

La idea nace de un problema común entre desarrolladores:

> "Quiero empezar a programar, no perder horas configurando mi ambiente."

Muchas herramientas actuales requieren configuraciones manuales, archivos difíciles de encontrar, múltiples instaladores y solución de errores que distraen del verdadero objetivo: desarrollar software.

UnoStack busca ofrecer una experiencia simple:

```
Instalar → Configurar → Programar
```

Sin configuraciones innecesarias.

---

# ✨ Características principales

## 🖥️ Administración de servicios

Gestiona tus herramientas desde una interfaz sencilla:

* Iniciar servicios.
* Detener servicios.
* Reiniciar servicios.
* Ver estado actual.
* Revisar logs.
* Administrar configuraciones.

Ejemplo:

```
PostgreSQL

Estado: 🟢 Ejecutándose

Puerto:
5432

[Detener] [Logs] [Configuración]
```

---

## 📦 Instalación simplificada

Instala las herramientas que necesitas sin procesos complicados:

* PostgreSQL
* MySQL / MariaDB
* MongoDB
* Redis
* Apache
* PHP
* Node.js
* Otros servicios mediante plugins

Selecciona:

```
☑ PostgreSQL
☑ Apache
☑ PHP

[Instalar]
```

Y UnoStack se encarga del resto.

---

## ⚙️ Configuración sencilla

Las configuraciones técnicas deben estar ocultas cuando no son necesarias.

Ejemplo:

Cambiar puerto de PostgreSQL:

```
Puerto actual:
5432

Nuevo puerto:
5433

[Guardar]
```

UnoStack realiza automáticamente:

* Actualización de archivos de configuración.
* Validación del puerto.
* Reinicio del servicio.
* Confirmación del cambio.

---

## 🧩 Sistema de plugins

UnoStack está diseñado para ser extensible.

Cada servicio funciona como un módulo independiente:

```
plugins/

├── postgresql
├── mysql
├── mongodb
├── apache
└── redis
```

La comunidad podrá crear nuevos módulos sin modificar el núcleo del programa.

---

# 🎯 Objetivos del proyecto

UnoStack busca:

✅ Crear una alternativa moderna a herramientas tradicionales.

✅ Reducir la complejidad de configurar entornos locales.

✅ Mejorar la experiencia de estudiantes y desarrolladores nuevos.

✅ Crear una herramienta libre construida por y para desarrolladores.

---

# 🛠️ Tecnologías

*(En desarrollo)*

Posibles tecnologías:

## Core

* Java / Kotlin
* Gestión de procesos del sistema.
* Sistema modular.
* Motor de configuración.

## Interfaz

* JavaFX
* Kotlin Compose Desktop
* Otra tecnología multiplataforma.

## Compatibilidad

Objetivo inicial:

* Windows

Futuras plataformas:

* Linux
* macOS

---

# 🏗️ Arquitectura

UnoStack está diseñado siguiendo una arquitectura modular:

```
                 UnoStack UI

                     │

              Core Engine

                     │

        ┌────────────┼────────────┐

   PostgreSQL     MySQL       MongoDB
    Plugin       Plugin       Plugin
```

El núcleo administra:

* Procesos.
* Descargas.
* Configuración.
* Estado de servicios.

Los plugins definen cómo funciona cada tecnología.

---

# 🗺️ Roadmap

## Versión 0.1 - Core inicial

* [ ] Crear interfaz base.
* [ ] Sistema de servicios.
* [ ] Ejecutar procesos locales.
* [ ] Mostrar estado.
* [ ] Sistema de logs.

---

## Versión 0.2 - Primer servicio

* [ ] Soporte para PostgreSQL.
* [ ] Iniciar/detener PostgreSQL.
* [ ] Cambiar puerto.
* [ ] Gestión básica de configuración.

---

## Versión 0.3 - Más tecnologías

* [ ] MySQL.
* [ ] MongoDB.
* [ ] Redis.
* [ ] Apache.
* [ ] PHP.

---

## Versión 1.0 - Ecosistema UnoStack

* [ ] Sistema completo de plugins.
* [ ] Instalación automática.
* [ ] Gestión de versiones.
* [ ] Configuración por proyecto.
* [ ] Documentación completa.

---

# 🤝 Contribuir

UnoStack es un proyecto abierto.

Las contribuciones son bienvenidas:

* Reportar errores.
* Proponer funcionalidades.
* Crear plugins.
* Mejorar documentación.
* Enviar pull requests.

Antes de contribuir:

1. Lee la documentación.
2. Revisa los issues abiertos.
3. Explica tu propuesta.

---

# 📄 Licencia

Este proyecto será publicado bajo una licencia open source.

Licencia planeada:

MIT License

---

# 💡 Filosofía

UnoStack existe por una razón:

> Los desarrolladores deberían dedicar su tiempo a crear software, no a pelearse con configuraciones.

Simple.
Rápido.
Libre.

---

<p align="center">
  Construido con ❤️ por desarrolladores, para desarrolladores.
</p>

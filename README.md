# Principios SOLID en Spring Boot

Breve descripción de los principios SOLID..

## Principio de Responsabilidad Única (SRP)

> Una clase debe hacer una cosa y, por lo tanto, debe tener una sola razón para cambiar.


Donde vemos este principio

![SRP](SOLID/SRP.jpg)

## **Bloques de código**
```java
package edu.uday.coa.controller;

@RestController
@RequestMapping(value = "/licienciatura")
@Log4j2
public class LicenciaturaController {
    @Autowired
    private LicenciaturaService licenciaturaService;

    @GetMapping
    public ResponseEntity<?> getAllLicenciatura() {
        try {
            return ResponseEntity.ok().body(licenciaturaService.getAllLicenciaturas());
        }catch (COAException ex){
            log.warn("Sin datos");
            log.error(ex);
            return new ResponseEntity<>("datos no encontrados", HttpStatus.OK);
        } catch (Exception e) {
            log.error(e);
            throw new RuntimeException(e);
        }
    }

    @PostMapping
    public Licenciatura createLiceciatura(@RequestBody Licenciatura licenciatura){
        log.info("Kardex  a guardar: "+licenciatura.toString());
        return licenciaturaService.createLicenciatura(licenciatura);
    }

    @PutMapping("/{revoe}")
    public ResponseEntity<?> updateLicenciatura(@RequestBody Licenciatura licenciatura, @PathVariable(value = "revoe")String revoe) {
        log.info("Licenciatura a actualizar :"+licenciatura.toString());
        try {
            return  ResponseEntity.ok().body(licenciaturaService.updateLicenciatura(licenciatura, revoe));
        }catch (COAException ex){
            log.warn("Sin datos");
            log.error(ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteKardex(@PathVariable (value = "id") Long id){
         licenciaturaService.deleteLicenciatura(id);
    }
}
```
## Principio de Abierto/Cerrado (OCP)

> Las clases deban estar abiertas a la extensión y cerradas a la modificación.

Donde vemos este principio

![SRP](ruta/a/imagen/srp.png)

## **Bloques de código**
```java
// Ejemplo de código SRP
class MiClase {
  // Implementación de la clase
}
```
## Principio de Sustitución de Liskov (LSP)

> Las clases derivadas deben ser sustituibles por sus clases base.

Donde vemos este principio

![SRP](ruta/a/imagen/srp.png)

## **Bloques de código**
```java
// Ejemplo de código SRP
class MiClase {
  // Implementación de la clase
}
```
## Principio de Segregación de la Interfaz (ISP)

> Haz interfaces que sean específicas para un tipo de cliente.

Donde vemos este principio

![SRP](ruta/a/imagen/srp.png)

## **Bloques de código**
```java
// Ejemplo de código SRP
class MiClase {
  // Implementación de la clase
}
```
## Principio de Inversión de Dependencia (DIP)

> Depende de abstracciones, no de clases concretas.

Donde vemos este principio

![SRP](ruta/a/imagen/srp.png)

## **Bloques de código**
```java
// Ejemplo de código SRP
class MiClase {
  // Implementación de la clase
}
```

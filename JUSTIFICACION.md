# Justificacion

los campos deben ser privados para evitar modificaciones asi nadie desde afuera puede alterar los datos directamente, con esto tambien obligamos a que todo pase por sus validaciones y garantizar que sin importar como se use la clase el tanque nunca vaya a atener valores que sean imposibles o inconsistentes

La invariante que protege la clase es que el nivel de combustible siempre debe estar entre 0 y la capacidad total del tanque, siempre debe ser mayor a 0, no puede superar la capacidad y no debe ser negativo
Esto garantiza que pase un estado imposible como tanque mas halla del 100% o naves sin combustible que sigan volando y a su vez da una coherencia al objeto.

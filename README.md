# Api-first-example

### Articulo
[Desarrollo rápido de APIs con Spring Boot y OpenAPI Generator](https://medium.com/@espinozajge/desarrollo-r%C3%A1pido-de-apis-con-spring-boot-y-openapi-generator-6350bf7b8375)

### Versiones de librerias implementadas en Julio del 2023

- Spring Boot : 3.1.1
- Open Api Generator : 6.6.0
- Swagger-annotations : 2.2.14
- Jackson-databind-nullable : 0.2.6
- Javax.servlet-api : 4.0.1
- Javax.annotation-api : 1.3.2
- Validation-api : 2.0.1.Final
- Java : 17

### Objetivos

 - Generar clases e interfaces a partir de una especificacion OpenApi

### Implementacion Tecnica

***openapi-generator-maven-plugin***

Este plugin se utiliza para generar código a partir de un documento de especificación OpenAPI (anteriormente conocido como Swagger).
Para ello se debe agregar una definición similar a la siguiente en el ___pom.xml___.

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.openapitools</groupId>
            <artifactId>openapi-generator-maven-plugin</artifactId>
            <version>${openapi-generator.version}</version>
            <executions>
                <execution>
                    <id>generate-api-code</id>
                    <goals>
                        <goal>generate</goal>
                    </goals>
                    <configuration>
                        <inputSpec>${project.basedir}/src/main/resources/openapi.yaml</inputSpec>
                        <generateSupportingFiles>true</generateSupportingFiles>
                        <generatorName>spring</generatorName>
                        <strictSpec>true</strictSpec>
                        <generateApiTests>false</generateApiTests>
                        <generateApiDocumentation>false</generateApiDocumentation>
                        <generateModelTests>false</generateModelTests>
                        <generateModelDocumentation>false</generateModelDocumentation>
                        <configOptions>
                            <controllerThrowsExceptions>java.io.IOException,com.example.NotFoundException</controllerThrowsExceptions>
                            <interfaceOnly>true</interfaceOnly>
                            <skipDefaultInterface>true</skipDefaultInterface>
                            <useBeanValidation>true</useBeanValidation>
                            <useClassLevelBeanValidation>false</useClassLevelBeanValidation>
                            <useTags>true</useTags>
                            <java17>true</java17>
                            <useOptional>false</useOptional>
                            <hideGenerationTimestamp>true</hideGenerationTimestamp>
                            <dateLibrary>java17</dateLibrary>
                            <bigDecimalAsString>true</bigDecimalAsString>
                            <useBeanValidation>true</useBeanValidation>
                            <apiPackage>${openapi.package.api}</apiPackage>
                            <modelPackage>${openapi.package.model}</modelPackage>
                        </configOptions>
                        <typeMappings>
                            <typeMapping>OffsetDateTime=LocalDateTime</typeMapping>
                        </typeMappings>
                        <importMappings>
                            <importMapping>java.time.OffsetDateTime=java.time.LocalDateTime</importMapping>
                        </importMappings>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
A continuación, se explica cada configuración presente en el bloque:

***inputSpec:*** Especifica la ubicación del archivo de especificación OpenAPI. 

***generateSupportingFiles***: Indica si se deben generar archivos de soporte, como utilidades y clases auxiliares. Aquí se establece como true.

***generatorName***: Especifica el nombre del generador que se utilizará. En este caso, se utiliza el generador "spring" que genera código para un proyecto Spring.

***strictSpec***: Indica si se debe aplicar una validación estricta en la especificación OpenAPI. Aquí se establece como true.

***generateApiTests*** y ***generateModelTests***: Estas configuraciones indican si se deben generar pruebas automatizadas para las API y los modelos respectivamente. Aquí se establecen como false, lo que significa que no se generarán pruebas automatizadas.

***configOptions***: Aquí se definen varias opciones de configuración para el generador. Algunas de las opciones incluyen el manejo de excepciones en los controladores, el uso de validación de bean, el paquete de la API y el paquete del modelo.

***typeMappings*** y ***importMappings***: Estas configuraciones permiten realizar mapeos personalizados de tipos y importaciones en el código generado. En este caso, se realiza un mapeo para que OffsetDateTime se genere como LocalDateTime.

En general, este bloque de configuración del plugin openapi-generator-maven-plugin se utiliza para personalizar la generación de código a partir de una especificación OpenAPI en un proyecto Maven. 

Puedes ajustar las configuraciones según tus necesidades y requerimientos específicos de tu proyecto, todas las configuraciones del generador se explican con más detalle en el [sitio web de OpenAPI Generator](https://openapi-generator.tech/docs/generators/spring/)


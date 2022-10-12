#  Design Patterns Creational

* Abstract Factory
* Builder
* Factory
* Prototype
* Singleton

### Abstract Factory

Prover uma interface para criar uma família de objetos relacionados ou dependentes sem especificar suas classes 
concretas.

 * Ter uma interface principal com os métodos que devem ser implementados `CountryRulesAbstractFactory`
 * Essa interface deve ser implementada pelas classes concretas `BrazilianRulesAF` e `USRulesAF`
 * Ter uma classe abstrata com o corpo da implementação `IPhoneFactory`
 * Ter classes concretas estendendo dessa classe abstrata
    * Instanciar uma das classes concretas que implementam a interface (ex: `BrazilianRulesAF`)
    * Instanciar uma das classes concretas que estendem a classe abstrata, passando a classe 
    que implementa a interface como parâmetro
    * Chamar os metodos desejados
  
 ![Alt text](imgs/abstract-factory.jpg "Abstract Factory")

#
### Builder

Separar a construção de um objeto complexo de sua representação para que o mesmo processo de construção possa criar 
representações diferentes.

 * Adicionar classe statica do tipo builder dentro do objeto desejado
 * Para cada propriedade, será necessário criar um setter que retorne um Builder
 * No return deve ser retornado a instancia da classe (return this)
 * O uso sera algo como: 
    * `new MyObject.Builder().withName("Joe").withEmail("joe@email.com").build();`

 ![Alt text](imgs/builder.jpg "Builder")

#
### Factory

Um padrão que define uma interface para criar um objeto, mas permite às classes decidirem qual classe instanciar.
O Factory Method permite a uma classe deferir a instanciação para subclasses.

 * Possuir uma factory `IPhoneFactory` que contenha a lógica de como cada objeto deve ser instanciado
 * Possuir classe abstrata `IPhone` que deve ser estendida pelas outras classes concretas e retornada da factory
 * Para usar basta chamar a factory, e caso necessário, passar os parâmetros para aplicação da lógica

![Alt text](imgs/factory.jpg "Factory")

#
### Prototype

#
### Singleton
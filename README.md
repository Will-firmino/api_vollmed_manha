## ANOTATIONS - ANOTAÇÕES
1. Anotações do Spring Web
`@RequestMapping("/medicos")`
=> Define que a classe está mapeada para a url[endpoint] /medicos.

`@RestController`
=> Define que a classe é uma classe controladora no Spring.

`@GetMapping` 
=> Define que o método será somente leitura.

`@PostMapping`
=> Define que o método irá receber dados.

`@PutMapping`
=> Atualiza alguma informação.

`@DeleteMapping`
=> Deleta dados.

`@ResquestBody`
=> é utilizada quando você irá receber dados pelo simulador de requisição [insomnia], e informa que os dados serão enviados no corpo da requisição.

`@Autowired`
=> é utilizado quando você está aplicando a injeção de depêndencia. Ou seja, o Springboot sabe o que a classe(interface) possui de métodos e atributos.

`@Transactional`
=> é utilizado para que o método consiga realizar algum tipo de modelagem(alteração) no BD.

2. Anotações do Spring DATA
`@Enumerated` 
=> Informa que aquele atributo é uma classe do tipo enum.

`@Embedded`
=> Anota que uma classe faz parte dessa tabela no banco de dados. Ou seja, é utilizada na classe pai que irá associar uma tabela auxiliar nela.

`@Embeddable`
=> Anota que essa classe irá fazer parte de uma tabela de outra classe. Ou seja, será utilizada na classe da tabela auxiliar.





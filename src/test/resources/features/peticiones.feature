#language:es
Característica: Consumo de servicios

  @clientesTodos
  Escenario: Consultar todos los clientes que estan registrados
    Dado que Juan quiere ver los clientes registrados
    Cuando se consuma el servicio get
    Entonces debe responder 200 y mostrar los clientes

  @creacionCliente
  Escenario: Crear un cliente en la pagina
    Dado que Juan quiere crear un nuevo cliente
    Cuando se consuma el servicio post
    Entonces debe responder 201

  @consultaCliente
  Escenario: Consultar un cliente especifico que esta registrado
    Dado que Juan quiere ver un cliente registrado
    Cuando se consuma un servicio get
    Entonces debe responder 200 y mostrar el cliente

  @eliminarCliente
  Escenario: Eliminar cliente que esta registrados
    Dado que Juan quiere eliminar un cliente que esta registrado
    Cuando se consuma el servicio delete
    Entonces debe responder 200
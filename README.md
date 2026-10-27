# Monitoramento de Máquinas

API backend desenvolvida em Spring Boot para monitoramento de máquinas industriais.

## Tecnologias

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Maven

## Funcionalidades

- Cadastro de máquinas
- Listagem de máquinas
- Registro de produção
- Listagem de produção
- Consulta de status da API
- Consulta da versão

## Endpoints

### Sistema

`GET /`

`GET /status`

`GET /versao`

### Máquinas

`GET /maquinas`

`POST /maquinas/cadastro`

Exemplo:

```json
{
  "nome": "Torno CNC 01",
  "tipo": "Torno CNC",
  "setor": "Usinagem",
  "status": "ATIVA"
}
```

### Produção

`GET /producao`

`POST /producao`

Exemplo:

```json
{
  "maquina": {
    "id": 1
  },
  "consumoKw": 35.5,
  "horarioAcionamento": "2026-10-26T20:15:00",
  "pecasProduzidas": 120
}
```

## Banco de dados

PostgreSQL executado em container Docker.

- Banco: `monitoramento_maquinas`
- Porta: `5434`

## Autor

Ricardo Jairi Silvestre
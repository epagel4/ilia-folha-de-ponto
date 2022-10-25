# folha-de-ponto-doc

# Estes sao os endpoints necessarios
* `POST /v1/batidas`
* `POST /v1/alocacoes`
* `GET /v1/folhas-de-ponto/{mes}`

---
---

## Bater Ponto
### Endpoint
* `POST /v1/batidas`
### Summary
Este endpoint e chamado para registrar um horário da jornada diária de trabalho
### Exemplo de payload para testes:

"curl -X 'POST' \
'https://localhost:8080/v1/batidas' \
-H 'accept: application/json' \
-H 'Content-Type: application/json' \
-d '{
"dia" : "2022-10-25",
"dataHora": "2018-08-22T08:00:00"
}'"

### Responses esperados
* Code 201 "Created"
##### Payload de exemplo
* '{
  "dia": "2022-10-25",
  "horarios": [
  "08:00:00",
  "12:00:00",
  "13:00:00",
  "18:00:00"
  ]
  }'

* Code 400 "Bad Request"
##### Mensagens:
* "Apenas 4 horários podem ser registrados por dia"
* "Campo obrigatório não informado"


* Code 403 "Forbiden"
##### Mensagens:
* "Data e hora em formato inválido"
* "Deve haver no mínimo 1 hora de almoço"
* "Sábado e domingo não são permitidos como dia de trabalho"

* Code 409 "Conflict"
##### Mensagens:
* "Horários já registrado"

---
---

## Alocar horas trabalhadas
### Endpoint
* `POST /v1/alocacoes`
### Summary
Este endpoint serve para alocar horas trabalhadas, de um dia de trabalho, em um projeto
* Exemplo de payload: '{
  "dia": "2022-10-25",
  "tempo": "PT2H30M0S",
  "nomeProjeto": "ACME Corporation"
  }'

### Responses esperados
### Code 201 "Horas alocadas ao projeto"
### Payload de exemplo
* '{
  "dia": "2022-10-25",
  "horarios": [
  "08:00:00",
  "12:00:00",
  "13:00:00",
  "18:00:00"
  ]
  }'

### Code 400 "Bad Request"
### Mensagens:
* "Apenas 4 horários podem ser registrados por dia"
* "Campo obrigatório não informado"

---
---

## Relatorio mensal
### Endpoint
* `GET /v1/folhas-de-ponto/{mes}`
### Summary
Este endpoint faz a geração de relatório mensal de usuário.
* Exemplo de payload: '{
  "dataHora": "2018-08-22T08:00:00"
  }'
### Responses esperados
### Code 200 "Relatório mensal"
### Payload de exemplo
* '{
  "mes": "2018-08",
  "horasTrabalhadas": "PT69H35M5S",
  "horasExcedentes": "PT25M5S",
  "horasDevidas": "PT0S",
  "registros": [
  {
  "dia": "2022-10-25",
  "horarios": [
  "08:00:00",
  "12:00:00",
  "13:00:00",
  "18:00:00"
  ]
  }
  ],
  "alocacoes": [
  {
  "nomeProjeto": "ACME Corporation",
  "tempo": "PT69H35M5S"
  }
  ]
  }'

### Code 404 "Relatório não encontrado"

(Incompleto ainda)

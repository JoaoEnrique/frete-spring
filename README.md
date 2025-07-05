API para calculo de frete.

Essa API consome a API https://github.com/JoaoEnrique/spring-boot-pokemon na branch `feature-frete` 

#
## `POST /api/v1/frete`

Busca usuário por ID e calcula frete pelo estado retornado pela API

Body
```json
{
    "idUser": "string"
}
```

Response
```json
{
    "id": "e5d67479-c945-4ce9-ab20-4638d31c7670",
    "user": "0b69b56f-13bc-4e60-9e5b-a5a02888d65d",
    "status": "PROCESSANDO",
    "valor": "FRETE GRATIS"
}
```

#
## `GET /api/v1/frete/{id}`

Busca dados do frete pelo ID

Body
```json
{
    "id": "string"
}
```

Response
```json
{
    "id": "e5d67479-c945-4ce9-ab20-4638d31c7670",
    "user": "0b69b56f-13bc-4e60-9e5b-a5a02888d65d",
    "status": "PROCESSANDO",
    "valor": "FRETE GRATIS"
}
```


#
## `GET /api/v1/frete/{id}`

Busca dados de todos os fretes de um usuário

Body
```json
{
    "idUser": "string"
}
```

Response
```json
[
  {
    "id": "e5d67479-c945-4ce9-ab20-4638d31c7670",
    "user": "0b69b56f-13bc-4e60-9e5b-a5a02888d65d",
    "status": "PROCESSANDO",
    "valor": "FRETE GRATIS"
  },
  {
    "id": "e5d67479-c945-4ce9-ab20-4638d31c7670",
    "user": "0b69b56f-13bc-4e60-9e5b-a5a02888d65d",
    "status": "PROCESSANDO",
    "valor": "FRETE GRATIS"
  }  
]
```

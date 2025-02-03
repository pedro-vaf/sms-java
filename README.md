# SMS API com Twilio

Este projeto implementa uma API para envio de SMS utilizando o serviço Twilio.

## 📌 Tecnologias Utilizadas
- Java
- Spring Boot
- Twilio API
- Swagger para documentação

## 📂 Estrutura do Projeto
```
📦 src/main/java/dev/pedro/smsapi
 ├── 📂 config
 │   ├── SmsInitializer.java
 │   ├── SwaggerConfiguration.java
 │   ├── TwilioConfiguration.java
 │
 ├── 📂 controller
 │   ├── SmsController.java
 │
 ├── 📂 dto
 │   ├── SmsRequest.java
 │
 ├── 📂 exception
 │   ├── ExceptionDetails.java
 │   ├── RestExceptionHandler.java
 │
 ├── 📂 service
 │   ├── SmsApi.java
 │   ├── TwilioSmsService.java
 │
 ├── SmsApiApplication.java
```

## ⚙️ Configuração
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-repo.git
   cd sms-api
   ```

2. **Configure o arquivo `application.yml`** com suas credenciais Twilio:
   ```yaml
   twilio:
     accountSid: "SEU_ACCOUNT_SID"
     authToken: "SEU_AUTH_TOKEN"
     trialNumber: "+123456789"
   ```

3. **Instale as dependências e execute o projeto:**
   ```bash
   ./gradlew bootRun
   ```

## 🚀 Endpoints
### Enviar SMS
**POST** `/sms`
#### Request Body:
```json
{
  "ddd": "11",
  "phoneNumber": "987654321",
  "sender": "Pedro",
  "message": "Olá, isso é um teste!"
}
```

### Exemplo de Resposta:
```json
{
  "status": "SUCCESS",
  "message": "SMS enviado para +5511987654321"
}
```

## 📌 Observações
- O número do remetente usado é o de teste do Twilio.
- A API valida os números antes do envio.

---
**Desenvolvido por Pedro Aquino** 🚀

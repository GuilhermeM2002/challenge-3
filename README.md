# Order Processing System

Bem-vindo ao **Order Processing System**, um sistema de processamento de pedidos desenvolvido em Kotlin, utilizando Spring Boot, Kafka Connect e MySQL. Este projeto é modular e baseado em microserviços para garantir escalabilidade e flexibilidade.

---

## 📋 **Descrição**

O sistema permite processar pedidos de clientes de forma eficiente, aplicando descontos, gerenciando informações e integrando com um broker Kafka para a comunicação entre serviços.

### **Principais Funcionalidades**
- Recebimento de pedidos via Kafka.
- Persistência de dados em um banco de dados MySQL.
- Aplicação de regras de negócios, como cálculo de descontos.

---

## 🛠️ **Tecnologias Utilizadas**
### **Backend**
- **Kotlin**: Linguagem principal do projeto.
- **Spring Boot**: Framework principal para a construção da aplicação.
  - Spring Data JPA para persistência.
  - Spring Kafka para comunicação com o broker Kafka.
  - Spring Web para APIs REST.

### **Banco de Dados**
- **MySQL**: Banco de dados relacional para armazenar pedidos processados.

### **Mensageria**
- **Apache Kafka**: Broker de mensagens.
- **Kafka Connect**: Integração com outros sistemas.

### **Ferramentas de Auxílio**
- **Docker** e **Docker Compose**: Para containerização dos serviços.
- **Flyway**: Gerenciamento de migrações do banco de dados.

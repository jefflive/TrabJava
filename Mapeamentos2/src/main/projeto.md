# Plano de Testes

## Ferramentas Utilizadas

- **JUnit** (para testes unitários)
- **Checkstyle** (para verificação de estilo de código)
- **PMD** (para análise estática de código)
- **SonarLint** (para detectar problemas no código)
- **Cypress** ou **Selenium** (para testes de API ou sistemas)
- **GitHub Actions** (para CI/CD)

## Procedimentos

### 1. Commit e Pull Request

- **Commit:** Sempre faça commits pequenos e bem descritos.
- **Pull Request:** Crie um PR para integrar as alterações. O PR deve incluir um checklist de testes executados.

### 2. Verificação Estática

- Utilize ferramentas como Checkstyle, PMD e SonarLint para garantir que o código segue os padrões definidos.
- Corrija os problemas encontrados antes de realizar o merge.

### 3. Testes Unitários

- Use JUnit para realizar testes unitários.
- Certifique-se de que cada unidade de código tenha um teste associado.

### 4. Testes de Integração ou Sistema

- Utilize Cypress ou Selenium para testar a interação do sistema.
- Certifique-se de que as APIs ou a interface do usuário funcionem como esperado.

## Requisitos/Restrições/Configurações para o Teste

- **Ambiente de Teste:** 
    - JDK 11 ou superior.
    - Configuração do Maven ou Gradle para gerenciar dependências.
- **Testes:**
    - Todos os testes devem ser executados em ambiente isolado.
    - O código deve estar formatado e livre de warnings/erros de lint.

## Matriz de Funcionalidades vs Testes

| Funcionalidade              | Tipo de Teste          | Ferramenta    |
| ---------------------------- | ---------------------- | ------------- |
| Funcionalidade 1             | Teste Unitário         | JUnit         |
| Funcionalidade 2             | Teste de Integração    | Cypress/Selenium |
| Funcionalidade 3             | Teste de API           | JUnit         |
| Funcionalidade 4             | Teste de UI            | Cypress/Selenium |


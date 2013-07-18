logback-sample
==============

Repositorio para exemplos de features do logback.

Para ver o exemplo funcionando:

1. mvn clean install

2. cd logback-sample-war

3. mvn jetty:run

4. Abra o seguinte endereco no seu navegador:

http://localhost:8080/logback-sample-war/simple

5. Execute o jconsole em um terminal ou prompt do Windows

6. Procure pelos MBeans do logback na aba MBeans.

7. Execute a operação setLoggerLevel passando como parametros 'root' e um dos quatro niveis de log (DEBUG, INFO, WARN e ERROR). A cada nivel de log configurado, recarregue a pagina e veja no log a mensagens sendo imediatamente afetadas.

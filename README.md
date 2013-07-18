logback-sample
==============

RepositÃ³rio para exemplos de features do logback.

Para ver o exemplo funcionando:

mvn clean install
cd logback-sample-war
mvn jetty:run

Abra o seguinte endereco no seu navegador:
http://localhost:8080/logback-sample-war/simple

Execute o jconsole em um terminal ou prompt do Windows

Procure pelos MBeans do logback.

Execute a operação setLoggerLevel passando como parametros 'root' e um dos quatro niveis de log (DEBUG, INFO, WARN e ERROR). A cada nivel de log configurado, recarregue a pagina e veja no log a mensagens sendo imediatamente afetadas.

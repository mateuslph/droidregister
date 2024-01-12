# Droidregister

O projeto teve o objetivo de adicionar no Banco de Dados local, linhas de log de uma máquina de lavar roupas. Através de uma requisição POST realizado pelo Postman, 
o sistema "droidregister", aplica uma regex para separar a data da hora, verifica se a linha já existe no Banco de Dados, caso não, adiciona.

### O método se dá da seguinte forma:

<div>
   1 - Todas as vezes que a lavadoura encerra uma lavagem o aplicativo da fabricante, lança uma notificação no telefone; <br>
   2 - Esta notificação é capturada pelo aplicativo Android "MacroDroid", e neste app dispara um gatilho que escreve um log em um arquivo de texto a data e a hora, 
   todas as vezes, que a lavadoura de roupas encerra uma lavagem, este cria um arquivo de texto se ainda não foi criado, com uma linha de informações, ou adiciona uma nova linha com estas informações (data e hora); <br>
   3 - Com auxílio de outro aplicativo chamado de "DriveSync" automaticamente realiza-se o upload no Google Drive; <br>
   4 - Depois com o Software do Google Drive eu sicronizo com o computador, onde o sistema Java trata os dados e adiciona na base de dados local PostgreSQL; <br>
 </div>
 
 <br><br>
 
 <h3>ScreenShots do projeto:</h3>
 
 <div>
   <img src="https://github.com/mateuslph/droidregister/blob/master/imgs/ScreenShots_01.png"></img>
   <br><br>
   <img src="https://github.com/mateuslph/droidregister/blob/master/imgs/ScreenShots_02.png"></img>
 </div>

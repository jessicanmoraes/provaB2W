# Prova API StarWars B2W
Teste Solicitado Pela B2W
Configurações :

   Para o projeto funcionar ultilizei o Java SDK 8, o Eclipse STS E O MongoDB Community Server.
   No eclipse basta importar o projeto sem esquece de adiconar o Lombok no buildPath e inicar pelo Spring boot APP do eclipse.
 
# TESTES
Tem um pequeno pacote de teste para serem executados com Junit , mas se buildar com packge usando maven os testes sao executados automaticamente. 

Usei o sopui para realizar teste via rest Alguns exemplos :
  os endpoints criados são :
    post endpoint "/planetas" inserir planetas.
    get para o endpoint "/planetas" Listar planetas.
    post para o endpoint "/planetas" +  id  para buscar por ID.
    delete para o endpoint "/planetas/
    get para o endpoint "/planetas/buscanome?nome=" junto com o nome codificado que você quer pesquisar.

    **Para codificar o valor que você quer, você pode abrir seu navegador, ir em ferramentas de desenvolvedor, depois console e digitar "encodeURIComponent("Nome do planeta")" o console retornará o nome do planeta codificado como no exemplo abaixo.
     
     
    
    
    



    

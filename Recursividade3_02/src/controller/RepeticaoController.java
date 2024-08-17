package controller;

public class RepeticaoController
{
 public RepeticaoController()
 {
 super();
 }

 public int RecRepetir(int numero, int numeroRep,int cta)
 {
//ponto de parada: assim que o dividendo for menor que o divivor
//função consiste em ir dividindo o maior número por 10 e comparando os retorno com o menor número
//sempre que forem iguais a variavel cta ira contabilizar
	 
  if (numero == 0)
  {	
	return cta ;
  }  
  else
   {
	  
	
	if (numero % 10 == numeroRep)
	{
	return RecRepetir(numero / 10, numeroRep, cta + 1);
	}	
	return  RecRepetir(numero / 10, numeroRep, cta);
   }
	  
 }
}
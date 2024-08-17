package view;

import controller.RepeticaoController;

public class Repeticao
{
 public static void main(String Args [])
 {
  RepeticaoController Rep = new RepeticaoController();
  int numero = 4759455;
  int numeroRep = 5;
  int cta = 0;
  cta = Rep.RecRepetir(numero, numeroRep, cta);
  System.out.println(cta);
 }
}
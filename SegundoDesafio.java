
import java.util.*;

public class SegundoDesafio {
    public static void main(String[] args) { 
        //Removendo caracteres duplicados usando loop.
        String hello = "Hello, World"; //String que vamos manipular.
        System.out.println(hello);
        /* O método toCharArray converte uma String em um Array de char, vai me ajudar a percorrê-los com loop e a fazer uma comparação */
        char frase[] = hello.toCharArray();  
        //length para saber o tamanho(índices) do meu array 
        int len = frase.length;   
        //chamando o metodo abaixo para o main
         remocaoDeDuplicadas(frase, len);  
          }
   
   
        static void remocaoDeDuplicadas(char frase[], int length) { 
        //for aninhado com if para fazer comparação   
        int index = 0; /* int pois com a conversão de String para Array, tratarei meus dados como indices */
   
        for (int i = 0; i < length; i++){ //percorrendo e comparando, para encontrar as duplicadas
        int j;   
          for (j = 0; j < i; j++){     
             if (frase[i] == frase[j]){ //aqui retiramos as duplicadas, se os indices forem iguais, saia
                       break;   
                   }   
               }   
               if (j == i){   
                   frase[index++] = frase[i];   
               }   
           }   //método valueOf converte um inteiro para String
           System.out.println(String.valueOf(Arrays.copyOf(frase, index)));   
       }   
   
          }


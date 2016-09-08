/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t02_pilas01;

   import javax.swing.*;
/**
 *
 * @author Saul Grijalva Aragon
 */

public class Ee_t02_pilas01 {

    private int max,tope;
    private char ObjC[];
    
    
    public Ee_t02_pilas01(int max){
     this.max=max;
     tope=-1;
     ObjC=new char [max];
    }
    public boolean estavacio(){
     return tope==-1;
    }
    
    public boolean estallena(){
     return tope==max-1;
    }
    
    
    
    public void push(char n){ if(!estallena()){
         tope++;
         ObjC[tope]=n;
        }
        else{
        JOptionPane.showMessageDialog(null,"DESBORDAMIENTO");
        }
    }
    
    
     public char pop(){
     char n=' '; if(!estavacio()){
        n=ObjC[tope];
        tope--;
        return n;
        }
     
     else{
         
         
         JOptionPane.showMessageDialog(null,"SUBDESBORDAMIENTO");
        }
     return n;
    }
     
     
    public char peek(){
     char n=' ';
     if(!estavacio()){
         
        n=ObjC[tope];
       return n;
        }
     
     else{
       
        JOptionPane.showMessageDialog(null,"Pila Vacia");
        }
     return n;
    }
    public void comparator(String datos){
      int i=0;
        while(i<datos.length()){if(datos.charAt(i)=='('){
            push('(');
            }else 
   if(datos.charAt(i)==')' && peek()=='('){
             if(!estavacio()){
                pop();
                }
    else{
                 push(')');
                 break;
                }
            }
          if(datos.charAt(i)=='{'){
              push('{');
            }
             else if(datos.charAt(i)=='}' && peek()=='{'){
             if(!estavacio()){
                pop();
                }else{
                 push('}');
                 break;
                }
            }
          if(datos.charAt(i)=='['){
            push('[');
            }
            else if(datos.charAt(i)==']' && peek()=='['){
             if(!estavacio()){
                pop();
                }
             else{
                 push(']');
                 break;
                }
            }
                 
            i++;
        }
        if(estavacio()){
         
         JOptionPane.showMessageDialog(null,"Resultado---Si");
          }
        else{
            
            JOptionPane.showMessageDialog(null,"Resultado---NO");
            
            }
    }


   public static void main(String [] args){
    Ee_t02_pilas01 p=new Ee_t02_pilas01(10);
  
    JOptionPane.showMessageDialog(null,"Caracteres"+ "--"+"{[()]}");
   JOptionPane.showMessageDialog(null,"Caracteres"+"--"+ "{[(])}");
  JOptionPane.showMessageDialog(null,"Caracteres"+"--"+ "{{[[(())]]}}");
   
  
  
  //podemos compararlo con diferentes cadenas de caracteres, si queremos.
  //p.comparator("{[()]}");
  p.comparator("{[(])}");
  //p.comparator("{{[[(())]]}}");
   
  }
}
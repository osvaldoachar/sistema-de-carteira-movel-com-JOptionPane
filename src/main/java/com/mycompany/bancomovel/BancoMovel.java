 
package com.mycompany.bancomovel;
 
import javax.swing.JOptionPane;

public class BancoMovel {
 
    double numero1, numero2, valor;
    double saldo = 1000;
    int pin =1234;
    int digitePin;
    int escolha, numeroTelefone, conteudoTransacao, nib;
    
    public void escolha(){
        escolha = Integer.parseInt(JOptionPane.showInputDialog("__________e-Mola_____________ "
                + "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - "
              + "\n 1 - Transferir para 86/87 "
              + "\n 2 - Transferir para banco "
              + "\n 3 - Levantar dinheiro "
              + "\n 4 - Comprar Credito "
              + "\n 5 - Voz&Internet "
              + "\n 6 - Xitique "
              + "\n 7 - Pagamento "
              + "\n 8 - OlaLotto "
              + "\n 9 - Minha Conta "
              + "\n 10 - Promo")); 
        
        if(escolha == 1){
            transferirpara8687();
        }else if(escolha == 2){
        transferirParaBanco();
        }else if(escolha == 3){
            levantarDinheiro();
        }else if(escolha == 4){
            comprarCredito();
        }
    }
    public void transferirpara8687(){
    
        numeroTelefone = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita o numero de telefone:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digita o valor:"));
        if(valor<10){
            valorBaixo();
        }else if(valor >=10){
            digitePin = Integer.parseInt(JOptionPane.showInputDialog("Digita o seu PIN: "));
            if(digitePin==pin){
            conteudoTransacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita o conteúdo da transação:"));
            if(valor> saldo ){
              saldoInsuficiente();
            }else if (valor<=saldo){
               taxaDesconto(); 
            }
            }else if(digitePin != pin){
                JOptionPane.showMessageDialog(null, "PIN incorrecto!");
            }
        }       
}
    public void taxaDesconto(){
    if(valor<=100){
                  saldo = saldo - valor - 3;  
                  JOptionPane.showMessageDialog(null, "Transferiste " + valor + " para "+ numeroTelefone + " O teu saldo é : " + saldo);
                }else if(valor>100 & valor <1000){
                    saldo = saldo - valor - 5; 
                    JOptionPane.showMessageDialog(null, "Transferiste " + valor + " para "+ numeroTelefone + " O teu saldo é : " + saldo);
                }     
    }
    public void transferirParaBanco(){
          escolha = Integer.parseInt(JOptionPane.showInputDialog("___Transferir Para Banco____ "
                + "\n- - - - - - - - - - - - - - - - - - - -  - "
              + "\n 1 - BCI "
              + "\n 2 - Absa "
              + "\n 3 - BIM "
              + "\n 4 - Access "
              + "\n 5 - MOZA "
              + "\n 6 - Favorito "
              + "\n 7 - Pagamento "));
          
           if (escolha == 1){
            nib();
            digiteoValorParaBanco(); 
           }else if(escolha == 2){
               nib();
               digiteoValorParaBanco();
           }else if(escolha == 3){
             nib();
               digiteoValorParaBanco();  
           }else if(escolha == 4){
               nib();
               digiteoValorParaBanco();
           }else if(escolha == 5){
               nib();
               digiteoValorParaBanco();
           }else if(escolha == 6){
         escolha = Integer.parseInt(JOptionPane.showInputDialog("____Transferir Para Banco____ "
                + "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - "
              + "\n 1 - Banco Registrado "
              + "\n 2 - Remova o favorito do Banco "
              + "\n 3 - Voltar "
              ));
         if(escolha == 1){
             transferirParaBanco();
         }else if(escolha == 3){
             escolha();
         }
    }
                
    }
    public void digiteoValorParaBanco(){
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digita o valor: "));
        if (valor < 10){
            valorBaixo();
        }else if(valor >=10){
            
            digitePin = Integer.parseInt(JOptionPane.showInputDialog("Digita o seu PIN: "));
            if(digitePin==pin){
            conteudoTransacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita o conteúdo da transação:"));
            if(valor> saldo ){
              saldoInsuficiente();
            }else if (valor<=saldo){
                  if(valor<=100){
                  saldo = saldo - valor - 6;  
                JOptionPane.showMessageDialog(null, "Transferiste " + valor + " Para o NIB: " + nib + " O teu saldo é : " + saldo);
                }else if(valor>100 & valor <1000){
                    saldo = saldo - valor - 10; 
                     JOptionPane.showMessageDialog(null, "Transferiste " + valor + " Para o NIB: " + nib + " O teu saldo é : " + saldo);
                }
           
            }
            }else if(digitePin != pin){
                JOptionPane.showMessageDialog(null, "PIN incorrecto!");
            }
        
           
        }
    }
    public void nib(){
       nib = Integer.parseInt(JOptionPane.showInputDialog("____________BCI____________"
                     + "\n - - - - - - - - - - - - - - - - - - - - - - - - "
                     + "\n Digita a NIB/Conta Bancária:"));  
    }
    public void valorBaixo(){
        JOptionPane.showMessageDialog(null, "O Montante não "
                + "\n é válido(permitido de 10 a 99999)."
                + "\n Por favor, verifica e tente novamente."
                + "\n Obrigado!");
    }
    public void saldoInsuficiente(){
        JOptionPane.showMessageDialog(null, "Saldo insuficiente para fazer "
                + "\n transações. Por favor, vai "
                + "\n depositar num agente e-Mola/transfere "
                + "\n dinheiro do banco/pede amigos "
                + "\n para enviarem dinheiro para começara "
                + "\n usar o e-Mola.");
    }
    public void levantarAgente(){
        int agente = Integer.parseInt(JOptionPane.showInputDialog("Digita o ID do Agente:"));
           valor = Double.parseDouble(JOptionPane.showInputDialog("Digita o valor: "));
           if(valor > saldo){
               saldoInsuficiente();
           }else if(valor<=saldo){
             digitePin = Integer.parseInt(JOptionPane.showInputDialog("Digita o seu PIN: "));
            if(digitePin==pin){
             int perguntaSeDesejas = Integer.parseInt(JOptionPane.showInputDialog("Desejas levantar " + valor + "Mts no Agente "
                     + "\n " + agente + "?"
                + "\n- - - - - - - - - - - - - - - - - - -  - "
              + "\n 1 - Confirmar "
              + "\n 2 - Cancelar "
              ));
             if(perguntaSeDesejas ==1){
                  if(valor<=100){
                  saldo = saldo - valor - 4;  
                  JOptionPane.showMessageDialog(null, "Levantaste " + valor + "Mts no Agente "+ agente + " O teu saldo é : " + saldo);
                }else if(valor>100 & valor <1000){
                    saldo = saldo - valor - 10; 
                    JOptionPane.showMessageDialog(null, "Levantaste " + valor + "Mts no Agente "+ agente + " O teu saldo é : " + saldo);
                }
             }
              
            }else if(digitePin != pin){
                JOptionPane.showMessageDialog(null, "PIN incorrecto!");
            }
        }
    }
    public void levantarBalconista(){
             valor = Double.parseDouble(JOptionPane.showInputDialog("Digita o valor: "));
        int balconista = Integer.parseInt(JOptionPane.showInputDialog("Digita o ID da Balconista: "));
         if(valor > saldo){
               saldoInsuficiente();
           }else if(valor<=saldo){
             digitePin = Integer.parseInt(JOptionPane.showInputDialog("Digita o seu PIN: "));
            if(digitePin==pin){
             int perguntaSeDesejas = Integer.parseInt(JOptionPane.showInputDialog("Desejas levantar " + valor + "Mts Com a Balconista Nº "
                     + "\n " + balconista + "?"
                + "\n- - - - - - - - - - - - - - - - - - -  - "
              + "\n 1 - Confirmar "
              + "\n 2 - Cancelar "
              ));
             if(perguntaSeDesejas ==1){
                  if(valor<=100){
                  saldo = saldo - valor - 5;  
                  JOptionPane.showMessageDialog(null, "Levantaste " + valor + "Mts Com a Balconista Nº: "+ balconista + " O teu saldo é : " + saldo);
                }else if(valor>100 & valor <1000){
                    saldo = saldo - valor - 9; 
                    JOptionPane.showMessageDialog(null, "Levantaste " + valor + "Mts Com a Balconista Nº: "+ balconista + " O teu saldo é : " + saldo);
                }
             }else if(perguntaSeDesejas == 2){
                 escolha();
             }
    }
    }
    }
    public void levantarDinheiro(){   
       int escolha2 = Integer.parseInt(JOptionPane.showInputDialog("___Levantar Dinheiro____ "
                + "\n- - - - - - - - - - - - - - - - - - -  - "
              + "\n 1 - Do Agente "
              + "\n 2 - Da Balconista "
              + "\n 3 - Da ATM "
              ));
       
       if (escolha2 == 1){
            levantarAgente(); 
           }else if(escolha2 == 2){
              levantarBalconista(); 
           }else if(escolha2==3){
               levantarAtm();
           }
       }
    public void levantarAtm(){
        int escolha3 = Integer.parseInt(JOptionPane.showInputDialog("___Levantar Dinheiro da ATM___ "
                + "\n- - - - - - - - - - - - - - - - - - -  - "
              + "\n 1 - Ponto 24 "));
        if(escolha3 == 1){
              valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digita o valor:"));
        if(valor<10){
            valorBaixo();
        }else if(valor >=10){
            digitePin = Integer.parseInt(JOptionPane.showInputDialog("Digita o seu PIN: "));
            if(digitePin==pin){
           
            if(valor> saldo ){
              saldoInsuficiente();
            }else if (valor<=saldo){
               JOptionPane.showMessageDialog(null, "Operação feita com sucesso! "
                       + "\n Verifique a sua caixa de mensagens para confirmar o código que enviamos.");
            }
            }else if(digitePin != pin){
                JOptionPane.showMessageDialog(null, "PIN incorrecto!");
            }
        }   
        }
    }
    public void comprarCredito(){
        int credito = Integer.parseInt(JOptionPane.showInputDialog("Comprar Credito "
                + "\n- - - - - - - - - - - - - - - - - - -  - "
              + "\n 1 - Para Este Número "
              + "\n 2 - Para Outro Número "));
        if(credito == 1){
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digita o valor: ")); 
            
           if(valor > saldo){
               saldoInsuficiente();
           }else if(valor<=saldo){
             digitePin = Integer.parseInt(JOptionPane.showInputDialog("Digita o seu PIN: "));
            if(digitePin==pin){
             int perguntaSeDesejas = Integer.parseInt(JOptionPane.showInputDialog("Desejas Comprar Credito de " + valor + "Mts?"
                + "\n- - - - - - - - - - - - - - - - - - -  - "
              + "\n 1 - Confirmar "
              + "\n 2 - Cancelar "
              ));
             if(perguntaSeDesejas ==1){
                  if(valor<=100){
                  saldo = saldo - valor;  
                  JOptionPane.showMessageDialog(null, "Compraste credito de " + valor + " O teu novo saldo é : " + saldo);
                }else if(valor>100 & valor <1000){
                    saldo = saldo - valor - 10; 
                    JOptionPane.showMessageDialog(null,"Compraste credito de " + valor + " O teu novo saldo é : " + saldo  );
                }
             } 
              
            }else if(digitePin != pin){
                JOptionPane.showMessageDialog(null, "PIN incorrecto!");
            }
        }
        }else if(credito == 2){
            int numeroOutro = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
             valor = Double.parseDouble(JOptionPane.showInputDialog("Digita o valor: ")); 
            
           if(valor > saldo){
               saldoInsuficiente();
           }else if(valor<=saldo){
             digitePin = Integer.parseInt(JOptionPane.showInputDialog("Digita o seu PIN: "));
            if(digitePin==pin){
             int perguntaSeDesejas = Integer.parseInt(JOptionPane.showInputDialog("Desejas Comprar Credito de " + valor + "Mts?"
                + "\n- - - - - - - - - - - - - - - - - - -  - "
              + "\n 1 - Confirmar "
              + "\n 2 - Cancelar "
              ));
             if(perguntaSeDesejas ==1){
                  if(valor<=100){
                  saldo = saldo - valor;  
                  JOptionPane.showMessageDialog(null, "Compraste credito de " + valor + "Para o numero: " +numeroOutro+" O teu novo saldo é : " + saldo);
                }else if(valor>100 & valor <1000){
                    saldo = saldo - valor - 10; 
                    JOptionPane.showMessageDialog(null, "Compraste credito de " + valor + "Para o numero: " +numeroOutro+" O teu novo saldo é : " + saldo );
                }
             } 
              
            }else if(digitePin != pin){
                JOptionPane.showMessageDialog(null, "PIN incorrecto!");
            }
           }
        }
        
    }
       
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

/**
 *
 * @author JOAO
 */
public class CaeserCypher {
    
    private String password ;
     private String passwordencriptada ;
     private String passworddesencritada ;
    
    private final int nivel =2;
    
    public CaeserCypher(String password){
        this.password=password ;
    }
    
    public void encriptar (){
        passwordencriptada = "";
    int len = password.length();
    for(int x = 0; x < len; x++){
        char c = (char)(password.charAt(x) + nivel);
        if (c > 'z')
            passwordencriptada += (char)(password.charAt(x) - (26-nivel));
        else
            passwordencriptada += (char)(password.charAt(x) + nivel);
    }
    
}
       public String toString (){
           return  passwordencriptada  +"   "+ passworddesencritada ;
        
        
        
    }
    
     public void desencriptar (){
        passworddesencritada = "";
    int len = passwordencriptada.length();
    for(int x = 0; x < len; x++){
        char c = (char)(password.charAt(x) - nivel);
        if (c > 'z')
            passworddesencritada += (char)(passwordencriptada.charAt(x) - (26+nivel));
        else
            passworddesencritada += (char)(passwordencriptada.charAt(x) - nivel);
    }
    
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;



/**
 *
 * @author Dell
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Context context = new Context() ;
        
        // cong
        context.setTinhpheptinh(new PhepCong());
        System.out.println("75+12 = "+ context.tinh(75, 12));
      
        //tru
       
        context.setTinhpheptinh(new PhepTru());
        System.out.println("54-78 = " + context.tinh(54, 78));
     
        
        
    }

   
    
    
}

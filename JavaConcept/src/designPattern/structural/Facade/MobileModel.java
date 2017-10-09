package designPattern.structural.Facade;

public class MobileModel {  
    private Mobile iphone;  
    private Mobile samsung;  
    private Mobile blackberry;  
      
    public MobileModel(){  
        iphone= new Iphone();  
        samsung=new Samsung();  
        blackberry=new Blackberry();  
    }  
    public void iphoneSale(){  
        iphone.modelNo();  
        iphone.price();  
    }  
        public void samsungSale(){  
        samsung.modelNo();  
        samsung.price();  
    }  
   public void blackberrySale(){  
    blackberry.modelNo();  
    blackberry.price();  
        }  
}  

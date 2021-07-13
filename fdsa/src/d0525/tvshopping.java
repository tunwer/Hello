package d0525;

public class tvshopping extends ShoppingMall{
	String time;
	
    tvshopping(String code, int total, String time){
        this.code = code;
        this.total = total;
        this.time = time;
        addtotal(3);
    }
}

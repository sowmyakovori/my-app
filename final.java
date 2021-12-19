import java.util.*;
class obs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=0;
        final int execution_price=150;
        String[] order_status=new String[1000000];
        String state=sc.next();
        if(state=="OPEN"){
           
        
        String[] purchase_date=new String[100000];
        String[] stock=new String[1000000];
        int[] price_limit=new int[1000000];
        int[] purchase_quantity=new int[1000000];

        stock[i++]=sc.next();
        purchase_quantity[i++]=sc.nextInt();
        String order_type=sc.next();
        if(order_type=="Limit"){
            int price=sc.nextInt();
            price_limit[i++]=price;

        }
        else{
            price_limit[i++]=0;
        }
        Date d = new Date();
        purchase_date[i++]=d.toString;
        }

        
        else{
        
        int n=10;
        for(int j=0;j<n;j++){
           if(execution_price>price_limit(j)){
               order_status[j]="REJECTED";
               System.out.println("Rejected");
           }
           else {
               order_status[j]="ACCEPTED";
               System.out.println("Accepted");

           }
        }
    }   
    
 }
}

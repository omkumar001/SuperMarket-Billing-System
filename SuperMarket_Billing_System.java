/**
 * @author Om Kumar Thakur, Shashwat Mishra, Anavya Upadhyay and Prahalad Ghosalya
 *
 */

package firstJavaProgram;
import java.util.*;


interface Operation
{
	
public void login_staff();
public void login_customer();
public void menu_display();
public void  Add(int code,String name,int quant,int price);
public void  Search(Billing_System []obj,int size);
public void Edit(Billing_System obj[],int size);
public void Delete(Billing_System []obj,int size);
public void bill_calc(Billing_System obj[],int size);
public void bill_display(Billing_System obj[],int size);
}




class Billing_System implements Operation //Super Class
{

	 private int code,quantity,price;
	 private String name;
	 
	 
    Billing_System() //Non Parameterized Constructor
	 {
		this.code=0;
		this.quantity=0;
		this.price=0;
		this.name="";
	 }
	
	 
	 
   public void login_staff()
   {
    Scanner sc = new Scanner(System.in);
    
    
	System.out.println("\n\n\n\n\n\n\n\n");
	System.out.println("                                                                                      <<<< Staff Login Credentials >>>>                                           ");
	System.out.println("                                                                                      ___________________________________                 ");
	System.out.println("\n\n");  
	System.out.print("                                                                                          Name : ");
	
	String uname = sc.nextLine();
	System.out.print("\n                                                                                          UID  : ");
	String pass = sc.nextLine();
	System.out.print("\n\n\n\n\n");
	System.out.print("\n\n\n\n\n\n\n...........................................................................................................................................................................................................................................\n\n");
	 
  }
   
   
   
   
   public void login_customer()
   {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\n\n\n\n\n\n\n\n");
	System.out.println("                                                                                      <<<< Customer Login Credentials >>>>                                           ");
	System.out.println("                                                                                      ___________________________________                 ");
	System.out.println("\n\n");  
	System.out.print("                                                                                          Name      : ");
	
	String uname = sc.nextLine();
	System.out.print("\n                                                                                          Phone No. : ");
	String phone = sc.nextLine();
	System.out.print("\n\n\n\n\n");
	System.out.print("\n\n\n\n\n\n\n...........................................................................................................................................................................................................................................\n\n");
	 	
  }
  
  

 public void menu_display()
 {


    System.out.print("\n\n\n\n\n\n                                                                                             BILLING SYSTEM   ");
    System.out.print("\n                                                                                            ________________");
    System.out.print("\n\n\n                                                                                               Main Menu");
System.out.print("\n\n\n\n\n                                                                                              1. Add Goods");
    System.out.print("\n                                                                                              2. Search");
    System.out.print("\n                                                                                              3. Edit Goods");
    System.out.print("\n                                                                                              4. Delete Goods");
    System.out.print("\n                                                                                              5. Calculate Bill");
    System.out.print("\n                                                                                              6. Display Bill");
    System.out.print("\n                                                                                              7. Customer's Feedback");
    System.out.print("\n                                                                                              8. Exit");
    System.out.print("\n\n\n\n                                                                                         Please enter the choice : ");
 
 }




public void  Add(int code,String name,int quant,int price)
 {
 
   this.code=code;
   this.name=name;
   this.quantity=quant;
   this.price=price;
  
 }




 public void Search(Billing_System obj[],int n)
 {

   int f=0;
   Scanner sc=new Scanner(System.in);

   if(obj[0].code==0)
   System.out.print("                                                                                                           NO ITEM ADDED !!");

    else
    {
     System.out.print("\n\n\n\n\n                                                                               ************* SEARCH MENU *************");
     System.out.print("\n\n\n\n\n                                                                                             1.By Code");
     System.out.print("\n                                                                                             2.By Name");
     System.out.print("\n\n\n                                                                                        Enter option 1 or 2 : ");
   
     int option=sc.nextInt();

    if(option==1)
    {
	  System.out.print("\n                                                                                      Enter the code of the item : ");
      int codes=sc.nextInt();
      int j=n-1;


    while(j>-1)
    {
	
    if(codes==obj[j].code)
     {
     f++;
     break;
     }
     j--;
     
    }

    if(f>0)
    { 
      System.out.println("\n\n\n\n\n\n\n");	  
      System.out.println("                                                  Code                           Name                           Quantity                          Price\n\n");
      System.out.println("                                                   "+obj[j].code+"                              "+obj[j].name+"                                 "+obj[j].quantity+"                              "+obj[j].price);
    }

    else	
     System.out.println("                                                                                       ************ Item not found  ********");

    }//if condition for option 1 ends


    if(option==2)
    {
     System.out.print("\n                                                                                       Enter the name of the item : ");
     sc.nextLine();
     String names=sc.nextLine();
     int j=n-1;
    
    while(j>-1)
    {
      if(names.equalsIgnoreCase(obj[j].name))
      { 
	  f++;
      break;
      }
     j--;
    }
  
    if(f>0)
    { 
      System.out.println("\n\n\n\n\n\n\n");	  
      System.out.println("                                                  Code                           Name                           Quantity                          Price\n\n");
      System.out.println("                                                   "+obj[j].code+"                              "+obj[j].name+"                                 "+obj[j].quantity+"                              "+obj[j].price);
    }
  
     else
      System.out.println("                                                                                       ************ Item not found  ********");
  
      }  //if condition for option 2 ends

    //menu_display();

    }//else ends
   
  }// search function ends
 
 


   public void Delete(Billing_System obj[],int n)
    {
	
     //Delete the item by either using their code or name
	// System.out.print("\n\n\n\n\n\n\n\n\n.........................................................................................................................................................................\n\n"); 
		
	   int f=0;
	   Scanner sc=new Scanner(System.in);
		
	   System.out.print("\n\n\n\n\n                                                                                  ************* DELETE MENU **************");
	   System.out.print("\n\n\n\n\n                                                                                                 1.By Code");
	   System.out.print("\n                                                                                                 2.By Name");
	   System.out.print("\n\n\n                                                                                           Enter option 1 or 2 : ");
	   
	   int option=sc.nextInt();

	  if(option==1)
	  {
		System.out.print("\n                                                                                       Enter the code of the item : ");
	   int codes=sc.nextInt();
	   int j=n-1;


	  while(j>-1)
	  {
		
	  if(codes==obj[j].code)
	  {
	   f++;
	   break;
	  }
	   j--;
	 }

	  if(f>0)
	 { 
		  obj[j].code=0;
		  obj[j].name=" ";
		  obj[j].quantity=0;
		  obj[j].price=0;
		 
		bill_display(obj,n); 
		//menu_display();
	  }
	  
	  else if(f==0)
	  {
		  System.out.print("                                                                                                 Item not found !!");
			//menu_display();  
	  }

	}//if condition for option 1 ends
	
	 


    if(option==2)
	{
	   System.out.print("\n                                                                                          Enter the name of the item : ");
	   sc.nextLine();
	   String names=sc.nextLine();
	   
	    int j=n-1;
	    
	  while(j>-1)
	 {
	  if(names.equalsIgnoreCase(obj[j].name))
	   { 
		  f++;
	     break;
	   }
	     j--;
	 }
	  
	  if(f>0)
	   {
		  obj[j].code=0;
		  obj[j].name=" ";
		  obj[j].quantity=0;
		  obj[j].price=0;
			 
	   }
	  
	   else
	   System.out.println("                                                                                       ************Item not found********");
	  
	    }  //if condition for option 2 ends

}   //Delete() ends






   public void Edit(Billing_System obj[],int n)
    {
	
      Scanner sc=new Scanner(System.in);
 

      System.out.print("\n\n\n\n\n\n\n                                                                              Do you want to edit the record ? YES/NO : ");
      String choice =sc.nextLine();

     if(choice.equalsIgnoreCase("YES"))
     {
       System.out.print("\n\n                                                                                   Enter the code of the quantity : ");

       int codes=sc.nextInt();
       int index= get_index(obj,codes,n);

      if(index>=0 && index<n)
      {

       System.out.print("\n\n\n                                                                                           1.Edit Quantity");
       System.out.print("\n                                                                                           2.Edit Price (Not Available for Customers)");
       System.out.print("\n\n\n                                                                                         Enter option (1 or 2) : ");
       
       int op=sc.nextInt();  //Takes Option 1 or 2
 
        if(op==1)
        {
       System.out.print("\n\n                                                                                          Enter new Quantity : ");
       int quaantity=sc.nextInt();
       obj[index].quantity=quaantity;
       System.out.println("\n\n\n\n\n\n                                                                   ***************** Item Edited and Detail is updated ******************                                               ");
        }

  
      if(op==2)
       {
       System.out.print("\n                                                                                          Enter new Price : ");
       int priice=sc.nextInt();
       obj[index].price=priice;
       System.out.println("\n\n\n                                                                       **************** Item Edited and Detail is updated ***************                                            ");
       }
      
     }//if ends
      
    }//outer if ends


    else if(choice.equalsIgnoreCase("NO"))
     {
	   System.out.println("\n                                                                                 No detail is to be updated !!\n\n");
	   //menu_display();
     }
 
     else 
     {
      System.out.println("\n                                                                                          Invalid Code !!");
      //menu_display();
     }

} //Edit method ends






private int get_index(Billing_System obj[],int codes,int n)
 {
	
int j=n-1;

 while(j>-1)
 {
	
   if(codes==obj[j].code)
    return(j);
   
    j--;
  }
   return -1;
   
 } //get_index() ends






  public void bill_calc(Billing_System obj[],int n)
  {
	
    System.out.println("\n\n\n\n\n\n\n\n\n\n");
    System.out.println("                                                                         ******************* BILL CALCULATION ************************");
    System.out.println("\n\n\n\n                                                  Code                           Name                           Quantity                          Price\n\n");
    int total=0;

    for(int j=0;j<n;j++)
    {
	 if(obj[j].code>0)
	 System.out.println("                                                   "+obj[j].code+"                              "+obj[j].name+"                                 "+obj[j].quantity+"                              "+obj[j].price);	
	 total+=obj[j].price;
    }

   System.out.println("\n\n\n\n                                                                                         GRAND TOTAL : "+total+"\n\n");
   
   //menu_display();

  } //bill_calc() ends




   public void bill_display(Billing_System obj[],int n)
   {
	//System.out.print("\n\n\n\n.........................................................................................................................................................................\n\n"); 	  

	System.out.println("\n\n\n\n\n\n\n");
	System.out.println("                                                                            ******************* INVOICE BILL ************************");
	System.out.println("\n\n\n\n\n                                                  Code                           Name                           Quantity                          Price\n\n");

	int total=0;

	for(int j=0;j<n;j++)
	{
		if(obj[j].code !=0)
		{
		 System.out.println("                                                   "+obj[j].code+"                              "+obj[j].name+"                                 "+obj[j].quantity+"                              "+obj[j].price);
		total+=obj[j].price;
		}
	}
	  //menu_display();
	
  } // bill_display() ends

} // Super Class ends













class Staff_emp extends Billing_System 
{
	
  Billing_System sf=new Billing_System();
  Billing_System st[]=new Billing_System[100];
  Scanner sc=new Scanner(System.in);
  
  int size=0;
  
  Staff_emp()
  {
   sf.login_staff();
  }
  
  private void add_item()
  {    
	     System.out.print("\n\n\n\n\n\n\n                                                                                **************  ADD ARTICLES  **************\n\n\n");
	  
		 System.out.print("\n\n\n                                                                                        Enter the code of item : ");
		  int code=sc.nextInt();
		  sc.nextLine();
		  
		  System.out.print("                                                                                        Enter the name of item : ");
		  String name=sc.nextLine();
		   
		  System.out.print("                                                                                        Enter quantity of item : ");
		  int quant=sc.nextInt();
		  
		  System.out.print("                                                                                        Enter price of item    : ");
		  int price=sc.nextInt();
		  
	  st[size]=new Billing_System();
	  st[size].Add(code,name,quant,price);
	  
	  size++;
	  
	  sc.nextLine();
	  System.out.print("\n\n\n                                                                                  Do you want to add more items? (YES/NO) : ");
	  String option=sc.nextLine();
	  
	 if(option.equalsIgnoreCase("YES"))
		 add_item();
	 
	    else if(option.equalsIgnoreCase("NO"))
	    {
		  menu_driven();
	    } 
	 
  } //add_item() ends
  
  
  
  private void searching()
  {
	  
      sf.Search(st,size);
   
      System.out.print("\n\n\n\n\n\n                                                                                   Do you want to search more items? (YES/NO) : ");
	  String option=sc.nextLine();
	  
	  if(option.equalsIgnoreCase("YES"))
	    searching();
	 
	  else if(option.equalsIgnoreCase("NO"))
	   {
	   menu_driven();
	   } 
   
  } //searching() ends
  
  
  
  private void delete()
   {
	sf.Delete(st,size); 
	
	  System.out.print("\n\n\n\n\n\n\n                                                                                Do you want to delete more items? (YES/NO) : ");
	  String option=sc.nextLine();
	  
	  if(option.equalsIgnoreCase("YES"))
	  delete();
	 
	  else if(option.equalsIgnoreCase("NO"))
	   {
	   menu_driven();
	   } 
	  
   } //delete() ends
   
   
   
  private void edit()
   {
   sf.Edit(st,size);  
   
      System.out.print("\n\n\n\n\n\n                                                                                  Do you want to edit more items? (YES/NO) : ");
	  String option=sc.nextLine();
	  
	  if(option.equalsIgnoreCase("YES"))
		edit();
	 
	  else if(option.equalsIgnoreCase("NO"))
	   {
	   menu_driven();
	   } 
	   
   } //edit() ends
   
   
   
  private void display()
   {
   sf.bill_display(st,size);
   menu_driven();
   
   } //display() ends
   
   
  private void calc()
   {
   sf.bill_calc(st,size);  
   menu_driven();
   
   } //calc() ends
   
   
   
	 public void menu_driven()
	 {
	//Starting of the main flow of the program
	
	Scanner sc=new Scanner(System.in);
	
	sf.menu_display();
	
	int ch= sc.nextInt();
	System.out.print("\n\n\n\n\n\n\n");
    System.out.print("\n\n\n\n....................................................................................................................................................................................................................\n\n");   

	

	while(ch>=1 && ch<=8)
	{
	
	  switch(ch)
	  {

	  case 1:
		    {  
		      add_item();
		       break;
		     }
	      
	  case 2: {
		      searching();
		      break;
	          }

	  case 3: {
		      edit();
		      break;
	          }

	  case 4: {
		     delete();
		     break;
	          }

	  case 5: {
		      calc();
		     break;
	          }
	 
	  case 6: {
		      display();
	          break;
	           }
	  
	  case 7: {
	         System.out.println("\n\n\n                                                                            ....................... EXIT .......................\n");
	         System.exit(0); 
             break;
              }

	  case 8: {
		      System.out.println("\n\n\n                                                                           ........................ EXIT .......................\n");
		      System.exit(0); 
	          break;
	          }

	 default: {
	          System.out.println("\n                                                             Please enter the correct choice");
	          break;
		      } 
	   
	    } //switch ends

	  }//while ends
		
	} //function ends
		
	
  } //Staff (SubClass) ends









class Consumer extends Billing_System 
{
	
	
	Billing_System sf=new Billing_System();
	  Billing_System cons[]=new Billing_System[100];
	  Scanner sc=new Scanner(System.in);
	  
	  int size=0;
	  
	  
	  Consumer()
	  {
	  sf.login_customer();
	  }
	  
	  
	  private void add_item()
	  {    
		     System.out.print("\n\n\n\n\n\n\n                                                                                **************  ADD ARTICLES  **************\n\n\n");
		  
			 System.out.print("\n\n\n                                                                                        Enter the code of item : ");
			  int code=sc.nextInt();
			  sc.nextLine();
			  
			  System.out.print("                                                                                        Enter the name of item : ");
			  String name=sc.nextLine();
			   
			  System.out.print("                                                                                        Enter quantity of item : ");
			  int quant=sc.nextInt();
			  
			  System.out.print("                                                                                        Enter price of item    : ");
			  int price=sc.nextInt();
			  
		  cons[size]=new Billing_System();
		  cons[size].Add(code,name,quant,price);
		  
		  size++;
		  
		  sc.nextLine();
		  System.out.print("\n\n\n                                                                                  Do you want to add more items? (YES/NO) : ");
		  String option=sc.nextLine();
		  
		 if(option.equalsIgnoreCase("YES"))
			 add_item();
		 
		    else if(option.equalsIgnoreCase("NO"))
		    {
			  menu_driven();
		    } 
		 
	  } //add_item() ends
	  
	  
	  
	  private void searching()
	  {
		  
	      sf.Search(cons,size);
	   
	      System.out.print("\n\n\n\n\n\n                                                                                   Do you want to search more items? (YES/NO) : ");
		  String option=sc.nextLine();
		  
		  if(option.equalsIgnoreCase("YES"))
		    searching();
		 
		  else if(option.equalsIgnoreCase("NO"))
		   {
		   menu_driven();
		   } 
	   
	  } //searching() ends
	  
	  
	  
	  private void delete()
	   {
		sf.Delete(cons,size); 
		
		  System.out.print("\n\n\n\n\n\n\n                                                                                Do you want to delete more items? (YES/NO) : ");
		  String option=sc.nextLine();
		  
		  if(option.equalsIgnoreCase("YES"))
		  delete();
		 
		  else if(option.equalsIgnoreCase("NO"))
		   {
		   menu_driven();
		   } 
		  
	   } //delete() ends
	   
	   
	   
	  private void edit()
	   {
	   sf.Edit(cons,size);  
	   
	      System.out.print("\n\n\n\n\n\n                                                                                  Do you want to edit more items? (YES/NO) : ");
		  String option=sc.nextLine();
		  
		  if(option.equalsIgnoreCase("YES"))
			edit();
		 
		  else if(option.equalsIgnoreCase("NO"))
		   {
		   menu_driven();
		   } 
		   
	   } //edit() ends
	   
	   
	   
	  private void display()
	   {
	   sf.bill_display(cons,size);
	   menu_driven();
	   
	   } //display() ends
	   
	   
	  private void calc()
	   {
	   sf.bill_calc(cons,size);  
	   menu_driven();
	   
	   } //calc() ends
	   
	   
	   
	  private void feedback()
	   {
		   
		System.out.print("\n\n\n\n\n\n                                                                                     Do you want to give the feedback (YES/NO)  : "); 
		String ch=sc.nextLine();
		
		
		if(ch.equalsIgnoreCase("YES"))
		{
	     System.out.print("\n\n\n                                                                                          Write to us : ");
		 String feed=sc.nextLine();
		 System.out.println("\n\n\n                                                                                       THANK YOU FOR YOUR FEEBACK !!!\n\n\n");
		 menu_driven();
		}
		
		if(ch.equalsIgnoreCase("NO"))
		{
			System.out.println("\n\n\n\n\n\n                                                                                         HAVE A GOOD DAY :) \n\n");
			menu_driven();
		} 
		   
	   }
	   
	   
	   
		 public void menu_driven()
		 {
		//Starting of the main flow of the program
		
		Scanner sc=new Scanner(System.in);
		
		sf.menu_display();
		
		int ch= sc.nextInt();
		System.out.print("\n\n\n\n\n\n\n");
	    System.out.print("\n\n\n\n....................................................................................................................................................................................................................\n\n");   

		

		while(ch>=1 && ch<=8)
		{
		
		  switch(ch)
		  {

		  case 1:
			    {  
			      add_item();
			       break;
			     }
		      
		  case 2: {
			      searching();
			      break;
		          }

		  case 3: {
			      edit();
			      break;
		          }

		  case 4: {
			     delete();
			     break;
		          }

		  case 5: {
			      calc();
			     break;
		          }
		 
		  case 6: {
			      display();
		          break;
		           }
		  
		  case 7: {
		          feedback();
	              break;
	              }

		  case 8: {
			      System.out.println("\n\n\n                                                                           ........................ EXIT .......................\n");
			      System.exit(0); 
		          break;
		          }

		 default: {
		          System.out.println("\n                                                             Please enter the correct choice");
		          break;
			      } 
		   
		    } //switch ends

		  }//while ends
			
		} //function ends
				
     }//Consumer (SubClass)  ends







    public class SuperMarket_Billing_System
    {	
     public static void main(String[] args)
      {
	
       Billing_System sf=new Billing_System();
       Scanner sc = new Scanner(System.in);
     
       System.out.println("\n\n\n\n                                                                       >>>>>>>>>>>>>>>>   WELCOME TO THE  XYZ SUPERMARKET   <<<<<<<<<<<<<<<<");
       System.out.println("\n                                                                                       *************************************");
       System.out.print("\n\n\n\n\n                                                                      Do you want to continue as Staff or Customer (Staff/Customer)   : ");
       
       String identity=sc.nextLine();
       
       if(identity.equalsIgnoreCase("Staff"))
       {
       Staff_emp obj1=new Staff_emp();
       obj1.menu_driven();
       }
       
       if(identity.equalsIgnoreCase("Customer"))
       {
       Consumer obj2=new Consumer();
        obj2.menu_driven();
       }
  
      }//main method ends
   }   //main class ends




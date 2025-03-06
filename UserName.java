 public class UserName
 {
 	static String[] userNameList={null,null,null,null,null};
 	static int index=0;

 	static void saveUserNameToList(String name)
 	{
 		if(userNameList != null)
 		{
 			if(index<userNameList.length)
 			{
 				userNameList[index]=name;
 				System.out.println("UserName Successfully Added in List");
 				index++;
 			}
 			else
 			{
 				System.out.println("UserName List is Full We can't add");
 			}
 		}
 		else 
 		{
 			System.out.println("UserName List is Null");
 		}

 	}

 	static void displayUserNames()
 	{
 		if(userNameList==null)
 		{
 			System.out.println("UserName List is Empty");
 		}
 		else 
 		{
 		   System.out.println("UserName List");
 		   for(String name:userNameList)
 		   {
 		   	System.out.println(name);
 		   }
 	    }
 	}

 	static void userNameSearch(String name)
 	{
 		int i;
 		for(i=0;i<userNameList.length;i++)
 		{
 		   if(userNameList[i].equalsIgnoreCase(name))
 		   {
 		   	System.out.println("UserName "+name+" is present");
 		   	break;
 		   }

 		}
 		if(i==userNameList.length)
 			System.out.println("UserName "+name+" is not Present");
 	}

 }
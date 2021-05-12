import java.util.*;

/*
 * Write a java program to retrieve the player details based on the player id from the array of player objects.

You are provided with the class Player with private attributes such as int playerId, String playerName, int age, long phoneNumber 
with the necessary setters & getters and a four argument constructor.

Include a class PlayerUtility with the method public Player findPlayerDetailsById(Player[] arr, int playerIdToSearch) that accepts 
an array of player objects and playerId to be searched as an argument. This method should iterate the array of player objects and 
find the details of the player for the playerId passed as an argument and return the player object. If the playerId is not found 
then this method should return null.

In the Main class, you are provided with the main method and the details of the player added into the array.

You need to get the playerId to be searched and call the findPlayerDetailsById method and display the player details as shown in the sample input and output. 
If the returned value is null, then this method should display “No player found”.
 */
class Player 
{
     
 	private int playerId;
 	private String playerName;
 	private int age;
 	private long phoneNumber;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
    		this.playerName = playerName;
    	}
   	public int getAge() {
    		return age;
   	}
    	public void setAge(int age) {
    		this.age = age;
    	}
   	public long getPhoneNumber() {
    		return phoneNumber;
    	}
   	public void setPhoneNumber(long phoneNumber) {
    		this.phoneNumber = phoneNumber;
    	}
   	public Player(int playerId, String playerName, int age, long phoneNumber) {
    		super();
    		this.playerId = playerId;
    		this.playerName = playerName;
    		this.age = age;
    		this.phoneNumber = phoneNumber;
    	} 	
}
class PlayerUtility{
	public Player findPlayerDetailsById(Player[]arr, int playerIdToSearch)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getPlayerId() == playerIdToSearch)
			{
				return arr[i];
			}
		}
		
		return null;
	}
}
public class PlayerDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player[] pObj=new Player[4];
 		pObj[0]=new Player(146,"Athul",16,9876543210l);
 		pObj[1]=new Player(135,"Rakshana",16,9956231045l);
 		pObj[2]=new Player(168,"Christy",16,9856471230l);
 		pObj[3]=new Player(194,"Athulya",16,9768541230l);
		
	   System.out.println("Enter player id to be searched:");
	   int id = sc.nextInt();
	   
	   PlayerUtility found = new PlayerUtility();
	   Player player = found.findPlayerDetailsById(pObj,id);
	   if(player==null)
	   {
		   System.out.println("No player found");
	   }
	   else
	   {
		 	System.out.println("Name:"+player.getPlayerName());
   		    System.out.println("Phone number:"+player.getPhoneNumber());
	   }
	   

	}

}

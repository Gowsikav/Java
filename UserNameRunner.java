class UserNameRunner
{
	public static void main(String[] args) {
		UserName.saveUserNameToList("Raj");
		UserName.saveUserNameToList("Sam");
		UserName.saveUserNameToList("Ram");
		UserName.saveUserNameToList("John");
		UserName.saveUserNameToList("Pooja");
		UserName.saveUserNameToList("Priya");
		UserName.displayUserNames();
		UserName.userNameSearch("Ram");
		UserName.userNameSearch("Rahul");
	}
}
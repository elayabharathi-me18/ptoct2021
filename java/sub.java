class sub
{
	public static void main(String []args)
	{
		int a=25,b=40,c;
		c=a-b;
		int d=Integer.parseInt(args[0])-Integer.parseInt(args[1]);
		float e=Float.parseFloat(args[2])-Float.parseFloat(args[3]);
		System.out.println("constant: " + c);
		System.out.println("Integer : " + (Integer.parseInt(args[0])-Integer.parseInt(args[1])));
		System.out.println("Float : " + (Float.parseFloat(args[2])-Float.parseFloat(args[3])));
		System.out.println(d+" "+e+"=");
		System.out.println(d-e);
	}
}

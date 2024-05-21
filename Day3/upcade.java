class upcade
  {
	  public static void main(String args[])
	  {
		
		animals obj2=new birds();
		birds obj=(birds)obj2;
		obj.disp_ominivours("crow");
		obj.disp_herbivours("elephant");
		
	  }
  }
  class animals{
	  String h_animal,o_animal;
   public void  disp_herbivours(String h_animal)
	  {
		  System.out.println("herbivours "+h_animal);
	  }
	  public void disp_ominivours(String o_animal)
	  {
		  System.out.println("ominivours animal="+o_animal);
	  }
  }
  class birds extends animals{
	  String c_bird,o_bird;
	  public void disp_ominivours(String o_bird)
	  {
		  System.out.println("ominivours bird="+o_bird);
	  }
	  public void disp_carnivours(String c_bird)
	  {
		  System.out.println("carnivours"+c_bird);
	  }
  }
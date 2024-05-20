class log{
    int t_csales,t_cbooking,t_bsales,t_bbooking;
    String csale_by,bsale_by;
    log(int t_csales,int t_cbooking,String csale_by,int t_bsales,int t_bbooking,String bsale_by)
    {
        this.t_csales=t_csales;
        this.t_cbooking=t_cbooking;
        this.csale_by=csale_by;
        this.t_bsales=t_bsales;
        this.t_bbooking=t_bbooking;
        this.bsale_by=bsale_by;
    }
     public void  display_clog()
    {
      System.out.println("t_csales="+t_csales);
     
      System.out.println("t_cbooking="+t_cbooking);
      
      System.out.println("csale_by="+csale_by);


    }
    public void  display_blog()
    {
     
      System.out.println("t_bsales="+t_bsales);

      System.out.println("t_bbooking="+t_bbooking);

      System.out.println("bsale_by="+bsale_by);

    }

    }


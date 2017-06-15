package blurbs;

import interfaces.BlurbInterface;



public class Blurb implements BlurbInterface
{



  public Blurb() {
  
  }



  private boolean isBlurb(String blurb, int index) {
	    if(blurb.charAt(0) == 'y' || blurb.charAt(0) == 'q' || blurb.charAt(0) == 'd') {
	      return false;
	    }
	    
	    if(blurb.charAt(blurb.length() - 1) == 'd') {
	      return false;
	    }
	    
	    if(blurb.charAt(blurb.length() - 1) == 'z') {
	      return false;
	    }
	    
	    if(blurb.charAt(blurb.length() - 1) == 'q') {
	      return false;
	    }
	    
	    if(blurb.charAt(index) == 'x' && blurb.charAt(index + 1) == 'x') {
	      return false;
	    }
	    
	    if(blurb.charAt(index) == 'x' && blurb.charAt(index + 2) == 'x' && blurb.charAt(index + 1) != 'q') {
	      return false;
	    }
	    
	    if(blurb.charAt(index) == 'x' && blurb.charAt(index + 1) == 'y') {
	      return true;
	    }
	    if(blurb.charAt(index) == 'x') {
	      return true;
	    }
	    if (blurb.charAt(index) == 'q'){
	      if(index == 0) {
	        return false;
	      } else {
	        return true;
	      }
	    }
	    if (blurb.contains("xx")) {
	      return false;
	    }
	    if (blurb.charAt(index - 1) == 'x' && blurb.charAt(index) == 'q' && blurb.charAt(index + 1) == 'q') {
	      return true;
	    }
	    if (blurb.charAt(index) == 'x' && blurb.charAt(index + 1) == 'x') {
	      return false;
	    }
	    if (blurb.charAt(index) == 'd' || blurb.charAt(index) == 'z' && blurb.charAt(index + 1) == 'x') {
	      return true;
	    }
	    else {
	      return false;
	    }

	  }

	  @Override
	  public boolean isBlurb(String blurb)
	  {
	    return isBlurb(blurb, 0);
	  }

 



	  private String genWhoosit() {
		    String newWord = "x";
		    
		    int muchRandom = (int) (Math.random() * 20);
		    
//		    System.out.println(muchRandom);
		    
		    if(muchRandom % 2 == 0) {
		      newWord += "y";
		      muchRandom = (int) (Math.random() * 20);
		      return genWhoosit();
		    } else {
		      return newWord + genWhatsit();
		    }
		  }
		  
		  private String genWhatsit() {
		    String newWord = "q";
		    
		    int muchRandom = (int) (Math.random() * 30);
		    
		    if(muchRandom % 2 == 0) {
		      newWord += "d";
		      muchRandom = (int) (Math.random() * 30);
		      return genWhatsit();
		    } else if(muchRandom % 3 == 0) {
		      newWord += "z";
		      muchRandom = (int) (Math.random() * 30);
		      return genWhatsit();
		    }
		    else {
		      return newWord + genWhoosit();
		    }
		  }
		  
		  private String generateBlurbR() {
		    return genWhoosit();
		    
		    }


		  @Override
		  public String generateBlurb()
		  {
		    return generateBlurbR();
		  }

}


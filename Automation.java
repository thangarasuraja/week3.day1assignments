package org.assignment5;

public class Automation  extends MultipleLangauge implements Language,TestTool{

    //method from  Testtool interface
    public void Selenium() {
    	System.out.println("Selenium Method from Testtool interface");
		}
  //method from  Language interface
	public void Java() {
		System.out.println("Java Method from Language interface");
		}
	
	@Override
	public void ruby() {
		System.out.println("ruby unimplemented Method from Abstract class");
		
	}

	public static void main(String[] args) {
		
		Automation multilanguagemethods=new Automation();
		
		multilanguagemethods.python();
		
		multilanguagemethods.ruby();
		
		multilanguagemethods.Selenium();
		
		multilanguagemethods.Java();
		
		

	}


}

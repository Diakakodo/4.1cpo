public class ChaineCryptee
{
	private int decalage;
	private String enClair;
	public ChaineCryptee(String enCLair,int decalage)
    {
        // initialise instance variables
        this.enClair=enClair;
        this.decalage=decalage;
    }
    public String Decrypte()
    {
        return enClair;
    }
     public static char decaleCaractere ( char c , int decalage ) {
     return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage)%26 ) + 'A');
    }
    public String Crypte()
    {
		if (this.enClair == null){
			return "chaine vide"; 
		}else{
        String ch = "";
        int i;
        char c;
        for(i=0;i<enClair.length();i++)
           { c=decaleCaractere(enClair.charAt(i),this.decalage); 
             ch+= c;}
        return ch;
		}
	}
}

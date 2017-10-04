/**
 * Décrivez votre classe ChaineCryptee ici.
 *
 * @author (KETAM)
 * @version (02-10-2017)
 */
public class ChaineCryptee
{
	private int decalage;
	private String enCryptee;
	 /**
     * Constructeur d'objets de classe ChaineCryptee
     */
	private ChaineCryptee(String enClair, int decalage)
    {
        String str ="";
        char c;
        int i;
        //traitement de la chaine si null => la chaine chaineCryptee reste null 
        if(enClair != null) {
            for(i = 0; i < enClair.length(); i++) {
                c=decaleCaractere(enClair.charAt(i),this.decalage); 
                str+= c;
            }
        }
        this.enCryptee = str;
        this.decalage = decalage;
    }
    public String crypte()
    {
        return enCryptee;
    }
     public static char decaleCaractere ( char c , int decalage ) {
     return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage)%26 ) + 'A');
    }
    public String decrypte()
    {
        int i;
        String str ="";
        char c;
        for(i = 0; i < enCryptee.length(); i++) {
			
            c=(decaleCaractere(enCryptee.toUpperCase().charAt(i), - decalage));
            str+=c;
        }
        return str.toString();
    }
    
        public static ChaineCryptee deCryptee(String cryptee, int decalage) { 
        int i;
        String str ="";
        char c;
        if(cryptee != null) {
            for(i = 0; i < cryptee.length(); i++) {
                c=(decaleCaractere(cryptee.toUpperCase().charAt(i), - decalage));
                str+=c;
            }
        }
        ChaineCryptee chaine = new ChaineCryptee(str.toString(), decalage);
        return chaine;
    }
    public static ChaineCryptee deEnClair(String enclair, int decalage) {
        ChaineCryptee chaine = new ChaineCryptee(enclair, decalage);
        return chaine;
    }
    
}

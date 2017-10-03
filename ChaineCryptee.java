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
        // initialisation des variables d'instance
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
        StringBuilder str = new StringBuilder();
        int i;
        
        for(i = 0; i < enCryptee.length(); i++) {
            str.append(decaleCaractere(enCryptee.toUpperCase().charAt(i), - decalage));
        }
        return str.toString();
    }
    
        public static ChaineCryptee deCryptee(String cryptee, int decalage) { 
        
        StringBuilder str = new StringBuilder();
        int i;
        
        if(cryptee != null) {
            for(i = 0; i < cryptee.length(); i++) {
                str.append(decaleCaractere(cryptee.toUpperCase().charAt(i), - decalage));
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

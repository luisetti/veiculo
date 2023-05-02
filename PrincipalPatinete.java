public class PrincipalPatinete {
    
    public static void main(String args[]){
        Patinete patinete = new Patinete("scooter", "Light Two Dogs", "preto",2020);

        System.out.println(patinete.getMarca());
        System.out.println(patinete.getModelo());
        System.out.println(patinete.getCor());
        System.out.println(patinete.getAno());
    }
}

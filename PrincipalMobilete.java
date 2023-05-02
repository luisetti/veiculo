public class PrincipalMobilete {
    
    public static void main(String args[]){
        Mobilete mobilete = new Mobilete("Caloi", "mobylette Xr 50cc", "Fantasia",2011);

        System.out.println(mobilete.getMarca());
        System.out.println(mobilete.getModelo());
        System.out.println(mobilete.getCor());
        System.out.println(mobilete.getAno());
    }
}

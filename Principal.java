public class Principal {
    
    public static void main(String args[]){
        Bike bike = new Bike("Oggi", "Hacker Sport", "Azul e preta",2022);

        System.out.println(bike.getMarca());
        System.out.println(bike.getModelo());
        System.out.println(bike.getCor());
        System.out.println(bike.getAno());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
    
       Cliente cliente1 = new Cliente(20, "lucas");
       Cliente cliente2 = new Cliente(16, "Maria");

       System.out.println((cliente1.isAdulto() ? "Acesso permitido para " : "Acesso negado para ") + cliente1.getNome());
       System.out.println((cliente2.isAdulto() ? "Acesso permitido para " : "Acesso negado para ") + cliente2.getNome());
 }
}

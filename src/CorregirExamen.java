import java.util.ArrayList;
import entornos.examen.*;


public class CorregirExamen {

    /*
        Debéis crear un objeto de la clase que habéis creado que implemente Corregible, y añadirlo a la lista.
    
     */
    public static void main(String[] args) {

        //DEFINIR LA LISTA
        ArrayList<Corregible> lista = new ArrayList<Corregible>();

        // ZONA PARA CREAR OBJETOS Y AÑADIRLOS A LA LISTA
        RaulVE r= new RaulVE();
        lista.add(r);
        BryanESL b = new BryanESL();
        lista.add(b);
        JoseAntonioDP joseADP = new JoseAntonioDP();
        lista.add(joseADP);
        RafaelEO reo = new RafaelEO();
        lista.add(reo);
        JuanCarlosML jcml = new JuanCarlosML();
        lista.add(jcml);
        JavierSV jsv = new JavierSV();
        lista.add(jsv);
        
        AlejandroMB amb = new AlejandroMB();
        lista.add(amb);
        
        AlexAH a = new AlexAH();
        lista.add(a);
        
        CristianRR crr = new CristianRR();
        lista.add(crr);
        IñakiAr iar=new IñakiAr();
        lista.add(iar);
        // MOSTRAR EL CONTENIDO DE LA LISTA
        for (Corregible objeto : lista) {
            System.out.println(objeto.descripcion());
        }

    }

}

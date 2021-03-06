/**
 * SEPTIEMBRE
 */
public class TesAgenda
{
    private int numeroTestsFallados;

    /**
     * Constructor for objects of class TestArrayListInt
     */
    
    public TesAgenda()
    {   
        numeroTestsFallados = 0; //--es el atributo que funciona como contador.

        AgendaTelefonica agenda = new AgendaTelefonica(); //se crea un nuevo objeto de tipo ArrayList que llamo array.
        //testea es el mt() de abajo. en el que el 1º pmt. es el valor
        numeroTestsFallados += testea(null, agenda.lookupNumber("name"), "lookupNumber(String)");
        
        agenda.enterNumber( "name", "34");//comprobamos con la ageda cuando esta tiene datos, invocando al mt enterNumber(), 
                   //este mt almacena el nombre y el nº de tlf, ----- pasmos a comprobar si el dato que esperamos  "34",  
                  //coincide con el dato que retorna el mt.
        numeroTestsFallados += testea("34", agenda.lookupNumber("name"), "lookupNumber(String)");
            
                             //en el siguiente caso le pasamos un nombre que no está en la agenda, y esperamos un resultado 
                            //de null, los nombres de la agenda los conocemos de antemano
        numeroTestsFallados += testea(null, agenda.lookupNumber("xxx"), "lookupNumber(String)");
        //que esperamos, 2º prm es el valor que obtenemos, pues estamos invocando a un mt size() en este
        //caso y nos dará un valor. 3ºprm es informátivo, es el nombre del mt.
        //         numeroTestsFallados += testea(true, array.isEmpty(), "isEmpty()");
        //         array.clear();
        //         numeroTestsFallados += testea(0, array.size(), "clear()");
        //         
        //         array.add(1);
        //         array.add(3);
        //         numeroTestsFallados += testea(1, array.get(0), "add(int)");
        //         numeroTestsFallados += testea(3, array.get(1), "add(int)");
        //         
        //         numeroTestsFallados += testea(2, array.size(), "size()");    
        //         numeroTestsFallados += testea(false, array.isEmpty(), "isEmpty()");
        //         
        // 
        //         array.add(0, 0);
        //         numeroTestsFallados += testea(0, array.get(0), "add(int, int)"); 
        //         array.add(2, 2);
        //         numeroTestsFallados += testea(2, array.get(2), "add(int, int)"); 
        //         array.add(4, 4);
        //         numeroTestsFallados += testea(4, array.get(4), "add(int, int)"); 
        //         
        //         array.clear();
        //         numeroTestsFallados += testea(0, array.size(), "clear()");
        //         
        //         for (int i = 0; i < 10; i++) {
        //             array.add(i);
        //         }
        //         numeroTestsFallados += testea(10, array.size(), "size()");        
        //         
        //         numeroTestsFallados += testea(true, array.contains(5), "contains(int)");
        //         numeroTestsFallados += testea(true, array.contains(0), "contains(int)");
        //         numeroTestsFallados += testea(true, array.contains(9), "contains(int)");
        //         numeroTestsFallados += testea(false, array.contains(10), "contains(int)");
        // 
        //         numeroTestsFallados += testea(0, array.get(0), "get(int)");
        //         numeroTestsFallados += testea(5, array.get(5), "get(int)");
        //         numeroTestsFallados += testea(9, array.get(9), "get(int)");
        //         numeroTestsFallados += testea(-1, array.get(-1), "get(int)");
        //         numeroTestsFallados += testea(-1, array.get(10), "get(int)");
        //     
        //         array.set(0, 50);
        //         array.set(5, 55);        
        //         array.set(9, 59);
        //         numeroTestsFallados += testea(50, array.get(0), "set(int, int)");
        //         numeroTestsFallados += testea(55, array.get(5), "set(int, int)");        
        //         numeroTestsFallados += testea(59, array.get(9), "set(int, int)");        
        //     
        //         numeroTestsFallados += testea(10, array.size(), "size()");      
        //     
        //         numeroTestsFallados += testea(0, array.indexOf(50), "indexOf(int)");
        //         numeroTestsFallados += testea(5, array.indexOf(55), "indexOf(int)");
        //         numeroTestsFallados += testea(9, array.indexOf(59), "indexOf(int)");
        //         numeroTestsFallados += testea(-1, array.indexOf(100), "indexOf(int)");
        //           
        //         numeroTestsFallados += testea(50, array.remove(0), "remove(int)");
        //         numeroTestsFallados += testea(55, array.remove(4), "remove(int)");
        //         numeroTestsFallados += testea(59, array.remove(7), "remove(int)");
        //         numeroTestsFallados += testea(-1, array.remove(10), "remove(int)");
        //         numeroTestsFallados += testea(-1, array.remove(-1), "remove(int)");
        //         numeroTestsFallados += testea(-1, array.remove(8), "remove(int)");
        //         
        //         numeroTestsFallados += testea(7, array.size(), "size()"); 

        if (numeroTestsFallados == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + numeroTestsFallados + " tests!!!");
        }
    }

    public int testea(Object valorEsperado, Object valorObtenido, 
    String nombreFuncion)
    {
        int valorDevuelto = 0;
        if (valorEsperado == valorObtenido) {
            System.out.println("OK: " + nombreFuncion);
        }
        else {
            System.out.println("ERROR!!!!! " + nombreFuncion);
            System.out.println("Valor obtenido: " + valorObtenido + 
                " / Valor esperado: " + valorEsperado);
            valorDevuelto = 1;
        }
        return valorDevuelto;
    }

}
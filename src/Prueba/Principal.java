package Prueba;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		
		for (int i = 1; i < 2; ++i) {
		    System.out.println(i+")"+" Recibo de productos del proveedor");
		}

        //Mercados
		Mercados mercados0 = new Mercados("Lider"," Avenida Palomo", 832," 96219"," Macul"," +82179"," LiderCl@gmail.com");
		Mercados mercados1 = new Mercados("Jumbo"," Calle Pricipal", 855," 03710"," Las Condes"," +72189","JumboCl@gmail.com");
		
		//Empleados de la Empresa de Delivery
		Empleados empleados0 = new Empleados("Alfredo"," Sanchez"," 98609", 34," empaquetador");
		Empleados empleados1 = new Empleados("Juan"," Martin"," 27682", 30," empaquetador");
		Empleados empleados2 = new Empleados("Maria"," Antonella"," 43960", 25,"Delivery");
		Empleados empleados3 = new Empleados("Gabriel"," Olivares"," 78151", 31,"Delivery");
		
		//Proveedor
		Proveedor proveedor0 = new Proveedor("Whole Food Market"," +78251"," 73627"," Avenida NewYork","Lo Banechea");
		
		//Pedido
		pedido pedido0 = new pedido("24/02/22","03:40","04:20",null);
		pedido pedido1 = new pedido("17/02/22","01:20","02:00",null);
		//ArrayList del Pedido
	    ArrayList<String> cantidad_Pe = new ArrayList();
	    cantidad_Pe.add("10");//0
	    cantidad_Pe.add("20");//1
	    cantidad_Pe.add("50");//2
	    cantidad_Pe.add("30");//3
	    cantidad_Pe.add("15");//4
	    
		
		
	    //Productos
	    ArrayList<String> nombre_p = new ArrayList();
	    nombre_p.add("Lechugas");//0
	    nombre_p.add("Pimentones");//1
	    nombre_p.add("Cilantro");//2
	    nombre_p.add("Zanahorias");//3
	    nombre_p.add("Calabazines");//4
	    ArrayList<String> precio_p = new ArrayList();
		precio_p.add("40.000");//0
		precio_p.add("60.000");//1
	    ArrayList<String> cantidad = new ArrayList();
        cantidad.add("50");//0
        cantidad.add("70");//1
        cantidad.add("20");//2
        cantidad.add("30");//3
        cantidad.add("35");//4
        cantidad.add("0");//5
   
        System.out.println(proveedor0.getNombre_Pr()+" nos ha despachado unos productos que son "+nombre_p+ "que tenemos que repartir a los mercados locales"
        		+" que son "+mercados0.getNombre_M()+", "+mercados1.getNombre_M()+".");
        System.out.println("");
        System.out.println(mercados0.getNombre_M()+" pidio que le enviaramos "+cantidad_Pe.get(0)+" bolsas de "+nombre_p.get(3)+" y "+cantidad_Pe.get(2)+" "+nombre_p.get(4));
        System.out.println("y "+mercados1.getNombre_M()+" nos pidio que le enviaramos a su local en"+mercados1.getComuna_M()+" "+cantidad_Pe.get(1)+" "+nombre_p.get(2)+"s"+", "
        +cantidad_Pe.get(4)+" "+nombre_p.get(1)+" y "+"todo el stock de "+nombre_p.get(0)+".");
        System.out.println("");
        System.out.println("");
        
        for (int o = 2; o < 3; ++o) {
		    System.out.println(o+")"+" Envio de productos");
		}
        System.out.println(empleados0.getNombre()+", "+empleados1.getNombre()+" se encargan de empaquetar y se lo entregaran a "+empleados2.getNombre()+" y "+empleados3.getNombre());
        System.out.println("ya que se encargaran de hacer la entrega en sus repectivos lugares.");
        
        System.out.println("");
        System.out.println("");
        
        for (int q = 3; q < 4; ++q) {
		    System.out.println(q+")"+" Informacion del pedido de "+mercados0.getNombre_M());
		}
        System.out.println("");
        System.out.println("Cliente y numero: "+mercados0.getNombre_M()+mercados0.getTelfono());
        System.out.println("Ubicacion y Comuna:"+mercados0.getUbicacion_M()+" en la comuna de"+mercados0.getComuna_M());
        System.out.println("Salida del pedido: "+pedido0.getHora_de_salida());
        System.out.println("Hora estimada de llegada: "+pedido0.getHora_de_llegada());
        System.out.println("Productos que se entregaran: "+cantidad_Pe.get(0)+" bolsas de "+nombre_p.get(3)+" y "+cantidad_Pe.get(2)+" "+nombre_p.get(4));
        System.out.println(empleados2.getPuesto_de_trabajo()+": "+empleados2.getNombre()+empleados2.getApellido()+" /Rut:"+empleados2.getRut());
        System.out.println("Pago Total: "+precio_p.get(0));
        
        System.out.println("");
        System.out.println("");
        
        for (int a = 4; a < 5; ++a) {
		    System.out.println(a+")"+" Informacion del pedido de "+mercados1.getNombre_M());
		}
        System.out.println("");
        System.out.println("Cliente y numero: "+mercados1.getNombre_M()+mercados1.getTelfono());
        System.out.println("Ubicacion y Comuna:"+mercados1.getUbicacion_M()+" en la comuna de"+mercados1.getComuna_M());
        System.out.println("Salida del pedido: "+pedido1.getHora_de_salida());
        System.out.println("Hora estimada de llegada: "+pedido1.getHora_de_llegada());
        System.out.println("Productos que se entregaran: "+cantidad_Pe.get(1)+" "+nombre_p.get(2)+"s"+", "+cantidad_Pe.get(4)+" "+nombre_p.get(1)+" y "+cantidad.get(0)+" "+nombre_p.get(0));
        System.out.println(empleados3.getPuesto_de_trabajo()+": "+empleados3.getNombre()+empleados3.getApellido()+" /Rut:"+empleados3.getRut());
        System.out.println("Pago Total: "+precio_p.get(1));
        
        System.out.println("");
        System.out.println("");
        
        for (int a = 4; a < 5; ++a) {
		    System.out.println(a+")"+"Cantidad de Productos que sobraron");
		}
        System.out.println(cantidad.get(4)+" "+nombre_p.get(2));
        System.out.println(cantidad.get(3)+" "+nombre_p.get(3));
        System.out.println(cantidad.get(2)+" "+nombre_p.get(4));
        System.out.println(cantidad.get(1)+" "+nombre_p.get(1));
	    System.out.println(cantidad.get(5)+" "+nombre_p.get(0));
}
}
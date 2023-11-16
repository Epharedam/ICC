public class Main {
  public static void main(String[] args) {
    
    //Persona que tiene 50 ajolopesos y no tiene Perrito o Gatito
    Persona juan = new Persona("Juan", 25, 50);

    //Perrito de nombre samy
    Perrito samy = new Perrito("Samy", 7);

    //Persona que solo tiene un perrito, para ello previamente se hizo el perrito
    Persona tanis = new Persona("Tania", 25, 100, samy);

    //Gatito de nombre aceituno
    Gatito aceituno =  new Gatito("Aceituno", 10);

    //Persona que solo tiene un gatito, para ello previamente se hizo el gatito
    //ademas no tiene dinero :(
    Persona diana = new Persona("Diana", 25, 0, aceituno);

    //Perrito y gatito
    Perrito firulais = new Perrito("Blanquita", 15);
    Gatito naranjo  = new Gatito("Naranjo", 8);

    //Persona que tiene perrito y gatito, para ello previamente se hicieron 
    //el perrito y gatito
    Persona rubi = new Persona("Rubi", 25, 200, firulais, naranjo);
        
    /** Aqui podemos ver las personas con sus respectivos 
     * perritos y gatitos
     */
    System.out.println(juan);
    System.out.println("\n");
    System.out.println(tanis);
    System.out.println("\n");
    System.out.println(diana);
    System.out.println("\n");
    System.out.println(rubi);


    //Crea y asigna y nuevo perrito para juan
    Perrito perritoJuan = new Perrito("Juanito", 2);
    juan.setPerrito(perritoJuan);



    //muestra que juan tiene un nuevo perrito
    System.out.println("\n");
    System.out.println(juan);

    
    //crea y asigna un nuevo gatito para juan
    Gatito gatitoJuan = new Gatito("Juanita", 3);
    juan.adoptarGatito(gatitoJuan);
    
    //muestra que juan tiene un nuevo gatito
    System.out.println("\n");
    System.out.println(juan);

    //vacuna al perrito de Tanis y al gatito de Diana
    tanis.getPerrito().setVacunado(true);
    diana.getGatito().setVacunado(true);

    //muestra que el perrito de Tanis y el gatito de Diana estan vacunados
    System.out.println("\n-------------------------------------\n\tSe vacunaron\t\n-------------------------------------");
    System.out.println(tanis+"\n");
    System.out.println(diana);

    System.out.println("\n-------------------------------------\n\tChambeanding...\t\n-------------------------------------");
    //haz que Diana, Tanis y Rubi chambeen
    System.out.println("\n"+diana.getNombre()+" "+diana.chambear());
    System.out.println(tanis.getNombre()+" "+tanis.chambear());
    System.out.println(rubi.getNombre()+" "+rubi.chambear());

    // Muestra que Diana, Tanis y Rubi generaron dinero gracias a la chamba
    System.out.println("\n-------------------------------------\n\t Resultado de la chamba \t\n-------------------------------------");
    System.out.println("Ajolopesos de "+diana.getNombre()+" -> "+diana.getDinero());
    System.out.println("Ajolopesos de "+tanis.getNombre()+" -> "+tanis.getDinero());
    System.out.println("Ajolopesos de "+rubi.getNombre()+" -> "+rubi.getDinero());

    System.out.println("\n-------------------------------------\n\tJUGUETES NUEVOS\t\n-------------------------------------");
    // Crea al menos 3 juguetes diferentes
    // (Estos se mostraran de manera automatica)
    Juguete peluche = new Juguete("Osito",50);
    Juguete peluche1 = new Juguete("Huesito",30);
    Juguete estambre = new Juguete("Bolita",40);

    System.out.println(peluche);
    System.out.println(peluche1);
    System.out.println(estambre);

    // asigna el primer juguete al perrito de juan
    // el segundo juguete al perrito de Tanis
    //el tercer juguete al gatito de rubi
    juan.comprarJuguetePerrito(peluche);
    tanis.comprarJuguetePerrito(peluche1);
    rubi.comprarJugueteGatito(estambre);

    // Muestra que Juan, Tanis y Rubi tienen un juguete para su perrito y gatito
    System.out.println("\n------------------------------------------\n\tMascotas con nuevos juguetes\t\n------------------------------------------");
    System.out.println(juan+"\n");
    System.out.println(tanis+"\n");
    System.out.println(rubi+"\n");

    //Se agrega un juguete al gato de Diana y al de Rubi
    diana.comprarJugueteGatito(estambre);
    rubi.comprarJuguetePerrito(peluche);

    // Haz que el gatito de Diana y el perrito de Rubi jueguen con su juguete
    System.out.println(diana.getGatito().jugar());
    System.out.println(rubi.getPerrito().jugar());

    //Muestra los cambios de energia de los perritos y gatitos de Diana y Rubi
    System.out.println("\n------------------------------------------------\n\tEnergía de las mascotas de Diana y Rubi\t\n-------------------------------------------------");
    System.out.println(diana+"\n");
    System.out.println(rubi+"\n");


    // !----- en caso de tener clases extra, puedes probarlas aqui-----!
    // Crea un objeto por cada clase que tengas

     System.out.println("\n------------------------------------------------\n\tClase extra\t\n-------------------------------------------------");
      Pajarito xiao = new Pajarito("Xiao", 2, "Turquesa");
    
      xiao.cantar();

      // Mostrar información sobre pajarito 
      System.out.println(xiao);
     
      int totalNidos = Pajarito.getnidos();
      System.out.println("Total de nidos: " + totalNidos);
  

    
  }
}

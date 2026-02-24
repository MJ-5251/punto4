public class base {

    public objTeatro[][] ordenP(objTeatro[][] m){

    for(int i = 0; i < m.length; i++){  
        for(int j = 0; j < m[i].length - 1; j++){
            for(int k = 0; k < m[i].length - 1; k++){

                if(m[i][k].getPrecio() > m[i][k+1].getPrecio()){

                   
                    objTeatro aux = m[i][k];
                    m[i][k] = m[i][k+1];
                    m[i][k+1] = aux;
                }
            }
        }
    }

    return m;
}
 public void mostrarTeatro(objTeatro[][] m){

        for(int i = 0; i < m.length; i++){

            System.out.println("Fila " + i + ":");

            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j].getPrecio() + "  ");
            }

            System.out.println();
        }
    }
}


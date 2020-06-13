import javax.swing.JOptionPane;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Escriba su nombre");
        System.out.println("Hola "+nombre);
        JOptionPane.showMessageDialog(null, nombre);
        
        int edad = 12;
        
        //condición if
        if(edad>=18){
            System.out.println("Puede votar");
        }//fin if
        else{
            System.out.println("No puede votar");
        }//fin else
        
        //llamar al método diasEnElMes
        diasEnElMes(2);
        
        //llamar al método diaDeLaSemana
        diaDeLaSemana(2);
        
    }//fin del metodo main
    
//creación de un método diferente al main
public static void diasEnElMes(int mes){
    if(mes==1||mes==3||mes==5||mes==7
            ||mes==8||mes==10||mes==12){
        System.out.println("Hay 31 días en el mes");
    }//fin if
    else if(mes==2){
        System.out.println("Normalmente hay 28 días");
    }//fin else-if
    else if(mes==4||mes==6||mes==9||mes==11){
        System.out.println("Hay 30 días en el mes");
    }//fin else-if
    else{
        System.out.println("Mes no corresponde");
    }//fin else
}//fin del metodo diasEnElMes    
    
public static void diaDeLaSemana(int d){
    if(d==1){
        System.out.println("Domingo");
    }//fin if
    else if(d==2){
        System.out.println("Lunes");
    }//fin else-if
    else if(d==3){
        System.out.println("Martes");
    }//fin else-if
    else if(d==4){
        System.out.println("Miércoles");
    }//fin else-if
    else if(d==5){
        System.out.println("Jueves");
    }//fin else-if
    else if(d==6){
        System.out.println("Viernes");
    }//fin else-if
    else if(d==7){
        System.out.println("Sábado");
    }//fin else-if
    else{
        System.out.println("Dia no corresponde");
    }//fin else
}//fin del metodo diasEnLaSemana

public static void diaSemanaSwitch(int dia){
    switch(dia){
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Lunes");
            break;    
        case 3:
            System.out.println("Martes");
            break;
        case 4:
            System.out.println("Miércoles");
            break;
        case 5:
            System.out.println("Jueves");
            break;
        case 6:
                System.out.println("Viernes");
            break;
        case 7:
            System.out.println("Sábado");
            break;    
        default:
            System.out.println("El día no corresponde");
            
    }//fin del switch
    
}//fin del metodo diaSemanaSwitch

}//fin de la clase Principal

package academy.devdojo.maratonajava.introducao;

public class ExercTabelaVerdade {
    public static void main(String[] args) {

        double salary = 85000.0;
        if(salary < 30000){
            System.out.println("Tax: "+ salary * 0.097);
        } else if (salary >= 30000 && salary < 70000){
            System.out.println("Tax: "+salary * 0.3735);
        }else{
            System.out.println("Tax: "+salary * 0.4950);
        }

    }
}

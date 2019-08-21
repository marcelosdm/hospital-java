/**
 * TestaInternacao
 */
public class TestaInternacao {

  public static void main(String[] args) {
    Paciente p1 = new Paciente();

    p1.setNome("José da Silva");
    System.out.println(p1.getNome());

    System.out.println("Este paciente está internado? " + p1.isInternado());

    p1.setInternado(p1.internado);
    System.out.println("Realizada internação.");
    System.out.println("Este paciente está internado? " + p1.isInternado());

    p1.setAlta();
    System.out.println("Realizada a alta");
    System.out.println("Este paciente está internado? " + p1.isInternado());

  }
}
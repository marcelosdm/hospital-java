/**
 * Paciente
 */
public class Paciente extends Pessoa {

  public boolean internado;

  public boolean isInternado() {
    return internado;
  }

  public boolean setAlta() {
    return internado = false;
  }

  public void setInternado(boolean internado) {
    this.internado = true;
  }

}
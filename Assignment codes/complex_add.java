public class complex_add {
  double real, imag;

  public complex_add() {
    real = 0;
    imag = 0;
  }

  public complex_add(double r, double i) {
    real = r;
    imag = i;
  }

  public void add(complex_add n1, complex_add n2) {
    complex_add temp = new complex_add();
    temp.real = n1.real + n2.real;
    temp.imag = n1.imag + n2.imag;

    System.out.printf("sum = %.1f + %.1f i", temp.real, temp.imag);
  }

  public static void main(String[] args) {
    complex_add n1 = new complex_add(10, 4),
        n2 = new complex_add(21, 5);
    complex_add c = new complex_add();
    c.add(n1, n2);
  }
}
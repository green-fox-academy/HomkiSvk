package day3.printalbeInterface;

public record Domino(int left, int right) implements Printable {

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + this.left + ", B side: " + this.right);
    }
}

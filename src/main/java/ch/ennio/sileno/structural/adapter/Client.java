package ch.ennio.sileno.structural.adapter;

public class Client {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rPeg = new RoundPeg(5);
        System.out.println(hole.fits(rPeg));
        System.out.println("-----");

        SquarePeg smallSPeg = new SquarePeg(5);
        SquarePeg largeSPeg = new SquarePeg(10);

        // hole.fits(smallSPeg) incompatible types -> does not compile

        SquarePegAdapter smallSPegAdapter = new SquarePegAdapter(smallSPeg);
        SquarePegAdapter largeSPegAdapter = new SquarePegAdapter(largeSPeg);
        System.out.println(hole.fits(smallSPegAdapter));
        System.out.println(hole.fits(largeSPegAdapter));
    }
}

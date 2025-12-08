import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a DNA sequence: ");
        String seq = input.nextLine();

        DNASequence dna = new DNASequence(seq);

        if (!dna.validDNA()) {
            System.out.println("Invalid DNA sequence. Must contain only A, T, C, G.");
            return;
        }

        System.out.println("Original DNA: " + dna.getSequence());
        System.out.println("mRNA Sequence: " + dna.transcribeDNA());
        System.out.println("Contains start codon (AUG)? " + dna.containsStartCodon());

        int[] counts = dna.nucleotideCount();
        System.out.println("Nucleotide Count (A,T,C,G): " + Arrays.toString(counts));

        System.out.println("Codons: " + Arrays.toString(dna.splitCodons()));

        input.close();
    }
}
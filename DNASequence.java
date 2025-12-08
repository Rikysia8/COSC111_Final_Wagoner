public class DNASequence {
    
    private String sequence;

    public DNASequence(String sequence) {
        this.sequence = sequence.toUpperCase();
    }

    public String getSequence() {
        return sequence;
    }

    // Check that sequence contains ONLY A, T, C, G
    public boolean validDNA() {
        for (char c : sequence.toCharArray()) {
            if (c != 'A' && c != 'T' && c != 'C' && c != 'G') {
                return false;
            }
        }
        return true;
    }

    // Transcription rules:
    // A -> U, T -> A, C -> G, G -> C
    public String transcribeDNA() {
        StringBuilder rna = new StringBuilder();

        for (char c : sequence.toCharArray()) {
            switch (c) {
                case 'A': rna.append("U"); break;
                case 'T': rna.append("A"); break;
                case 'C': rna.append("G"); break;
                case 'G': rna.append("C"); break;
            }
        }
        return rna.toString();
    }

    // Count A, T, C, G frequencies
    // returns array: [A, T, C, G]
    public int[] nucleotideCount() {
        int[] count = new int[4];

        for (char c : sequence.toCharArray()) {
            if (c == 'A') count[0]++;
            else if (c == 'T') count[1]++;
            else if (c == 'C') count[2]++;
            else if (c == 'G') count[3]++;
        }
        return count;
    }

    // Split RNA into codons (groups of 3)
    public String[] splitCodons() {
        String rna = transcribeDNA();
        int codonCount = rna.length() / 3;

        String[] codons = new String[codonCount];

        for (int i = 0; i < codonCount; i++) {
            codons[i] = rna.substring(i * 3, i * 3 + 3);
        }
        return codons;
    }

    public boolean containsStartCodon() {
        String rna = transcribeDNA();
        return rna.contains("AUG");
    }
}


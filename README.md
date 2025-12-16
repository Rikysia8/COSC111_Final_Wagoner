DNA Sequence Analyzer

Overview

  The DNA Sequence Analyzer is a Java program that allows users to analyze a DNA sequence using object-oriented programming principles. The program validates a DNA sequence, transcribes DNA into RNA, counts nucleotide frequencies, splits RNA into codons, and checks for the presence of a start codon.

  This project was created for COSC 111 as a final project to demonstrate understanding of classes, methods, control structures, and user input handling.


Features
	•	Menu-driven user interface
	•	DNA sequence validation (A, T, C, G ) only
	•	DNA to RNA transcription using complementary base-pair rules
	•	Nucleotide frequency counting
	•	RNA codon splitting
	•	Start codon (AUG) detection
	•	Error handling for invalid input

Structure
  DNASequenceAnalyzer/
  │
  ├── Main.java          // Contains main method and menu logic
  ├── DNASequence.java   // Student-defined class for DNA processing
  ├── UML_Diagram.png    // UML class diagram
  ├── Reflection.docx    // Project reflection
  └── README.md
  
How to Run 
	1.	Open the project in a Java-compatible IDE 
	2.	Ensure that both Main.java and DNASequence.java are in the same directory
	3.	Compile and run Main.java 
	4.	Follow the menu prompts to interact with the program

Object-Oriented Design
  The program uses two classes:
	  •	DNASequence: Handles DNA validation, transcription, nucleotide counting, codon splitting, and start codon detection
	  •	Main: Handles user input, menu navigation, and output display

Technologies Used
	•	Java
	•	VS code
	•	GitHub

Example Output
  === DNA Sequence Analyzer ===
1. Enter DNA Sequence
2. Validate DNA
3. Transcribe DNA to RNA
4. Display Nucleotide Count
5. Display Codons
6. Check for Start Codon (AUG)
7. Exit
Choice: 1 (input)
Enter DNA sequence (output): ATGCTA (input)
DNA sequence saved. (output)

=== DNA Sequence Analyzer === (output)
1. Enter DNA Sequence
2. Validate DNA
3. Transcribe DNA to RNA
4. Display Nucleotide Count
5. Display Codons
6. Check for Start Codon (AUG)
7. Exit
Choice: 3 (input)
RNA: UACGAU (output)


Author
  Rikysia Wagoner
  COSC 111 – Final Project

  

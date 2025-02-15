package Entities;

public class Aluno {
	public String name;
	public double n1;
	public double n2;
	public double n3;

	public double finalNote() {
		return n1 + n2 + n3;
	}

	public double missing() {
		return 60 - finalNote();
	}

}

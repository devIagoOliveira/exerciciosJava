package entities;

import java.util.Objects;

public class Student {

	private Integer codeStudent;

	public Student(Integer codeStudent) {
		this.codeStudent = codeStudent;
	}

	public Integer getCodeStudent() {
		return codeStudent;
	}

	public void setCodeStudent(Integer codeStudent) {
		this.codeStudent = codeStudent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codeStudent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(codeStudent, other.codeStudent);
	}

}
